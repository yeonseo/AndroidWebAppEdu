package com.example.a2report5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout lay1, lay2;
    Button button1;
    Boolean set1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);

        lay1.setBaselineAligned(false);
        lay2.setBaselineAligned(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "toast", Toast.LENGTH_LONG).show();
                lay1.setBaselineAligned(true);
                lay2.setBaselineAligned(true);
                if (set1 == true) {
                    lay1.setBaselineAligned(true);
                    lay2.setBaselineAligned(true);
                    set1 = false;
                } else if (set1 == false) {
                    lay1.setBaselineAligned(false);
                    lay2.setBaselineAligned(false);
                    set1 = true;
                }
            }
        });
    }
}
