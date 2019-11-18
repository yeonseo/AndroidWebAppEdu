package com.example.a14project12_1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    //확장사 써도 되고 안 써도 되고~ 명시적 초기값
    //private static final String DB_NAME = "groupDB.db";
    private static final String DB_NAME = "groupDB";
    private static final int DB_VERSION = 1;

    public MyDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.i("테스트", "MyDBHelper 생성자");
    }

    //테이블을 생성함
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE groupDB(gName CHAR(20) PRIMARY KEY, gNumber INTEGER);");
        Log.i("테스트", "MyDBHelper onCreate");
    }

    //테이블을 삭제하고 다시 생성함
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS groupTBL;");
        onCreate(db);
    }
}
