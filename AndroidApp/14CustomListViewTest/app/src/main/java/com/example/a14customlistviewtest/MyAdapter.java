package com.example.a14customlistviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<MyData> list;

    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int layout, ArrayList<MyData> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        final int pos = position;
        final ImageView imageView1 = convertView.findViewById(R.id.iv1);
        final ImageView imageView2 = convertView.findViewById(R.id.iv2);
        final TextView txtName = convertView.findViewById(R.id.txtName);
        final TextView txtContent = convertView.findViewById(R.id.txtContent);

        final MyData myData = list.get(position);
        imageView1.setImageResource(myData.getImgID());
        imageView2.setImageResource(myData.getImgID());
        txtName.setText(myData.getTxtName());
        txtContent.setText(myData.getTxtContent());

        return convertView;
    }
}
