package com.example.a3report4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Button> list = new ArrayList<Button>();
    int[] index = {R.id.btn_num0,R.id.btn_num1,R.id.btn_num2,R.id.btn_num3,R.id.btn_num4,
            R.id.btn_num5,R.id.btn_num6,R.id.btn_num7,R.id.btn_num8,R.id.btn_num9,R.id.btn_clr};

    Button btn_sum, btn_sub, btn_mul, btn_div;
    TextView txtview;
    String num1="";
    Double res=0.0;
    Integer cal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);

        txtview = (TextView) findViewById(R.id.txtview);

        for (int i = 0; i < index.length; i++) {
            final int selectedIndex = i;
            list.add((Button) findViewById(index[i]));
            list.get(selectedIndex).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (selectedIndex) {
                        case 0:
                            num1 = "0";
                            break;
                        case 1:
                            num1 = "1";
                            break;
                        case 2:
                            num1 = "2";
                            break;
                        case 3:
                            num1 = "3";
                            break;
                        case 4:
                            num1 = "4";
                            break;
                        case 5:
                            num1 = "5";
                            break;
                        case 6:
                            num1 = "6";
                            break;
                        case 7:
                            num1 = "7";
                            break;
                        case 8:
                            num1 = "8";
                            break;
                        case 9:
                            num1 = "9";
                            break;
                        case 10: res=0.0; resultTextView(); break;
                        default:break;
                    }
                }
            });
        }


        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal = 1;
                calculator(cal);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal = 2;
                calculator(cal);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal = 3;
                calculator(cal);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal = 4;
                calculator(cal);
            }
        });

    }

    public void calculator (Integer cal){
        if (!num1.toString().equals("")) {
            switch (cal){
                case 1: res = res + Double.parseDouble(num1); break;
                case 2: res = res - Double.parseDouble(num1); break;
                case 3: res = res * Double.parseDouble(num1); break;
                case 4: res = res / Double.parseDouble(num1); break;
            }
            resultTextView();
            num1="";
        } else if (num1.toString().equals("")) {
            toastDisplay("빈칸없이 적어주세요~");
        } else {
            toastDisplay("숫자만 적어주세요~");
        }
    }

    public void toastDisplay (String message){
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }

    public void resultTextView(){
        txtview.setText("결과 : " + Math.round(res*10000)/10000.0);
    }
}
