package com.example.a17myplayerproject;

import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Environment;
import android.widget.ImageSwitcher;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class GlobalActivity {
    public static String FRAGMENT = "Main";
    public static String ARTIST;
    public static String TITLE;
    public static int position;
    public static myDBHelper myHelper;
    public static MediaPlayer mPlayer;
    public static ArrayList<MyDB> arrayList = new ArrayList<MyDB>();
    public static ArrayList<String> mp3List;
    public static final String MP3_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
    public static long backButtonTime = 0;
    public static int currentDuration;
    public static boolean PAUSED = false; // 음악이 일시정지 중인지 체크.
    public static boolean PLAY = false;

    public static Bitmap albumArt;
}
