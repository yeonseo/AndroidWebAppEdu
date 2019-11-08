package com.example.a6toasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //해상도를 구하는 방법
                Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int xOffset = (int)(Math.random()*display.getWidth());
                int yOffset = (int)(Math.random()*display.getHeight());
                Toast toast = Toast.makeText(MainActivity.this,"Hey",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.LEFT,xOffset,yOffset);
                toast.show();
            }
        });
    }
}
