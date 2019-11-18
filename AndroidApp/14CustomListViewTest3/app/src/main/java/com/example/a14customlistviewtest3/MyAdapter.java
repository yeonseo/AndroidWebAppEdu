package com.example.a14customlistviewtest3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<MyData> list = new ArrayList<MyData>();

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
        if(convertView == null){
            convertView = layoutInflater.inflate(layout, null);
        }
        ImageView iv1 = convertView.findViewById(R.id.iv1);
        ImageView iv2 = convertView.findViewById(R.id.iv2);
        TextView txt1 = convertView.findViewById(R.id.txt1);
        TextView txt2 = convertView.findViewById(R.id.txt2);

        MyData myData = list.get(position);

        iv1.setImageResource(myData.getImgID());
        iv2.setImageResource(myData.getImgID());

        txt1.setText(myData.getTxt1());
        txt2.setText(myData.getTxt2());

        return convertView;
    }
}
