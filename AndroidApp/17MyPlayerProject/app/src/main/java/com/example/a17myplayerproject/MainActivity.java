package com.example.a17myplayerproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mainDrawerLayout;
    private LinearLayoutManager linearLayoutManager;
    private FragmentPagerAdapter fragmentPagerAdapter;
    private ViewPager viewPager;
    LinearLayout drawerMenu, drawerMenuInfo;

    private ImageView ivArtistDrawerMenuInfo;
    private TextView tvArtistDrawerMenuInfo, tvTitleDrawerMenuInfo,
            tvAlbumDrawerMenuInfo, tvGenreDrawerMenuInfo, tvReleseDateDrawerMenuInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]
                {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        viewPager = findViewById(R.id.viewPager);
        mainDrawerLayout = findViewById(R.id.mainDrawerLayout);
        drawerMenu = findViewById(R.id.drawerMenu);

        drawerMenuInfo = findViewById(R.id.drawerMenuInfo);
        ivArtistDrawerMenuInfo = findViewById(R.id.ivArtistDrawerMenuInfo);
        tvArtistDrawerMenuInfo = findViewById(R.id.tvArtistDrawerMenuInfo);
        tvTitleDrawerMenuInfo = findViewById(R.id.tvTitleDrawerMenuInfo);
        tvAlbumDrawerMenuInfo = findViewById(R.id.tvAlbumDrawerMenuInfo);
        tvGenreDrawerMenuInfo = findViewById(R.id.tvGenreDrawerMenuInfo);
        tvReleseDateDrawerMenuInfo = findViewById(R.id.tvReleseDateDrawerMenuInfo);

        GlobalActivity.myHelper = new myDBHelper(this);
        loadAudio();
        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
        mainDrawerLayout.setDrawerListener(listener);

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
                String artist = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
                String title = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
                long mDuration = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
                String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
                long albumId = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));
                long track_id = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media._ID));
                String released_day = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.YEAR));
                String datapath = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));

                System.out.println("mId = " + track_id + " albumId = " + albumId + " title : "
                        + title + " album : " + album + " artist: " + artist + " 총시간 : " + mDuration + " data : " + datapath);


//                Uri sArtworkUri = Uri
//                        .parse("content://media/external/audio/albumart");
//                Uri albumArtUri = ContentUris.withAppendedId(sArtworkUri, albumId);
//
//                Log.d("테스트",albumArtUri.toString());
                Bitmap bitmap = null;
//                try {
//                    bitmap = MediaStore.Images.Media.getBitmap(
//                            contentResolver, albumArtUri);
//                    bitmap = Bitmap.createScaledBitmap(bitmap, 30, 30, true);
//
//                } catch (FileNotFoundException exception) {
//                    exception.printStackTrace();
//                    bitmap = BitmapFactory.decodeResource(getResources(),
//                            R.drawable.img01);
//                } catch (IOException e) {
//
//                    e.printStackTrace();
//                }

                GlobalActivity.arrayList.add(new MyDB(artist, title, mDuration, album,albumId, "장르"
                        , released_day, datapath));

            } while (cursor.moveToNext());
        }
        cursor.close();
    }


    @Override
    public void onBackPressed() {
        Log.i("테스트", "onBackPressed 1");
        long currentTime = System.currentTimeMillis();
        long gapTime = currentTime - GlobalActivity.backButtonTime;

        if (gapTime >= 0 && gapTime <= 2000) {
            Log.i("테스트", "onBackPressed 2");
            super.onBackPressed();
        } else {
            GlobalActivity.backButtonTime = currentTime;
            Toast.makeText(this, "2초이내 두번 누르면 나감", Toast.LENGTH_LONG).show();
        }

    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {

        //슬라이딩을 시작할 때 이벤트
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            tvArtistDrawerMenuInfo.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
            tvTitleDrawerMenuInfo.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());
            tvAlbumDrawerMenuInfo.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtAlbum());
            tvGenreDrawerMenuInfo.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtGenre());
            tvReleseDateDrawerMenuInfo.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtReleseDate());
            //Toast.makeText(getApplicationContext(),"sliding", Toast.LENGTH_LONG).show();
        }

        //메뉴를 열었을 때 이벤트
        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
            Toast.makeText(getApplicationContext(), "opening", Toast.LENGTH_LONG).show();
        }

        //메뉴를 닫았을 때 이벤트
        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
            Toast.makeText(getApplicationContext(), "closing", Toast.LENGTH_LONG).show();
        }

        //메뉴가 상태가 바뀌었을 때 이벤트
        @Override
        public void onDrawerStateChanged(int newState) {
            //Toast.makeText(getApplicationContext(),"changing", Toast.LENGTH_LONG).show();
        }
    };
}

