package com.example.a4report_reservation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer1;
    RadioButton rdoCal, rdoTime;
    DatePicker datePic;
    TimePicker timePic;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMin;
    int yy, mm, dd, hh, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간예약");

        chronometer1 = findViewById(R.id.chronometer1);
        rdoCal = findViewById(R.id.rdoCal);
        rdoTime = findViewById(R.id.rdoTime);
        datePic = findViewById(R.id.datePic);
        timePic = findViewById(R.id.timePic);
        tvYear = findViewById(R.id.tvYear);
        tvMonth = findViewById(R.id.tvMonth);
        tvDay = findViewById(R.id.tvDay);
        tvHour = findViewById(R.id.tvHour);
        tvMin = findViewById(R.id.tvMin);

        initVisible();

        //버튼대신 크로노 미터 꾸욱 누르기.셋 롱~
        //초기에는 모두다 숨김. 클릭시, 라디오 버튼 보이기, 년도 텍스트

        chronometer1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                chronometer1.setBase(SystemClock.elapsedRealtime());
                chronometer1.start();
                chronometer1.setTextColor(Color.RED);

                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);
                return false;
            }
        });


        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePic.setVisibility(View.VISIBLE);
                timePic.setVisibility(View.INVISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePic.setVisibility(View.INVISIBLE);
                timePic.setVisibility(View.VISIBLE);
            }
        });


        timePic.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hh = hourOfDay;
                min = minute;
            }
        });


        //버튼대신 텍스트 꾸욱 누르기.셋 롱~
        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                chronometer1.stop();

                tvYear.setText(String.valueOf(datePic.getYear()));
                tvMonth.setText(String.valueOf(datePic.getMonth()));
                tvDay.setText(String.valueOf(datePic.getDayOfMonth()));
                tvHour.setText(String.valueOf(hh));
                tvMin.setText(String.valueOf(min));
                initVisible();
                return false;
            }
        });
    }

    public void initVisible(){
        chronometer1.setVisibility(View.VISIBLE);
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);
        datePic.setVisibility(View.INVISIBLE);
        timePic.setVisibility(View.INVISIBLE);
    }

}
