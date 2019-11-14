package com.example.a11navigationtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    DrawerLayout mainDrawerLayout;
    Button btnDrawerOpen, btnDrawerClose, btnDrawerMenu1;
    LinearLayout drawerMenu, btnDrawerMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainDrawerLayout = findViewById(R.id.mainDrawerLayout);
        btnDrawerOpen = findViewById(R.id.btnDrawerOpen);
        btnDrawerClose = findViewById(R.id.btnDrawerClose);
        btnDrawerMenu1 = findViewById(R.id.btnDrawerMenu1);
        btnDrawerMenu2 = findViewById(R.id.btnDrawerMenu2);
        drawerMenu = findViewById(R.id.drawerMenu);

        btnDrawerOpen.setOnClickListener(this);
        btnDrawerClose.setOnClickListener(this);
        btnDrawerMenu1.setOnClickListener(this);
        btnDrawerMenu2.setOnClickListener(this);

        drawerMenu.setOnTouchListener(this);
        mainDrawerLayout.setDrawerListener(listener);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDrawerOpen:
                mainDrawerLayout.openDrawer(drawerMenu);
                break;
            case R.id.btnDrawerClose:
                mainDrawerLayout.closeDrawer(drawerMenu);
                break;
            case R.id.btnDrawerMenu1:
                break;
            case R.id.btnDrawerMenu2:
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener(){

        //슬라이딩을 시작할 때 이벤트
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            //Toast.makeText(getApplicationContext(),"sliding", Toast.LENGTH_LONG).show();
        }

        //메뉴를 열었을 때 이벤트
        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
            Toast.makeText(getApplicationContext(),"opening", Toast.LENGTH_LONG).show();
        }

        //메뉴를 닫았을 때 이벤트
        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
            Toast.makeText(getApplicationContext(),"closing", Toast.LENGTH_LONG).show();
        }

        //메뉴가 상태가 바뀌었을 때 이벤트
        @Override
        public void onDrawerStateChanged(int newState) {
            //Toast.makeText(getApplicationContext(),"changing", Toast.LENGTH_LONG).show();
        }
    };
}
