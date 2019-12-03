package com.example.a17myplayerproject;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;

public class Fragment_Play extends Fragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    View view;
    private ImageView imgProfileFrag1;
    private TextView txtTitleFrag1, txtArtistFrag1;
    private SeekBar sbMP3Frag1;
    private ImageButton btnPlayPreFrag1, btnPlayFrag1, btnPlayNextFrag1;


    public static Fragment_Play newInstance(){
        Fragment_Play fragment_play = new Fragment_Play();
        return fragment_play;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_play, container, false);
        Log.i("테스트", "Fragment_Play 1");
        imgProfileFrag1 = view.findViewById(R.id.imgProfileFrag1);
        txtTitleFrag1 = view.findViewById(R.id.txtTitleFrag1);
        txtArtistFrag1 = view.findViewById(R.id.txtArtistFrag1);
        sbMP3Frag1 = view.findViewById(R.id.sbMP3Frag1);
        btnPlayPreFrag1 = view.findViewById(R.id.btnPlayPreFrag1);
        btnPlayFrag1 = view.findViewById(R.id.btnPlayFrag1);
        btnPlayNextFrag1 = view.findViewById(R.id.btnPlayNextFrag1);
        Log.i("테스트", "Fragment_Play 2");

        imgProfileFrag1.setOnClickListener(this);
        btnPlayPreFrag1.setOnClickListener(this);
        btnPlayFrag1.setOnClickListener(this);
        btnPlayNextFrag1.setOnClickListener(this);

        sbMP3Frag1.setOnSeekBarChangeListener(this);

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    txtArtistFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
                    txtTitleFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());
//                    if (GlobalActivity.albumArt != null) {
//                        imgProfileFrag1.setImageBitmap(GlobalActivity.albumArt);
//                    } else {
//                        imgProfileFrag1.setImageResource(R.drawable.music);
//                    }
                    if (GlobalActivity.PLAY==true) {
                        txtArtistFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
                        txtTitleFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());
                        sbMP3Frag1.setMax((int) GlobalActivity.arrayList.get(GlobalActivity.position).getDuration());
                        sbMP3Frag1.setMin(0);
                        sbMP3Frag1.setProgress(GlobalActivity.currentDuration);
                        btnPlayFrag1.setImageResource(R.mipmap.song_pause);
                    }
                    SystemClock.sleep(200);
                }
            }
        };
        thread2.start();




        Thread thread = new Thread() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

            @Override
            public void run() {
                Log.i("테스트", "Fragment_Play thread 1");
                if (GlobalActivity.mPlayer == null) {
                    return;
                } else {
                    //1. 노래 총 시간
                    sbMP3Frag1.setMax(GlobalActivity.mPlayer.getDuration());
                    sbMP3Frag1.setMin(0);

                }
                Log.i("테스트", "Fragment_Play thread 2");
                while (GlobalActivity.mPlayer.isPlaying()) {

                    Log.i("테스트", "Fragment_Play thread 3");
                    GlobalActivity.currentDuration = GlobalActivity.mPlayer.getCurrentPosition();
                    sbMP3Frag1.setProgress(GlobalActivity.currentDuration);

                    SystemClock.sleep(200);
                }//end of while

                Log.i("테스트", "Fragment_Play 4");
                imgProfileFrag1.setImageResource(R.mipmap.song_play);
                sbMP3Frag1.setProgress(0);
                GlobalActivity.PLAY = false;
            }
        };
        thread.start();

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgProfileFrag1:
                break;
            case R.id.btnPlayPreFrag1:
                break;
            case R.id.btnPlayFrag1:
                break;
            case R.id.btnPlayNextFrag1:
                break;
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
