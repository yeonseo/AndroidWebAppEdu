package com.example.a2report;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_num1, edt_num2;
    Button btn_sum, btn_sub, btn_mul, btn_div;
    TextView txtview;
    String num1, num2;
    Double res;
    Integer cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edt_num1 = (EditText) findViewById(R.id.edt_num1);
        edt_num2 = (EditText) findViewById(R.id.edt_num2);

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);

        txtview = (TextView) findViewById(R.id.txtview);

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
        if (!edt_num1.getText().toString().equals("") && !edt_num2.getText().toString().equals("")) {
            num1 = edt_num1.getText().toString();
            num2 = edt_num2.getText().toString();

            switch (cal){
                case 1: res = Double.parseDouble(num1) + Double.parseDouble(num2); break;
                case 2: res = Double.parseDouble(num1) - Double.parseDouble(num2); break;
                case 3: res = Double.parseDouble(num1) * Double.parseDouble(num2); break;
                case 4: res = Double.parseDouble(num1) / Double.parseDouble(num2); break;
            }
            txtview.setText("결과 : " + Math.round(res*100));
        } else if (edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")) {
            toastDisplay("빈칸없이 적어주세요~");
        } else {
            toastDisplay("숫자만 적어주세요~");
        }
    }

    public void toastDisplay (String message){
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }


}
