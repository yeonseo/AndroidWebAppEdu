package com.example.a13gridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<MyData> list = new ArrayList<MyData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Movie");

        gridView = findViewById(R.id.gridView);
        listInsertData();

        MyAdapter myAdapter = new MyAdapter(this, R.layout.image_view_layout, list);

        gridView.setAdapter(myAdapter);


    }

    private void listInsertData() {
        Integer[] posterID = {R.drawable.cat0001, R.drawable.cat0002, R.drawable.cat0003
                , R.drawable.cat0004, R.drawable.cat0005, R.drawable.cat0006
                , R.drawable.cat0007, R.drawable.cat0008, R.drawable.cat0009
                , R.drawable.cat0010, R.drawable.cat0011, R.drawable.cat0012
                , R.drawable.cat0013, R.drawable.cat0015, R.drawable.cat0016
                , R.drawable.cat0017, R.drawable.cat0018, R.drawable.cat0019
                , R.drawable.cat0020, R.drawable.cat0021, R.drawable.cat0022
                , R.drawable.cat0023, R.drawable.cat0024, R.drawable.cat0025
                , R.drawable.cat0026, R.drawable.cat0028, R.drawable.cat0029, R.drawable.cat0030};


        for (int i = 0; i < 15; i++) {
            list.add(new MyData(posterID[(int) (Math.random() * (30))]));
        }
    }
}
