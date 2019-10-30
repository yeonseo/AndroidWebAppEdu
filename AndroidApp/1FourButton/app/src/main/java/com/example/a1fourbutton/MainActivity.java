package com.example.a1fourbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNate, btnNumber, btnGal, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNate = (Button)findViewById(R.id.btnNate);
        btnNumber = (Button)findViewById(R.id.btnNumber);
        btnGal = (Button)findViewById(R.id.btnGal);
        btnExit = (Button)findViewById(R.id.btnExit);

        //3. Event set
        btnNate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4.Intent
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("http://m.nate.com"));
                startActivity(intent);
            }
        });

        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("tel:/010-9991-9092"));
                startActivity(intent);
            }
        });

        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
