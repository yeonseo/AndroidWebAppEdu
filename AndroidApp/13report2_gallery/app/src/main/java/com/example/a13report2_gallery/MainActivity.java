package com.example.a13report2_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Gallery gallery;
    public static ImageView ivPoster;
    public ArrayList<MyData> list = new ArrayList<MyData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("테스트", "onCreate");

        setTitle("Movie");

        gallery = findViewById(R.id.gallery1);
        ivPoster = findViewById(R.id.ivPoster);
        listInsertData();

        MyAdapter myAdapter = new MyAdapter(this, R.layout.gallery_view_layout, list);
        gallery.setAdapter(myAdapter);

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
            list.add(new MyData(posterID[(int) (Math.random() * (20))]));
        }
    }

    class MyAdapter extends BaseAdapter {
        Context context;
        ArrayList<MyData> list;
        int layout;

        private LayoutInflater layoutInflater;

        public MyAdapter(Context context, int layout, ArrayList<MyData> list) {
            this.context = context;
            this.list = list;
            this.layout = layout;
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
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(layout, null);
                Log.i("테스트", "MyCustomAdapter getView" + ", convertView : " + convertView + ", parent : " + parent + ", position : " + position);
            }
            final int pos = position;
            final ImageView imageView = convertView.findViewById(R.id.ivAdapter);
            final MyData myData = list.get(position);
            imageView.setImageResource(myData.getPoster());

            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    MyData myData1 = list.get(pos);
                    MainActivity.ivPoster.setImageResource(myData1.getPoster());
                    return false;
                }
            });

            return convertView;
        }
    }
}
