package com.example.a14customlistviewtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    Button btnAdd;
    ArrayList<MyData> list = new ArrayList<MyData>();
    MyAdapter myAdapter;

    int[] imgList = {R.drawable.img01, R.drawable.img02, R.drawable.img03,
            R.drawable.img04, R.drawable.img05, R.drawable.img06, R.drawable.img07};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btnAdd);

        dataSet();

        myAdapter = new MyAdapter(this, R.layout.list_item, list);
        listView.setAdapter(myAdapter);

btnAdd.setOnClickListener(this);
    }

    private void dataSet() {
        for (int i = 0; i < 4; i++) {
            list.add(new MyData(imgList[i], "Name : " + i, "Content : " + i));
        }
    }

    @Override
    public void onClick(View v) {
        if(list.size()<6){
            list.add(new MyData(imgList[list.size()], "Name : " + list.size(), "Content : " + list.size()));
        }else {
            list.add(new MyData(imgList[6], "Name : " + list.size(), "Content : " + list.size()));
        }

        myAdapter.notifyDataSetChanged();
    }
}
