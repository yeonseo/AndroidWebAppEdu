package com.example.a19customcalendartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    MonthAdapter monthViewAdapter;
    GridView monthView;
    Button monthPrevious, monthNext;
    TextView monthText;
    int curYear;
    int curMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monthView = findViewById(R.id.monthView);
        monthPrevious = findViewById(R.id.monthPrevious);
        monthNext = findViewById(R.id.monthNext);
        monthText = findViewById(R.id.monthText);


    }
}
