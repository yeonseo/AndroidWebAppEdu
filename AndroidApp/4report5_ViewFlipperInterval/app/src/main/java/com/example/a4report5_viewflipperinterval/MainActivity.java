package com.example.a4report5_viewflipperinterval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button btnPrev, btnStop;
    ViewFlipper viewFilpper1;
    ImageView iv_gif1,iv_gif2,iv_gif3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnStop = (Button) findViewById(R.id.btnStop);

        viewFilpper1 = findViewById(R.id.viewFilpper1);

        iv_gif1 = findViewById(R.id.iv_gif1);
        iv_gif2 = findViewById(R.id.iv_gif2);
        iv_gif3 = findViewById(R.id.iv_gif3);

        iv_gif1.setImageResource(R.drawable.cat);
        iv_gif2.setImageResource(R.drawable.made);
        iv_gif3.setImageResource(R.drawable.part);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFilpper1.startFlipping();
                viewFilpper1.setFlipInterval(1000);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFilpper1.stopFlipping();
            }
        });
    }
}
