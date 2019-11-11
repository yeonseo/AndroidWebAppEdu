package com.example.a8report2_filelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btnList;
    TextView tvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);
        btnList = findViewById(R.id.btnList);
        tvList = findViewById(R.id.tvList);


        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String strSDpath =
                        Environment.getExternalStorageDirectory().getAbsolutePath();
                File[] dirFile = (new File(strSDpath+"/pic")).listFiles();
                String strFileName="";
                for(int i=0; i<dirFile.length;  i++) {
                    if(dirFile[i].isDirectory()==true) {
                        strFileName="<폴더>"+dirFile[i].toString();
                    }else {
                        strFileName="<파일>"+dirFile[i].toString();
                    }
                    tvList.setText(tvList.getText()+"\n"+strFileName);
                }

            }
        });


    }
}