package com.example.a10intantactivitytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;
    int sum = 0, number1 = 0, number2 = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        //getIntent 속에 값이 들어있다.
        Intent intent = getIntent();
        number1 = intent.getIntExtra("number1",0);
        number2 = intent.getIntExtra("number2",0);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        sum = number1 + number2;
        intent.putExtra("sum", sum);

        //미리 약속했던 코드를 사용해서 넘겨준다.
        setResult(1001, intent);
        finish();
    }
}
