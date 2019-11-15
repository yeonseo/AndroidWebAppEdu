package com.example.a13gridviewtest;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
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
        final ImageView imageView = convertView.findViewById(R.id.ivAdapter);
        final MyData myData = list.get(position);
        imageView.setImageResource(myData.getPoster());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View viewDialog = v.inflate(context,R.layout.dialog, null);
                ImageView imageDialog = viewDialog.findViewById(R.id.iv1);
                MyData myData1 = list.get(position);
                imageDialog.setImageResource(myData1.getPoster());
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                dialog.setTitle(myData1.getPoster().toString());
                dialog.setIcon(R.mipmap.icon);
                dialog.setView(viewDialog);
                dialog.setPositiveButton("close",null);
                dialog.show();
            }
        });

        return convertView;
    }
}
