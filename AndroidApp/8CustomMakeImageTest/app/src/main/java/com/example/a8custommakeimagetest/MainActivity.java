package com.example.a8custommakeimagetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btPrevious, btNext;
    private MyPictureView myPictureView;
    private File[] imageFile;
    private TextView txtFileNum,txtFileName;
    private int currentPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        btPrevious = findViewById(R.id.btPrevious);
        btNext = findViewById(R.id.btNext);
        myPictureView = findViewById(R.id.myPictureView);
        txtFileNum = findViewById(R.id.txtFileNum);
        txtFileName = findViewById(R.id.txtFileName);

        imageFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/pic").listFiles();

        myPictureView.setSrc(imageFile[0].toString().trim());
        myPictureView.invalidate();

        btPrevious.setOnClickListener(this);
        btNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btPrevious : imageChangePrevious();
                break;
            case R.id.btNext : imageChangeNext();
                break;
        }
    }
    private void imageChangeNext() {
        currentPoint += 1;
        currentPoint = (currentPoint>4)?(0):(currentPoint);
        myPictureView.setSrc(imageFile[currentPoint].toString());
        txtFileNum.setText((currentPoint+1)+" / 5");
        txtFileName.setText(imageFile[currentPoint].toString().trim());
        //이미지 소스가 변경되었다. 즉시 다시 그려라.
        myPictureView.invalidate();
    }

    private void imageChangePrevious() {
        currentPoint -= 1;
        currentPoint = (currentPoint<0)?(4):(currentPoint);
        myPictureView.setSrc(imageFile[currentPoint].toString());
        txtFileNum.setText((currentPoint+1)+" / 5");
        txtFileName.setText(imageFile[currentPoint].toString().trim());
        //이미지 소스가 변경되었다. 즉시 다시 그려라.
        myPictureView.invalidate();
    }

}