package com.example.a16instargrambarmenutest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomMenu;
    private FrameLayout framLayout;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private Fragment5 fragment5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomMenu = findViewById(R.id.bottomMenu);
        framLayout = findViewById(R.id.framLayout);

        bottomMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action1:
                        setFragment(0);
                        break;
                    case R.id.action2:
                        setFragment(1);
                        break;
                    case R.id.action3:
                        setFragment(2);
                        break;
                    case R.id.action4:
                        setFragment(3);
                        break;
                    case R.id.action5:
                        setFragment(4);
                        break;
                }
                return true;
            }
        });

        //배열로 관리해도 됨
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragment5 = new Fragment5();

        setFragment(0);//첫화면을 무엇으로 선택할것인지 결정
    }


    //
    private void setFragment(int position) {
        //화면을 전환하기 위해서는 프래그먼트 매니저가 필요하다
        fragmentManager = getSupportFragmentManager();
        //프래그먼트 매니저의 권한을 받아서 위치를 전환하기위해서는 fragmentTransaction
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (position) {
            case 0:
                fragmentTransaction.replace(R.id.framLayout, fragment1);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentTransaction.replace(R.id.framLayout, fragment2);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentTransaction.replace(R.id.framLayout, fragment3);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentTransaction.replace(R.id.framLayout, fragment4);
                fragmentTransaction.commit();
                break;
            case 4:
                fragmentTransaction.replace(R.id.framLayout, fragment5);
                fragmentTransaction.commit();
                break;
        }

    }
}
