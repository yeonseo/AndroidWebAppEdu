package com.example.a16report_database_adaptertest;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class myDBHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqlDB;
    Cursor cursor;
    Context context;
    ArrayList<MyDB> arrayList = new ArrayList<MyDB>();

    public ArrayList<MyDB> getArrayList() {
        return arrayList;
    }


    public myDBHelper(Context context) {
        super(context, "groupDB", null, 1);
        this.context = context;
        Log.i("테스트", "myDBHelper Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE groupTBL ( gName CHAR(20) PRIMARY KEY, gNumber INTEGER);");
        Log.i("테스트", "myDBHelper onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS groupTBL");
        onCreate(db);
        Log.i("테스트", "myDBHelper onUpgrade");
    }

    public void queryAction(String action, String name, String number) {
        Log.i("테스트", "queryAction btnSelect1");
        sqlDB = this.getWritableDatabase();
        switch (action) {
            case "drop":
                onUpgrade(sqlDB, 1, 2); // 인수는 아무거나 입력하면 됨.
                break;
            case "select":
                Log.i("테스트", "queryAction select");


                arrayList.clear();
                arrayList.add(new MyDB(R.mipmap.ic_launcher, "그룹이름", "인원"));
                arrayList.add(new MyDB(R.mipmap.ic_launcher, "--------", "--------"));

                cursor = sqlDB.rawQuery("SELECT * FROM groupTBL order by gName asc;", null);

                while (cursor.moveToNext()) {
                    Log.i("테스트", "btnSelect4" + cursor);
                    String strName = cursor.getString(0);
                    String strNum = cursor.getString(1);
                    arrayList.add(new MyDB(R.mipmap.ic_launcher, strName, strNum));
                }
                cursor.close();
                break;
            case "delete":
                sqlDB.execSQL("DELETE FROM groupTBL WHERE gName = '"
                        + name + "';");
                break;
            case "insert":
                sqlDB.execSQL("INSERT INTO groupTBL VALUES ( '"
                        + name + "' , "
                        + number + ");");
                sqlDB.close();
                break;
        }
        sqlDB.close();
    }
}