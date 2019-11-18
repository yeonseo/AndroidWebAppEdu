package com.example.a14project12_1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MyDBHelper myDBHelper;
    SQLiteDatabase sqLiteDatabase;
    EditText edtName, edtNumber;
    Button btnInit, btnInsert, btnSelect;
    TextView txtName, txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Singer Manager");

        edtName = findViewById(R.id.edtName);
        edtNumber = findViewById(R.id.edtNumber);
        btnInit = findViewById(R.id.btnInit);
        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);
        txtName = findViewById(R.id.txtName);
        txtNumber = findViewById(R.id.txtNumber);

        myDBHelper = new MyDBHelper(this);

        btnInit.setOnClickListener(this);
        btnInsert.setOnClickListener(this);
        btnSelect.setOnClickListener(this);
        Log.i("테스트", "onCreate");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInit:
                Log.i("테스트", "onClick 1");
                handlerBtnInitAction();
                break;
            case R.id.btnInsert:
                Log.i("테스트", "onClick 2");
                handlerBtnInsertAction();
                break;
            case R.id.btnSelect:
                Log.i("테스트", "onClick 3");
                handlerBtnSelectAction();
                break;

        }

    }

    private void handlerBtnInitAction() {
        sqLiteDatabase = myDBHelper.getWritableDatabase();
        myDBHelper.onUpgrade(sqLiteDatabase, 1, 2);
        sqLiteDatabase.close();
    }

    private void handlerBtnInsertAction() {
        sqLiteDatabase = myDBHelper.getWritableDatabase();
        String str = "INSERT INTO groupTBL VALUES('"+edtName.getText().toString().trim()+
                "', "+Integer.parseInt(edtNumber.getText().toString().trim())+");";
        sqLiteDatabase.execSQL(str);
        sqLiteDatabase.close();
        Toast.makeText(getApplicationContext(), "입력됨", Toast.LENGTH_SHORT).show();
        Log.i("테스트", "handlerBtnInsertAction : 입력됨");
    }

    private void handlerBtnSelectAction() {
        sqLiteDatabase = myDBHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("SELECT * FROM groupTBL;", null);

        String strNames = "그룹이름" + "\r\n"+"-----"+"\r\n";
        String strNumbers = "인원" + "\r\n"+"-----"+"\r\n";

        while (cursor.moveToNext()){
            strNames+=cursor.getString(0)+"\r\n";
            strNumbers+=cursor.getString(1)+"\r\n";
        }

        txtName.setText(strNames);
        txtNumber.setText(strNumbers);

        cursor.close();
        sqLiteDatabase.close();

        Log.i("테스트", "handlerBtnSelectAction : strNames : " + strNames);
    }

}
