package com.example.a11imagevotetest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    TextView[] tv = new TextView[9];
    Integer[] tvID = {R.id.txt1, R.id.txt2, R.id.txt3,
            R.id.txt4, R.id.txt5, R.id.txt6,
            R.id.txt7, R.id.txt8, R.id.txt9};

    RatingBar[] rBar = new RatingBar[9];
    Integer[] rBarID = {R.id.star1, R.id.star2, R.id.star3,
            R.id.star4, R.id.star5, R.id.star6,
            R.id.star7, R.id.star8, R.id.star9};
    int[] count = new int[9];
    String[] ivName = new String[9];

    Button btnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        Intent inten = getIntent();
        count = inten.getIntArrayExtra("count");
        ivName = inten.getStringArrayExtra("ivName");

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        for (int i = 0; i < tvID.length; i++) {
            tv[i] = findViewById(tvID[i]);
            rBar[i] = findViewById(rBarID[i]);

            tv[i].setText(ivName[i]);
            rBar[i].setRating(count[i]);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //값을 가지고 보낸다.
        intent.putExtra("message","The End");
        setResult(RESULT_OK, intent);
        //요청,결과 코드란? : 포트번호처럼 사용할 수 있는 번호. 이건 사전에 약속을 하고 사용할 것.
        finish();

    }
}
