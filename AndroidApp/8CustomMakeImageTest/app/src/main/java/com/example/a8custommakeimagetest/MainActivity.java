package com.example.a8custommakeimagetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btPrevious, btNext;
    private MyPictureView myPictureView;
    private File[] imageFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        btPrevious = findViewById(R.id.btPrevious);
        btNext = findViewById(R.id.btNext);
        myPictureView = findViewById(R.id.myPictureView);

        imageFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/pic").listFiles();

        myPictureView.setSrc(imageFile[0].toString().trim());
        myPictureView.invalidate();

        btPrevious.setOnClickListener(this);
        btNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btPrevious :

                break;
            case R.id.btNext :

                break;
        }
    }
}