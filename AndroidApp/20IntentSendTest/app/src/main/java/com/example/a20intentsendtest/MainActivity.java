package com.example.a20intentsendtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    EditText edtContent;
    ArrayList<Data> datalist = new ArrayList<Data>();
    CharSequence charSequence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btnSend);
        edtContent = findViewById(R.id.edtContent);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datalist.add(new Data(201, "시청"));
                datalist.add(new Data(202, "남뽀"));
                datalist.add(new Data(203, "효동동"));
                datalist.add(new Data(204, "포비"));
                datalist.add(new Data(205, "기원"));
                datalist.add(new Data(206, "지누"));

                final Bundle bundle = new Bundle(3);
                bundle.putString("String","Bundle Go");
                bundle.putInt("Year",2019);
//                bundle.putParcelableArrayList("datalist",datalist);

                Intent intent = new Intent(MainActivity.this, ReceiveActivity.class);
                intent.putExtra("data", datalist);
                intent.putExtra("bundle",bundle);
                startActivity(intent);

            }
        });
        Log.d("MainActivity","onCreate");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }


    //방향전환, 메모리 풀 까지만 되기때문에 그 외의 상황은 SharedPreference 이용할 것.
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        charSequence = edtContent.getText();
        outState.putCharSequence("Text", charSequence);
        Log.d("MainActivity","onSaveInstanceState : "+charSequence.toString());
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        charSequence = savedInstanceState.getCharSequence("Text");
        edtContent.setText(charSequence);
        Log.d("MainActivity","onRestoreInstanceState : "+charSequence.toString());

    }
}
