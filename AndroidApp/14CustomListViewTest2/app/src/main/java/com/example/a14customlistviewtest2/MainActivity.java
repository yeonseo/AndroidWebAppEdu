package com.example.a14customlistviewtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    Button btnInsert;
    ArrayList<MyData> list = new ArrayList<MyData>();
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnInsert = findViewById(R.id.btnInsert);

        dataSet();

        myAdapter = new MyAdapter(this, R.layout.list_item, list);
        listView.setAdapter(myAdapter);

        btnInsert.setOnClickListener(this);
    }

    private void dataSet() {
        for (int i = 0; i < 10; i++) {
            list.add(new MyData(R.mipmap.ic_launcher, "Num : " + i, "Content : " + i));
        }

    }

    @Override
    public void onClick(View v) {
        list.add(new MyData(R.mipmap.ic_launcher, "Num : " + list.size(), "Content : " + list.size()));
        myAdapter.notifyDataSetChanged();
    }
}
