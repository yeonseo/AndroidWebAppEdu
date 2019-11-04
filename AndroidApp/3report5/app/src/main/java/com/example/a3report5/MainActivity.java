package com.example.a3report5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[] buttonList = new Button[3];
    int[] index = {R.id.btnScreen1, R.id.btnScreen2, R.id.btnScreen3};
    LinearLayout layout1, layout2, layout3;
    ImageView iv_image1,iv_image2,iv_image3;
    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);

        iv_image1 = findViewById(R.id.iv_image1);
        iv_image2 = findViewById(R.id.iv_image2);
        iv_image3 = findViewById(R.id.iv_image3);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);

        setInvisible();

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

                            iv_image1.setVisibility(View.VISIBLE);
                            iv_image2.setVisibility(View.INVISIBLE);
                            iv_image3.setVisibility(View.INVISIBLE);

                            txt1.setVisibility(View.VISIBLE);
                            txt2.setVisibility(View.INVISIBLE);
                            txt3.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            layout1.setVisibility(View.INVISIBLE);
                            layout2.setVisibility(View.VISIBLE);
                            layout3.setVisibility(View.INVISIBLE);

                            iv_image1.setVisibility(View.INVISIBLE);
                            iv_image2.setVisibility(View.VISIBLE);
                            iv_image3.setVisibility(View.INVISIBLE);

                            txt1.setVisibility(View.INVISIBLE);
                            txt2.setVisibility(View.VISIBLE);
                            txt3.setVisibility(View.INVISIBLE);
                            break;
                        case 2:
                            layout1.setVisibility(View.INVISIBLE);
                            layout2.setVisibility(View.INVISIBLE);
                            layout3.setVisibility(View.VISIBLE);

                            iv_image1.setVisibility(View.INVISIBLE);
                            iv_image2.setVisibility(View.INVISIBLE);
                            iv_image3.setVisibility(View.VISIBLE);

                            txt1.setVisibility(View.INVISIBLE);
                            txt2.setVisibility(View.INVISIBLE);
                            txt3.setVisibility(View.VISIBLE);
                            break;
                        default:break;
                    }
                }
            });
        }
    }

    public void setInvisible(){
        iv_image1.setVisibility(View.INVISIBLE);
        iv_image1.setVisibility(View.INVISIBLE);
        iv_image1.setVisibility(View.INVISIBLE);

        txt1.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
    }
}
