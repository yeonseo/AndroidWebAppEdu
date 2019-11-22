package com.example.a16report_database_adaptertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtNumber;
    private Button btnInit, btnInsert, btnUpdate, btnDelete, btnSelect;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<MyDB> arrayList = new ArrayList<MyDB>();
    public static myDBHelper myHelper;
    String name, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("가수 그룹 관리 DB (RecyclerView)");

        Log.i("테스트", "onCreate 1");
        edtName = (EditText) findViewById(R.id.edtName);
        edtNumber = (EditText) findViewById(R.id.edtNumber);

        btnInit = (Button) findViewById(R.id.btnInit);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnSelect = (Button) findViewById(R.id.btnSelect);

        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myHelper = new myDBHelper(this);

        arrayList = myHelper.arrayList;
        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);

        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("테스트", "btnInit");
                myHelper.queryAction("drop", edtName.getText().toString(), edtNumber.getText().toString());
                btnSelect.callOnClick();
                Log.i("테스트", "btnInit");
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!edtName.getText().toString().equals("") && !edtNumber.getText().toString().equals("")) {
                    myHelper.queryAction("insert", edtName.getText().toString(), edtNumber.getText().toString());
                    Toast.makeText(getApplicationContext(), "입력됨",
                            Toast.LENGTH_SHORT).show();
                    btnSelect.callOnClick();
                    edtClear();
                } else {
                    Toast.makeText(getApplicationContext(), "값 입력요망!!!",
                            Toast.LENGTH_SHORT).show();
                }
                Log.i("테스트", "btnInsert");
            }
        });

//        btnUpdate.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                sqlDB = myHelper.getWritableDatabase();
//                if (!edtName.getText().toString().equals("") && !edtNumber.getText().toString().equals("")) {
//                    sqlDB.execSQL("UPDATE groupTBL SET gNumber ="
//                            + edtNumber.getText() + " WHERE gName = '"
//                            + edtName.getText().toString() + "';");
//                    sqlDB.close();
//
//                    Toast.makeText(getApplicationContext(), "수정됨",
//                            Toast.LENGTH_SHORT).show();
//                    btnSelect.callOnClick();
//                    edtClear();
//                } else {
//                    Toast.makeText(getApplicationContext(), "값 입력요망!!!",
//                            Toast.LENGTH_SHORT).show();
//                }
//                Log.i("테스트", "btnUpdate");
//            }
//        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("테스트", "btnDelete1");
                if (edtName.getText().toString() != "") {
                    myHelper.queryAction("delete", edtName.getText().toString(), edtNumber.getText().toString());
                    Toast.makeText(getApplicationContext(), "삭제됨",
                            Toast.LENGTH_SHORT).show();
                    btnSelect.callOnClick();
                    edtClear();
                }
                Log.i("테스트", "btnDelete2");
            }
        });
        Log.i("테스트", "start of btnSelect");
        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myHelper.queryAction("select", edtName.getText().toString(), edtNumber.getText().toString());
                mainAdapter.notifyDataSetChanged();
                Log.i("테스트", "btnSelect5");
                edtClear();
            }
        });

        btnSelect.callOnClick();
    }

    private void edtClear() {
        edtName.setText("");
        edtNumber.setText("");
    }


}
