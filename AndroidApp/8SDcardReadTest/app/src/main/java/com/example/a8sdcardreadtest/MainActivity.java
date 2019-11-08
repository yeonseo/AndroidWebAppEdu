package com.example.a8sdcardreadtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRead;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRead=findViewById(R.id.btnRead);
        editText=findViewById(R.id.editText);

        //사용자에게 접근 허용을 물어봄.
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                MODE_PRIVATE);

        btnRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("/storage/emulated/0/text.txt");
            byte[] txt = new byte[fis.available()];
            fis.read(txt);
            editText.setText(new String(txt));
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
