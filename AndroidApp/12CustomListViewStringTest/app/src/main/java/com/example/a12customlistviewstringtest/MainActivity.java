package com.example.a12customlistviewstringtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    ArrayList<MyCustomDAO> list = new ArrayList<MyCustomDAO>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("테스트", "onCreate");
        listView = findViewById(R.id.listView);
        listInsertData();

        MyCustomAdapter adapter = new MyCustomAdapter(getApplicationContext(), R.layout.list_item_data, list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    private void listInsertData() {
        Log.i("테스트", "listInsertData");
        MyCustomDAO myCustomDAO;
        for (int i = 0; i < 20; i++) {
            myCustomDAO = new MyCustomDAO("임채민 " + i);
            Log.i("테스트", "listInsertData" + i);
            list.add(myCustomDAO);

        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("테스트", "position : " + position + ", id : " + id);
    }
}
