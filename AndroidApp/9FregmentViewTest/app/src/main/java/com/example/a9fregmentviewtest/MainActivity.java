package com.example.a9fregmentviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FrameLayout frameLayout;
    //합칠 때 팀장이 하는 것
    Button btnMenu1, btnMenu2, btnMenu3, btnMenu4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        btnMenu4 = findViewById(R.id.btnMenu4);

        btnMenu1.setOnClickListener(this);
        btnMenu2.setOnClickListener(this);
        btnMenu3.setOnClickListener(this);
        btnMenu4.setOnClickListener(this);

        btnMenu1.callOnClick(); //버튼을 부르는 함수
//        이렇게 해야하지만!!
//        FragmentTransaction ft =
//                getSupportFragmentManager().beginTransaction();
//        Fragment fragmentActivity = null;
//        fragmentActivity = new Fragment1Activity();
//        ft.replace(R.id.frameLayout, fragmentActivity);
//        ft.commit();

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft =
                getSupportFragmentManager().beginTransaction();
        Fragment fragmentActivity = null;
        switch (v.getId()) {
            case R.id.btnMenu1:
                fragmentActivity = new Fragment1Activity();
                break;
            case R.id.btnMenu2:
                fragmentActivity = new Fragment2Activity();
                break;
            case R.id.btnMenu3:
                fragmentActivity = new Fragment3Activity();
                break;
            case R.id.btnMenu4:
                fragmentActivity = new Fragment4Activity();
                break;
        }
        ft.replace(R.id.frameLayout, fragmentActivity);
        ft.commit();
    }
}
