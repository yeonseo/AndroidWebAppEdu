package com.example.a2report3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCompoundButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_exit,btn_restart, btn_ok;
    Switch swt;
    RadioGroup rdo_g;
    RadioButton rdo_btn1,rdo_btn2,rdo_btn3;
    ImageView iv_cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_exit = findViewById(R.id.btn_exit);
        btn_ok = findViewById(R.id.btn_ok);
        btn_restart = findViewById(R.id.btn_restart);
        swt = findViewById(R.id.swt);
        rdo_g = findViewById(R.id.rdo_g);
        rdo_btn1 = findViewById(R.id.rdo_btn1);
        rdo_btn2 = findViewById(R.id.rdo_btn2);
        rdo_btn3 = findViewById(R.id.rdo_btn3);
        iv_cat = findViewById(R.id.iv_cat);

        my_init();

        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(swt.isChecked()==true){
                    rdo_g.setVisibility(View.VISIBLE);
                    iv_cat.setVisibility(View.VISIBLE);

                    btn_ok.setVisibility(View.VISIBLE);
                    btn_exit.setVisibility(View.VISIBLE);
                    btn_restart.setVisibility(View.VISIBLE);

                }else{
                    rdo_g.setVisibility(View.INVISIBLE);
                    iv_cat.setVisibility(View.INVISIBLE);

                    btn_ok.setVisibility(View.INVISIBLE);
                    btn_exit.setVisibility(View.INVISIBLE);
                    btn_restart.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerSelectImage();
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_init();
            }
        });


    }

    public void handlerSelectImage(){
        switch(rdo_g.getCheckedRadioButtonId()){
            case R.id.rdo_btn1: iv_cat.setImageResource(R.drawable.cat0001);break;
            case R.id.rdo_btn2: iv_cat.setImageResource(R.drawable.cat0002);break;
            case R.id.rdo_btn3: iv_cat.setImageResource(R.drawable.cat0003);break;
        }
    }
    public void my_init(){
        swt.setChecked(false);
        rdo_btn1.setChecked(false);
        rdo_btn2.setChecked(false);
        rdo_btn3.setChecked(false);
        iv_cat.setVisibility(View.VISIBLE);
        rdo_g.setVisibility(View.INVISIBLE);
        iv_cat.setVisibility(View.INVISIBLE);

        btn_ok.setVisibility(View.INVISIBLE);
        btn_exit.setVisibility(View.INVISIBLE);
        btn_restart.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        my_init();
        toastDisplay("one resume");
    }

    public void toastDisplay(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }
}
