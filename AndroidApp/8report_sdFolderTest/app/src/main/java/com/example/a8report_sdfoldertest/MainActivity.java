package com.example.a8report_sdfoldertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity  {
    Button btnCreate, btnDelete;
    TextView tvSDFolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                MODE_PRIVATE);
        btnCreate = findViewById(R.id.btnCreate);
        btnDelete = findViewById(R.id.btnDelete);
        tvSDFolder = findViewById(R.id.tvSDFolder);
        toastDisplay("HI");
        final String strSDpath =
                Environment.getExternalStorageDirectory().getAbsolutePath();
        final File myDir = new File(strSDpath + "/mydir");


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "??????", Toast.LENGTH_LONG).show();

                if (!myDir.exists()) {
                    myDir.mkdir();
                    toastDisplay("Dir 만듬!!!!");
                } else {
                    toastDisplay("Dir 있음!!!");
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastDisplay("Dir 만듬!!!!");
                if (myDir.exists()) {
                    myDir.delete();
                    toastDisplay("Dir 삭제!!!!");
                } else {
                    toastDisplay("Dir 없음!!!");
                }
            }
        });
    }
    private void toastDisplay(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}
