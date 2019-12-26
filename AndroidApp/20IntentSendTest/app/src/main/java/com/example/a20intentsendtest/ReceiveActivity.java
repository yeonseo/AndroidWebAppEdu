package com.example.a20intentsendtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ReceiveActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ReceiveActivity", "dataList : onCreate");
        Intent intent = getIntent();
        ArrayList<Data> dataList = (ArrayList<Data>) intent.getSerializableExtra("data");

        for (Data data : dataList) {
            Log.d("ReceiveActivity Intent ", "dataList : " + data.toString());
        }

        Bundle bundle = intent.getBundleExtra("bundle");

        String bundleString = bundle.getString("String");
        Log.d("ReceiveActivity bundle ", "dataList : " + bundleString);

        int bundleInt = bundle.getInt("Year");
        Log.d("ReceiveActivity bundle ", "dataList : " + bundleInt);

    }
}
