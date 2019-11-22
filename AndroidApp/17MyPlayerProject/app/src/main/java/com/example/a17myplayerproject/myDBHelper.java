package com.example.a17myplayerproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

class myDBHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqlDB;
    Cursor cursor;
    Context context;
    ArrayList<MyDB> arrayList = new ArrayList<MyDB>();

    public ArrayList<MyDB> getArrayList() {
        return arrayList;
    }


    public myDBHelper(Context context) {
        super(context, "singDB", null, 1);
        this.context = context;
        Log.i("테스트", "myDBHelper Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE singTBL (NUM INTEGER PRIMARY KEY," +
                " gArtist VARCHAR NOT NULL, gTile VARCHAR NOT NULL," +
                " gAlbum VARCHAR, gGenre VARCHAR, gProfile INTEGER);");
        Log.i("테스트", "myDBHelper onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS singTBL");
        onCreate(db);
        Log.i("테스트", "myDBHelper onUpgrade");
    }

    public void queryAction(String action, ArrayList<MyDB> list) {
        Log.i("테스트", "queryAction btnSelect1");
        sqlDB = this.getWritableDatabase();
        switch (action) {
            case "drop":
                onUpgrade(sqlDB, 1, 2); // 인수는 아무거나 입력하면 됨.
                break;
            case "select":
                Log.i("테스트", "queryAction select");


                arrayList.clear();
                arrayList.add(new MyDB("가수", "노래제목",1000, "앨범", "장르", "발매일", R.mipmap.ic_launcher, ""));

                cursor = sqlDB.rawQuery("SELECT * FROM singTBL order by gArtist asc;", null);

                while (cursor.moveToNext()) {
                    Log.i("테스트", "btnSelect4" + cursor);
                    String strArtist = cursor.getString(0);
                    String strTitle = cursor.getString(1);
                    long duration = cursor.getLong(2);
                    String strAlbum = cursor.getString(3);
                    String strGenre = cursor.getString(4);
                    String strReleseDate = cursor.getString(5);
                    long introfile = cursor.getLong(6);
                    String datapath = cursor.getString(7);

                    arrayList.add(new MyDB(strArtist, strTitle, duration, strAlbum, strGenre, strReleseDate, introfile,datapath));
                }
                cursor.close();
                break;
//            case "delete":
//                sqlDB.execSQL("DELETE FROM singTBL WHERE gName = '"
//                        + name + "';");
//                break;
//            case "insert":
//                sqlDB.execSQL("INSERT INTO singTBL VALUES ( '"
//                        + name + "' , "
//                        + number + ");");
//                sqlDB.close();
//                break;
        }
        sqlDB.close();
    }
}
