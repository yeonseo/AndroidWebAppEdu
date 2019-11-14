package com.example.a11report_navi_frag_ratingbar_intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    ImageButton btnMenu1;
    Button btnMenu2, btnMenu3,btnDrawerClose;
    FrameLayout frameLayout;
    DrawerLayout mainDrawerLayout;
    LinearLayout drawerMenu,btnDrawerMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu1 = findViewById(R.id.btnMenu1);
        btnDrawerClose = findViewById(R.id.btnDrawerClose);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnDrawerMenu2 = findViewById(R.id.btnDrawerMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        frameLayout = findViewById(R.id.frameLayout);
        mainDrawerLayout = findViewById(R.id.mainDrawerLayout);
        drawerMenu = findViewById(R.id.drawerMenu);

        btnMenu1.setOnClickListener(this);
        btnDrawerClose.setOnClickListener(this);
        btnMenu2.setOnClickListener(this);
        btnDrawerMenu2.setOnClickListener(this);
        btnMenu3.setOnClickListener(this);

        drawerMenu.setOnTouchListener(this);
        mainDrawerLayout.setDrawerListener(listener);

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft =
                getSupportFragmentManager().beginTransaction();
        Fragment fragmentActivity = null;
        switch (v.getId()) {
            case R.id.btnMenu1:
                mainDrawerLayout.openDrawer(drawerMenu);
                break;
            case R.id.btnDrawerClose:
                mainDrawerLayout.closeDrawer(drawerMenu);
                break;
            case R.id.btnMenu2: case R.id.btnDrawerMenu2 :
                fragmentActivity = new VoteActivity();
                ft.replace(R.id.frameLayout, fragmentActivity);
                ft.commit();
                break;
            case R.id.btnMenu3:
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
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
