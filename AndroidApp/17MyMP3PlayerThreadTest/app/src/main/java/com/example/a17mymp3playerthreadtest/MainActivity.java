package com.example.a17mymp3playerthreadtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    ListView listViewMP3;
    Button btnPlay, btnPause, btnStop;
    TextView tvMP3, tvTime;
    ProgressBar pbMP3;
    SeekBar sbMP3;


    MediaPlayer mPlayer;

    // SDCard의 파일을 읽어서 리스트뷰에 출력
    ArrayList<String> mp3List = new ArrayList<String>(); // 가변적 문자열
    String selectedMP3;

    final String MP3_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
    boolean PAUSED = false; // 음악이 일시정지 중인지 체크.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 MP3 플레이어(개선)");

        listViewMP3 = (ListView) findViewById(R.id.listViewMP3);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStop = (Button) findViewById(R.id.btnStop);
        tvMP3 = (TextView) findViewById(R.id.tvMP3);
        tvTime = (TextView) findViewById(R.id.tvtime);
        pbMP3 = (ProgressBar) findViewById(R.id.pbMP3);
        sbMP3 = (SeekBar) findViewById(R.id.sbMP3);

        ActivityCompat.requestPermissions(this, new String[]
                {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        File[] listFiles = new File(MP3_PATH).listFiles();
        //File[] listFiles = new File(“/sdcard/”).listFiles();두개중 한 개 선택

        String fileName, extName;
        for (File file : listFiles) {
            fileName = file.getName();
            extName = fileName.substring(fileName.length() - 3);
            if (extName.equals("mp3")|extName.equals("mp4")) // 확장명이 mp3일 때만 추가함.
            {
                mp3List.add(fileName);
            }
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, mp3List);
        listViewMP3.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listViewMP3.setAdapter(adapter);
        listViewMP3.setItemChecked(0, true);

        listViewMP3
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View arg1,
                                            int arg2, long arg3) {
                        selectedMP3 = mp3List.get(arg2);
                    }
                });
        selectedMP3 = mp3List.get(0);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mPlayer = new MediaPlayer();
                    mPlayer.setDataSource(MP3_PATH + selectedMP3);
//mPlayer.setDataSource(“/sdcard/” + selectedMP3);두개중 한 개 선택할 것

                    mPlayer.prepare();
                    mPlayer.start();
                    btnPlay.setClickable(false);
                    btnPause.setClickable(true);
                    btnStop.setClickable(true);
                    tvMP3.setText("실행중인 음악 :  " + selectedMP3);

                    Thread thread = new Thread(){
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
                        @Override
                        public void run() {
                            if(mPlayer==null){
                                return;
                            }else {
                                //스레드 안에서는 위젯값을 바꾸면 안된다. runOnUiThread를 사용해야함
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        //1. 노래 총 시간
                                        tvTime.setText(selectedMP3+" 재생시간 : "+mPlayer.getDuration());
                                        sbMP3.setMax(mPlayer.getDuration());
                                        sbMP3.setMin(0);
                                    }
                                });

                            }
                            while (mPlayer.isPlaying()){
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        sbMP3.setProgress(mPlayer.getCurrentPosition());
                                        tvTime.setText(selectedMP3+"진행시간 : "+
                                                simpleDateFormat.format(mPlayer.getCurrentPosition()));
                                    }
                                });//end of runOnUiThread() 스레드 안에서 화면위젯변경을 할 수 있는 스레드
                                SystemClock.sleep(200);

                            }//end of while

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    btnPlay.setClickable(true);
                                    btnPause.setClickable(false);
                                    sbMP3.setProgress(0);
                                    tvTime.setText(selectedMP3+"진행시간 : 0");
                                }
                            });

                        }
                    };
                    thread.start();

                } catch (IOException e) {
                }
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (PAUSED == false) {
                    mPlayer.pause();
                    btnPause.setText("이어듣기");
                    PAUSED = true;
                    pbMP3.setVisibility(View.INVISIBLE);
                } else {
                    mPlayer.start();
                    PAUSED = false;
                    btnPause.setText("일시정지");
                    pbMP3.setVisibility(View.VISIBLE);
                }
            }
        });
        btnPause.setClickable(false);

        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer.stop();
                mPlayer.reset();
                btnPlay.setClickable(true);
                btnPause.setClickable(false);
                btnPause.setText("일시정지");
                btnStop.setClickable(false);
                tvMP3.setText("실행중인 음악 :  ");
                tvTime.setText("진행시간 : 0");
                pbMP3.setVisibility(View.INVISIBLE);
            }
        });
        btnStop.setClickable(false);

    }

}
