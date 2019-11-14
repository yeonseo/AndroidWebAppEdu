package com.example.a10report_fragment_miniphotoshop_paint;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Templates;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FrameLayout frameLayout;
    //합칠 때 팀장이 하는 것
    Button btnMenu1, btnMenu2, btnMenu3;
    Intent intent;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        textView = findViewById(R.id.textView);

        btnMenu1.setOnClickListener(this);
        btnMenu2.setOnClickListener(this);
        btnMenu3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft =
                getSupportFragmentManager().beginTransaction();
        Fragment fragmentActivity = null;
        switch (v.getId()) {
            case R.id.btnMenu1:
                fragmentActivity = new Fragment1Activity();
                ft.replace(R.id.frameLayout, fragmentActivity);
                ft.commit();
                break;
            case R.id.btnMenu2:
                intent = new Intent(MainActivity.this, Intent2Activity.class);
                startActivity(intent);
                break;
            case R.id.btnMenu3:
                intent = new Intent(MainActivity.this, Intent3Activity.class);
                startActivityForResult(intent, 1000);
                break;
        }

    }

    //상대방 액티비티가 다시 값을 돌려줄때 감지하는 콜백함수
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent returndata) {
        super.onActivityResult(requestCode, resultCode, returndata);
        double result = 0.0;
        if (requestCode == 1000 && resultCode == 1001) {
            int cal = returndata.getIntExtra("cal", 1);
            int number1 = returndata.getIntExtra("number1", 0);
            int number2 = returndata.getIntExtra("number2", 0);

            switch (cal) {
                case 1:
                    result = (double) number1 + (double) number2;
                    break;
                case 2:
                    result = (double) number1 - (double) number2;
                    break;
                case 3:
                    result = (double) number1 * (double) number2;
                    break;
                case 4:
                    result = (double) number1 / (double) number2;
                    break;
            }
            textView.setText("result : " + result);
            Toast.makeText(getApplicationContext(), "result : " + result, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "이상해요....", Toast.LENGTH_LONG).show();
        }

    }
}
