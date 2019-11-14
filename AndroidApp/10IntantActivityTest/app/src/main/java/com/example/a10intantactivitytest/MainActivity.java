package com.example.a10intantactivitytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOpen;
    EditText editText, editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = findViewById(R.id.btnOpen);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        btnOpen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

//        //명시적 인텐트, 값 전달 x
//        Intent intent = new Intent(MainActivity.this, SubActivity.class);
//        startActivity(intent);

        //명시적 인텐트, 값 전달
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        intent.putExtra("number1", Integer.parseInt(editText.getText().toString().trim()));
        intent.putExtra("number2", Integer.parseInt(editText2.getText().toString().trim()));

        //값을 가지고 보낸다.
        startActivityForResult(intent, 1000);
        //리퀘스트 코드란? : 포트번호처럼 사용할 수 있는 번호. 이건 사전에 약속을 하고 사용할 것.

    }

    //상대방 액티비티가 다시 값을 돌려줄때 감지하는 콜백함수
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent returndata) {
        super.onActivityResult(requestCode, resultCode, returndata);
        if (requestCode == 1000 && resultCode == 1001) {
            int sum = returndata.getIntExtra("sum", 0);
            Toast.makeText(getApplicationContext(), "sum" + sum, Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(getApplicationContext(), "이상해요....", Toast.LENGTH_LONG).show();
        }

    }
}
