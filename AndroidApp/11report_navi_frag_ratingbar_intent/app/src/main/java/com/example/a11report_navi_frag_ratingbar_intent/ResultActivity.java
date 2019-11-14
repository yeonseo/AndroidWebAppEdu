package com.example.a11report_navi_frag_ratingbar_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

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

    ArrayList<String> bestList = new ArrayList<String>();
    ArrayList<String> worstList = new ArrayList<String>();

    Button btnBack;
    Intent intent;
    TextView tvBest;
    int RESULT_CODE = 1001;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        intent = getIntent();
        count = intent.getIntArrayExtra("count");
        ivName = intent.getStringArrayExtra("ivName");
        bestList = intent.getStringArrayListExtra("bestList");
        worstList = intent.getStringArrayListExtra("worstList");

        btnBack = findViewById(R.id.btnBack);
        tvBest = findViewById(R.id.tvBest);
        btnBack.setOnClickListener(this);

        for (int i = 0; i < tvID.length; i++) {
            tv[i] = findViewById(tvID[i]);
            rBar[i] = findViewById(rBarID[i]);

            tv[i].setText(ivName[i]);
            rBar[i].setRating(count[i]);
        }
        String message = "";
        for (String i : bestList) {

            message = message + i + "\n";

            toastDisplay(i + " ");
        }
        tvBest.setText(message);

        message = "";
        String[] say = {"너무하다냥!!!", "다음엔 나도 뽑아 달라냥!!", "내가 귀엽다냥!!", "잊지 않겠다냥!!", "애옹애옹.."};
        for (String i : worstList) {
            int randon = (int) (Math.random() * (say.length));
            message = message + i + " : " + say[randon] + "\n";

        }
        toastDisplay(message);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), VoteActivity.class);
        //값을 가지고 보낸다.
        intent.putExtra("message", "The End");
        setResult(RESULT_CODE, intent);
        //요청,결과 코드란? : 포트번호처럼 사용할 수 있는 번호. 이건 사전에 약속을 하고 사용할 것.
        finish();
    }

    private void toastDisplay(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
