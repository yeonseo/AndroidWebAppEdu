package com.example.a7report_diary;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener, View.OnClickListener, View.OnFocusChangeListener, TextWatcher, View.OnLongClickListener {
    DatePicker datePicker;
    EditText editText;
    Button btnSave, btnExit;
    String filename, diary;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        editText = findViewById(R.id.editText);
        btnSave = findViewById(R.id.btnSave);
        btnExit = findViewById(R.id.btnExit);

        datePickerSetCurrent();

        datePicker.setOnDateChangedListener(this);
        editText.addTextChangedListener(this);
        btnSave.setOnClickListener(this);
        btnSave.setOnLongClickListener(this);

    }

    private void datePickerSetCurrent() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        filename = String.valueOf(year) + String.valueOf(month) + String.valueOf(day) + ".txt";
        readDiary();

        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {


            }
        });

        toastDisplay(filename);
    }


    //datePicker Action
    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        int month = monthOfYear + 1;
        filename = String.valueOf(year) + String.valueOf(month) + String.valueOf(dayOfMonth) + ".txt";
        readDiary();
    }


    //edtText Action
    @Override
    public void onClick(View v) {
        diary = editText.getText().toString().trim();
        if (diary.length() > 0) {
            switch (btnSave.getText().toString()) {
                case "저장하기":
                case "수정하기":
                    buttonTextSetting(2);
                    saveDiary();
                    break;
                case "삭제하기":
                    deleteDiary();
                    editText.setText("");
                    break;

            }
        } else {
            toastDisplay("Text empty!!");
        }

    }//end of onClick , btnSave Action

    @Override
    public boolean onLongClick(View v) {
        diary = editText.getText().toString().trim();
        if (diary.length() > 0&&btnSave.getText().toString().equals("수정하기")) {
            buttonTextSetting(3);
        } else {
            toastDisplay("Text empty!!");
        }
        return false;
    }//end of onLongClick , btnSave Action


    private void saveDiary() {
        try {
            FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
            diary = editText.getText().toString().trim();
            fos.write(diary.getBytes());
            fos.close();
            toastDisplay("system write : " + filename);
        } catch (Exception e) {
            toastDisplay("Save diary fail");
            e.printStackTrace();

        }
    }//end of saveDiary , btnSave Action

    private void readDiary() {
        FileInputStream fis = null;
        try {
            fis = openFileInput(filename);
            byte[] diary = new byte[fis.available()];
            fis.read(diary);
            editText.setText(new String(diary));
            buttonTextSetting(2);
        } catch (Exception e) {
            toastDisplay("No diary");
            editText.setText("");
            buttonTextSetting(1);
            e.printStackTrace();
        }
    }//end of onDateChanged , datePicker Action

    private void deleteDiary() {
        File file = new File(getFilesDir().getAbsolutePath() + "/" + filename);
        if (file.exists()) {
            file.delete();
            toastDisplay(filename + "삭제 완료");
        }
        buttonTextSetting(1);
    }

    private void buttonTextSetting(int num) {
        String btntxt = btnSave.getText().toString();
        switch (num) {
            case 1:
                btnSave.setText("저장하기");
                btnSave.setClickable(false);
                break;
            case 2:
                btnSave.setText("수정하기");
                btnSave.setClickable(false);
                break;
            case 3:
                btnSave.setText("삭제하기");
                btnSave.setClickable(false);
                break;
            case 4:
                btnSave.setClickable(true);
                break;
        }
    }

    private void toastDisplay(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    //editText 변화 감지.

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (editText.getText().length() > 0) {
            btnSave.setClickable(true);
        }
        buttonTextSetting(1);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        buttonTextSetting(4);
    }

    @Override
    public void afterTextChanged(Editable s) {
        buttonTextSetting(4);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        buttonTextSetting(4);
    }
}
