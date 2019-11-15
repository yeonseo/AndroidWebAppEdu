package com.example.a13report3_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView ivPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너 테스트");

        final String[] movie = {"쿵푸팬더", "짱구는 못말려", "아저씨", "아바타", "대부", "국가대표", "토이스토리3", "마당을 나온 암탉", "죽은 시인의 사회", "서유기"};
        final Integer[] posterID = {R.drawable.mov21, R.drawable.mov22,
                R.drawable.mov23, R.drawable.mov24, R.drawable.mov25,
                R.drawable.mov26, R.drawable.mov27, R.drawable.mov28,
                R.drawable.mov29, R.drawable.mov30};

        spinner = findViewById(R.id.spinner1);
        ivPoster = findViewById(R.id.ivPoster);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, movie);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ivPoster = (ImageView) findViewById(R.id.ivPoster);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setPadding(5, 5, 5, 5);
                ivPoster.setImageResource(posterID[position]);
                Toast.makeText(getApplicationContext(), movie[position],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
