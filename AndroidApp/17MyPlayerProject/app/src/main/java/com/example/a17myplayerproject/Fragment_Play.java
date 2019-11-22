package com.example.a17myplayerproject;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
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
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public Fragment_Play() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_play, container, false);
        imgProfileFrag1 = view.findViewById(R.id.imgProfileFrag1);
        txtTitleFrag1 = view.findViewById(R.id.txtTitleFrag1);
        txtArtistFrag1 = view.findViewById(R.id.txtArtistFrag1);
        sbMP3Frag1 = view.findViewById(R.id.sbMP3Frag1);
        btnPlayPreFrag1 = view.findViewById(R.id.btnPlayPreFrag1);
        btnPlayFrag1 = view.findViewById(R.id.btnPlayFrag1);
        btnPlayNextFrag1 = view.findViewById(R.id.btnPlayNextFrag1);


        imgProfileFrag1.setOnClickListener(this);
        btnPlayPreFrag1.setOnClickListener(this);
        btnPlayFrag1.setOnClickListener(this);
        btnPlayNextFrag1.setOnClickListener(this);

        sbMP3Frag1.setOnSeekBarChangeListener(this);

        imgProfileFrag1.setImageResource((int) GlobalActivity.arrayList.get(GlobalActivity.position).getImgProfile());
        txtArtistFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtArtist());
        txtTitleFrag1.setText(GlobalActivity.arrayList.get(GlobalActivity.position).getTxtTitle());

        if (GlobalActivity.PLAY == true) {
            sbMP3Frag1.setMax((int) GlobalActivity.arrayList.get(GlobalActivity.position).getDuration());
            sbMP3Frag1.setMin(0);
            sbMP3Frag1.setProgress(GlobalActivity.currentDuration);
            btnPlayFrag1.setImageResource(R.mipmap.song_pause);
        }




//        Thread thread = new Thread() {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
//
//            @Override
//            public void run() {
//
//                while (GlobalActivity.PLAY == true) {
//                    // anywhere else in your code
//                    mHandler.post(
//                            new Runnable() {
//                                @Override
//                                public void run() {
//                                    while (GlobalActivity.PLAY == true) {
//                                        sbMP3Frag1.setProgress(GlobalActivity.currentDuration);
////                                tvTime.setText(selectedMP3+"진행시간 : "+
////                                        simpleDateFormat.format(mPlayer.getCurrentPosition()));
//                                        SystemClock.sleep(200);
//                                    }//end of while
//                                }
//                            }
//
//                    );
//                }//end of while
//
//
//                GlobalActivity.PLAY = false;
//                mHandler.post(
//                        new Runnable() {
//                            @Override
//                            public void run() {
//                                imgProfileFrag1.setImageResource(R.mipmap.song_play);
//                                sbMP3Frag1.setProgress(0);
//                            }
//                        }
//
//                );
//
//            }
//        };
//        thread.start();

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

//    <androidx.drawerlayout.widget.DrawerLayout
//    android:id="@+id/playDrawerLayout"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:orientation="vertical">
//
//        <include layout="@layout/activity_navigation_songinfo" />
//    </androidx.drawerlayout.widget.DrawerLayout>
}
