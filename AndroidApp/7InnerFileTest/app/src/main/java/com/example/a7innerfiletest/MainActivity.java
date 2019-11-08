package com.example.a7innerfiletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMemoryWrite, btnMemoryRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMemoryWrite = findViewById(R.id.btnMemoryWrite);
        btnMemoryRead = findViewById(R.id.btnMemoryRead);

        btnMemoryWrite.setOnClickListener(this);
        btnMemoryRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMemoryWrite : fileInnerWrite(); break;
            case R.id.btnMemoryRead : fileInnerRead(); break;
        }
    }

    private void fileInnerWrite() {
        try {
            FileOutputStream fos = openFileOutput("file.txt", Context.MODE_PRIVATE);
            String String = "쿡... 안드로이드....ㅋ";
            fos.write(String.getBytes());
            //??? database처럼 항상 닫아줘야 하나요?
            fos.close();

            toastDisplay("system get : file.txt");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fileInnerRead() {
        FileInputStream fis = null;
        try {
            fis = openFileInput("file.txt");
            byte[] data = new byte[fis.available()];
            fis.read(data);
            //data 속에 있는 데이타를 문자열을 다 바꿔준다~
            toastDisplay(new String(data));
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void toastDisplay(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }


}
