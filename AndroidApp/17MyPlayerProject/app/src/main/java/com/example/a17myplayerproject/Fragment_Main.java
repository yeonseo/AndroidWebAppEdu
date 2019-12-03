package com.example.a17myplayerproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;

public class Fragment_Main extends Fragment implements View.OnClickListener {

    View view;
    private MainAdapter mainAdapter;
    private LinearLayoutManager linearLayoutManager;
    private LinearLayout layoutPlay;
    private RecyclerView recyclerView;
    private ImageButton imgProfile;
    private TextView txtTitle, txtArtist, txtTimeCurrent, txtTimeDuration;
    private SeekBar sbMP3;

    public static Fragment_Main newInstance() {
        Fragment_Main fragment_main = new Fragment_Main();
        return fragment_main;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        layoutPlay = view.findViewById(R.id.layoutPlay);
        recyclerView = view.findViewById(R.id.recyclerView);
        imgProfile = view.findViewById(R.id.imgProfile);

        txtTitle = view.findViewById(R.id.txtTitle);
        txtArtist = view.findViewById(R.id.txtArtist);
        txtTimeCurrent = view.findViewById(R.id.txtTimeCurrent);
        txtTimeDuration = view.findViewById(R.id.txtTimeDuration);

        sbMP3 = view.findViewById(R.id.sbMP3);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mainAdapter = new MainAdapter(GlobalActivity.arrayList);
        recyclerView.setAdapter(mainAdapter);

        Log.i("테스트", "Fragment_Main onCreateView 1");

        imgProfile.setOnClickListener(this);
        layoutPlay.setOnClickListener(this);
        Thread thread = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                while (true) {
                    txtArtist.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
                    txtTitle.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());
                    SystemClock.sleep(500);
                }
            }
        };
        thread.start();

        layoutPlay.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgProfile:
                if (GlobalActivity.PLAY == false) {
                    playSetting();
                } else {
                    if (GlobalActivity.PAUSED == false) {
                        GlobalActivity.mPlayer.pause();
                        imgProfile.setImageResource(R.mipmap.song_play);
                        GlobalActivity.PAUSED = true;
                    } else {
                        GlobalActivity.mPlayer.start();
                        GlobalActivity.PAUSED = false;
                        imgProfile.setImageResource(R.mipmap.song_pause);
                    }
                }
                break;
        }
    }

    public void playSetting() {
        try {
            GlobalActivity.PLAY = true;
            GlobalActivity.mPlayer = new MediaPlayer();
            GlobalActivity.mPlayer.setDataSource(GlobalActivity.arrayList.get(GlobalActivity.position).getFilePath());
            //mPlayer.setDataSource(“/sdcard/” + selectedMP3);두개중 한 개 선택할 것

            GlobalActivity.mPlayer.prepare();
            GlobalActivity.mPlayer.start();
            imgProfile.setImageResource(R.mipmap.song_pause);
            Log.i("테스트", "playSetting 1");

            Log.i("테스트", "playSetting 1");
            Thread thread = new Thread() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

                @Override
                public void run() {
                    if (GlobalActivity.mPlayer == null) {
                        return;
                    } else {
                        //1. 노래 총 시간
                        sbMP3.setMax(GlobalActivity.mPlayer.getDuration());
                        sbMP3.setMin(0);
                    }
                    while (GlobalActivity.mPlayer.isPlaying()) {

                        Log.i("테스트", "playSetting 1-1");
                        GlobalActivity.currentDuration = GlobalActivity.mPlayer.getCurrentPosition();
                        sbMP3.setProgress(GlobalActivity.currentDuration);

//                        String duration = simpleDateFormat.format(GlobalActivity.arrayList.get(GlobalActivity.position).getDuration());
//                        txtTimeDuration.setText("aaaa");
//                        Log.i("테스트", "Fragment_Main onCreateView 1" + duration);
//                        duration = simpleDateFormat.format(GlobalActivity.currentDuration);
//                        txtTimeCurrent.setText(duration);
//                        SystemClock.sleep(200);
                    }//end of while


                    Log.i("테스트", "playSetting 4");
                    imgProfile.setImageResource(R.mipmap.song_play);
                    sbMP3.setProgress(0);
                    GlobalActivity.PLAY = false;
                }
            };
            thread.start();

        } catch (Exception e) {
            Log.i("테스트", "playSetting 5");
        }
    }


}
