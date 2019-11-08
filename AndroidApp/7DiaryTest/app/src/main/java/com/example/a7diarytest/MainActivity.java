package com.example.a7diarytest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener, View.OnClickListener {
    DatePicker datePicker;
    EditText editText;
    Button button;
    String filename,diary;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        //현재시간으로 설정한다.
        datePickerSetCurrent();
        //날짜 선택을 하면 이벤트 처리.
        datePicker.setOnDateChangedListener(this);
        //일기저장을 하는 기능을 하는 이벤트.
        button.setOnClickListener(this);
    }

    public void datePickerSetCurrent() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        datePicker.init(year, month, day, null);

    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        try{
            filename = String.valueOf(year) + String.valueOf(monthOfYear) + String.valueOf(dayOfMonth) + ".txt";
            readDiary();
        }catch (Exception e){

        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                saveDiary();
                break;
        }
    }

    private void saveDiary() {
        try {
            FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
            diary = editText.getText().toString().trim();
            //내용을 적었을 때만 저장이 일어나도록 한다.
            if (diary.length() > 0) {
                fos.write(diary.getBytes());
                fos.close();
            } else {
                toastDisplay("Text empty!!");
            }

            if(editText.getText().equals("수정하기")){
                button.setText("저장하기");
            }

        } catch (Exception e) {
            e.printStackTrace();
            toastDisplay("system write : " + filename);
        }
    }

    private void readDiary() {
        FileInputStream fis = null;
        try {
            fis = openFileInput(filename);
            byte[] diary = new byte[fis.available()];
            fis.read(diary);
            editText.setText(new String(diary));
            button.setText("수정하기");

        } catch (IOException e) {
            toastDisplay("No diary");
            e.printStackTrace();
            button.setText("저장하기");
            editText.setText("");
        }
        try {
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void toastDisplay(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}

