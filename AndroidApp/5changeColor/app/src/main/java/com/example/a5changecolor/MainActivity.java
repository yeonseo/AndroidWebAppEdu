package com.example.a5changecolor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btnFunc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = findViewById(R.id.baseLayout);
        btnFunc = findViewById(R.id.btnFunc);
    }

    //시스템 옵션 메뉴 선택 메뉴를 인플레이트하고 옵션메뉴등록한다.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    //옵션메뉴를 클릭하면 인지를 하는 함수
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRed :
                baseLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.itemBlue :
                baseLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.itemGreen :
                baseLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.subRotate :
                btnFunc.setRotation(45);
                ;break;
            case R.id.subSize :
                btnFunc.setScaleX(2);
                break;
            default:
                break;

        }
        return true;
    }
}
