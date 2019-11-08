package com.example.a7rawfolderfileaccesstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRead;
    EditText edtRaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRead = findViewById(R.id.btnRead);
        edtRaw = findViewById(R.id.edtRaw);

        btnRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRead:
                rawReadFile();
                break;
        }
    }

    private void rawReadFile() {
        InputStream is = null;
        try {
            is = getResources().openRawResource(R.raw.text);
            byte[] txt = new byte[is.available()];
            is.read(txt);
            edtRaw.setText(new String(txt));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
