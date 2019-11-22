package com.example.a17myplayerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MainAdapter mainAdapter;
    private LinearLayoutManager linearLayoutManager;
    private FrameLayout framlayout;
    private LinearLayout layoutPlay;
    private RecyclerView recyclerView;
    private ImageButton imgProfile;
    private TextView txtTitle, txtArtist;
    private SeekBar sbMP3;

    MediaPlayer mPlayer;


    FragmentTransaction ft =
            getSupportFragmentManager().beginTransaction();
    Fragment fragmentActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]
                {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        Log.i("테스트", "onCreate 1");

        framlayout = findViewById(R.id.framlayout);
        layoutPlay = findViewById(R.id.layoutPlay);
        recyclerView = findViewById(R.id.recyclerView);
        imgProfile = findViewById(R.id.imgProfile);
        txtTitle = findViewById(R.id.txtTitle);
        txtArtist = findViewById(R.id.txtArtist);
        sbMP3 = findViewById(R.id.sbMP3);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        GlobalActivity.myHelper = new myDBHelper(this);
//        playListSet();
        loadAudio();

        mainAdapter = new MainAdapter(GlobalActivity.arrayList);
        recyclerView.setAdapter(mainAdapter);


        Thread thread = new Thread() {
            @Override
            public void run() {

                while (true) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            txtArtist.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
                            txtTitle.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());

                        }
                    });
                    SystemClock.sleep(200);
                }

            }
        };
        thread.start();

        imgProfile.setOnClickListener(this);
        layoutPlay.setOnClickListener(this);

    }

    private void loadAudio() {
        ContentResolver contentResolver = getContentResolver();

        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String selection = MediaStore.Audio.Media.IS_MUSIC + "!= 0";
        String sortOrder = MediaStore.Audio.Media.TITLE + " ASC";
        Cursor cursor = contentResolver.query(uri, null, selection, null, sortOrder);
        cursor.moveToFirst();
        System.out.println("음악파일 개수 = " + cursor.getCount());
        if (cursor != null && cursor.getCount() > 0) {
            do {
                long track_id = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media._ID));
                long albumId = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));
                String title = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
                String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
                String artist = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
                long mDuration = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
                String datapath = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));
                System.out.println("mId = " + track_id + " albumId = " + albumId + " title : "
                        + title + " album : " + album + " artist: " + artist + " 총시간 : " + mDuration + " data : " + datapath);

                GlobalActivity.arrayList.add(new MyDB(artist, title, mDuration, album, "장르"
                        , "발매일", R.drawable.img01, datapath));

            } while (cursor.moveToNext());
        }
        cursor.close();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layoutPlay:
                fragmentActivity = new Fragment_Play();
                ft.replace(R.id.framlayout, fragmentActivity);
                ft.commit();
                break;

            case R.id.imgProfile:
                if (GlobalActivity.PLAY == false) {
                    playSetting();
                } else {
                    if (GlobalActivity.PAUSED == false) {
                        mPlayer.pause();
                        imgProfile.setImageResource(R.mipmap.song_play);
                        GlobalActivity.PAUSED = true;
                    } else {
                        mPlayer.start();
                        GlobalActivity.PAUSED = false;
                        imgProfile.setImageResource(R.mipmap.song_pause);
                    }
                }
                break;
        }

    }

    private void playSetting() {
        try {
            mPlayer = new MediaPlayer();
            mPlayer.setDataSource(GlobalActivity.arrayList.get(GlobalActivity.position).getFilePath());
            //mPlayer.setDataSource(“/sdcard/” + selectedMP3);두개중 한 개 선택할 것

            mPlayer.prepare();
            mPlayer.start();
            imgProfile.setImageResource(R.mipmap.song_pause);
            GlobalActivity.PLAY = true;

            Thread thread = new Thread() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

                @Override
                public void run() {
                    if (mPlayer == null) {
                        return;
                    } else {
                        //스레드 안에서는 위젯값을 바꾸면 안된다. runOnUiThread를 사용해야함
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                //1. 노래 총 시간
                                sbMP3.setMax(mPlayer.getDuration());
                                sbMP3.setMin(0);
                            }
                        });

                    }
                    while (mPlayer.isPlaying()) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                GlobalActivity.currentDuration = mPlayer.getCurrentPosition();
                                sbMP3.setProgress(GlobalActivity.currentDuration);
//                                tvTime.setText(selectedMP3+"진행시간 : "+
//                                        simpleDateFormat.format(mPlayer.getCurrentPosition()));
                            }
                        });//end of runOnUiThread() 스레드 안에서 화면위젯변경을 할 수 있는 스레드
                        SystemClock.sleep(200);
                    }//end of while


                    GlobalActivity.PLAY = false;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imgProfile.setImageResource(R.mipmap.song_play);
                            sbMP3.setProgress(0);
                        }
                    });

                }
            };
            thread.start();

        } catch (IOException e) {
        }
    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        long gapTime = currentTime - GlobalActivity.backButtonTime;

        if (gapTime >= 0 && gapTime <= 2000) {
            super.onBackPressed();
        } else {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            GlobalActivity.backButtonTime = currentTime;
            Toast.makeText(this, "2초이내 두번 누르면 나감", Toast.LENGTH_LONG).show();
        }

    }
}

