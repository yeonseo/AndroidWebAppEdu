package com.example.a3framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button[] buttonList = new Button[3];
    int[] index = {R.id.btnScreen1, R.id.btnScreen2, R.id.btnScreen3};
    LinearLayout layout1, layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.INVISIBLE);
        layout3.setVisibility(View.INVISIBLE);

        for (int i = 0; i < index.length; i++) {
            final int selectedIndex = i;
            buttonList[selectedIndex] = findViewById(index[selectedIndex]);
            buttonList[selectedIndex].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (selectedIndex) {
                        case 0:
                            layout1.setVisibility(View.VISIBLE);
                            layout2.setVisibility(View.INVISIBLE);
                            layout3.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            layout1.setVisibility(View.INVISIBLE);
                            layout2.setVisibility(View.VISIBLE);
                            layout3.setVisibility(View.INVISIBLE);
                            break;
                        case 2:
                            layout1.setVisibility(View.INVISIBLE);
                            layout2.setVisibility(View.INVISIBLE);
                            layout3.setVisibility(View.VISIBLE);
                            break;
                            default:break;
                    }
                }
            });
        }
    }
}
