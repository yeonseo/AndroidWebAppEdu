package com.example.a14khproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<MyData> list = new ArrayList<>();
    ListView listView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insert();

        listView = findViewById(R.id.listView);

        myAdapter = new MyAdapter(this, R.layout.my, list);
        listView.setAdapter(myAdapter);
    }

    private void insert() {
        for (int i = 0; i < 50; i++) {
            list.add(new MyData("안녕" + (i + 1)));
        }
    }

    public class MyData {
        private String tvName;

        public MyData(String tvName) {
            this.tvName = tvName;
        }

        public String getTvName() {
            return tvName;
        }

        public void setTvName(String tvName) {
            this.tvName = tvName;
        }
    }

    public class MyAdapter extends BaseAdapter {
        Context context;
        Integer layout;
        private ArrayList<MyData> list;
        LayoutInflater layoutInflater;

        public MyAdapter(Context context, Integer layout, ArrayList<MyData> list) {
            this.context = context;
            this.layout = layout;
            this.list = list;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(layout, null);
            }
            MyData myData = list.get(position);
            TextView textView = convertView.findViewById(R.id.tv);
            textView.setText(myData.getTvName());
            return convertView;
        }
    }
}
