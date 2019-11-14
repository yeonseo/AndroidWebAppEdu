package com.example.a11imagevotetest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private
    Button btnVote;
    ImageView[] viewlist = new ImageView[9];
    Integer[] ivID = {R.id.iv1, R.id.iv2, R.id.iv3,
            R.id.iv4, R.id.iv5, R.id.iv6,
            R.id.iv7, R.id.iv8, R.id.iv9};
    String[] ivName = {"Pic 1", "Pic 2", "Pic 3",
            "Pic 4", "Pic 5", "Pic 6",
            "Pic 7", "Pic 8", "Pic 9"};

    int[] count = new int[9];
    final static int REQUEST_CODE = 1000, RESULT_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVote = findViewById(R.id.btnVote);
        btnVote.setOnClickListener(this);
        for (int i = 0; i < viewlist.length; i++) {
            viewlist[i] = findViewById(ivID[i]);
            viewlist[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv1:
                ivCheked(0);
                break;
            case R.id.iv2:
                ivCheked(1);
                break;
            case R.id.iv3:
                ivCheked(2);
                break;
            case R.id.iv4:
                ivCheked(3);
                break;
            case R.id.iv5:
                ivCheked(4);
                break;
            case R.id.iv6:
                ivCheked(5);
                break;
            case R.id.iv7:
                ivCheked(6);
                break;
            case R.id.iv8:
                ivCheked(7);
                break;
            case R.id.iv9:
                ivCheked(8);
                break;
            case R.id.btnVote:
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("ivName", ivName);
                intent.putExtra("count", count);
                startActivityForResult(intent, REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent returnIntent) {
        super.onActivityResult(requestCode, resultCode, returnIntent);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String message = returnIntent.getStringExtra("message");
            toastDisplay(message+"  Good, number set default");
            for(int i = 0 ; i < ivName.length ; i++){
                count[i] = 0;
            }
        }
    }

    public void ivCheked(int num) {
        count[num] = (count[num] == 5) ? (5) : (++count[num]);
        if (count[num] == 5) toastDisplay("최고점수를 주셨습니다.");
        else toastDisplay(ivName + " " + count[num]);
    }

    private void toastDisplay(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
