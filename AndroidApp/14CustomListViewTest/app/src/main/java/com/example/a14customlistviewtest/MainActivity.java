package com.example.a14customlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView listView;
    public ArrayList<MyData> list = new ArrayList<MyData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Test");
        dataSet();

        listView = findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, list);
        listView.setAdapter(myAdapter);
    }

    private void dataSet() {
        for(int i = 0 ; i<10 ; i++){
            list.add(new MyData(R.mipmap.ic_launcher, "NAME : "+i,"CONTENT : "+i));
        }
    }
}
