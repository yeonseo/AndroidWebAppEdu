package com.example.a12customlistviewstringtest;

import android.util.Log;

public class MyCustomDAO {
    String data;

    public MyCustomDAO(String data) {
        this.data = data;
        Log.i("테스트","MyCustomDAO");
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
