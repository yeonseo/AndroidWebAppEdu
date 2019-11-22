package com.example.a17myplayerproject;

import android.os.Environment;

import java.util.ArrayList;

public class GlobalActivity {
    public static ArrayList<MyDB> arrayList = new ArrayList<MyDB>();
    public static ArrayList<String> mp3List;
    public static myDBHelper myHelper;
    public static int position;
    public static final String MP3_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
    public static long backButtonTime = 0;
    public static int currentDuration;
    public static boolean PAUSED = false; // 음악이 일시정지 중인지 체크.
    public static boolean PLAY = false;
}
