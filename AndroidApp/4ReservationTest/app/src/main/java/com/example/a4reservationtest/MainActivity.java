package com.example.a4reservationtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chronometer1;
    Button btnStart, btnReserv;
    RadioButton rdoCal, rdoTime;
    CalendarView calView;
    TimePicker timePic;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMin;
    int yy, mm, dd, hh, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간예약");

        chronometer1 = findViewById(R.id.chronometer1);
        btnStart = findViewById(R.id.btnStart);
        btnReserv = findViewById(R.id.btnReserv);
        rdoCal = findViewById(R.id.rdoCal);
        rdoTime = findViewById(R.id.rdoTime);
        calView = findViewById(R.id.calView);
        timePic = findViewById(R.id.timePic);
        tvYear = findViewById(R.id.tvYear);
        tvMonth = findViewById(R.id.tvMonth);
        tvDay = findViewById(R.id.tvDay);
        tvHour = findViewById(R.id.tvHour);
        tvMin = findViewById(R.id.tvMin);

        calView.setVisibility(View.VISIBLE);
        timePic.setVisibility(View.INVISIBLE);

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);
                timePic.setVisibility(View.INVISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.INVISIBLE);
                timePic.setVisibility(View.VISIBLE);
            }
        });


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.setBase(SystemClock.elapsedRealtime());
                chronometer1.start();
                chronometer1.setTextColor(Color.RED);
            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                yy = year;
                mm = month;
                dd = dayOfMonth;


            }
        });


        timePic.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hh = hourOfDay;
                min = minute;
            }
        });

        btnReserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chronometer1.stop();

                tvYear.setText(String.valueOf(yy));
                tvMonth.setText(String.valueOf(mm+1));
                tvDay.setText(String.valueOf(dd));
                tvHour.setText(String.valueOf(hh));
                tvMin.setText(String.valueOf(min));

            }
        });

    }
}
