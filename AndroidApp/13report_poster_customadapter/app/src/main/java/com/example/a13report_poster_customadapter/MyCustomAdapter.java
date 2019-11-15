package com.example.a13report_poster_customadapter;

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

class MyCustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<MyCustomDAO> list;
    int layout;

    private LayoutInflater layoutInflater;

    public MyCustomAdapter(Context context, int layout, ArrayList<MyCustomDAO> list) {
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
        final MyCustomDAO myCustomDAO = list.get(position);
        imageView.setImageResource(myCustomDAO.getImage());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View viewDialog = v.inflate(context, R.layout.dialog, null);
                ImageView imageDialog = viewDialog.findViewById(R.id.ivDialog);
                MyCustomDAO myCustomDAO1 = list.get(position);
                imageDialog.setImageResource(myCustomDAO1.getImage());
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                dialog.setTitle(myCustomDAO1.getText1());
                dialog.setIcon(R.mipmap.icon);
                dialog.setView(viewDialog);
                dialog.setPositiveButton("close", null);
                dialog.show();
                Log.i("테스트", "MyCustomAdapter viewDialog" + ", viewDialog : " + viewDialog + ", position : " + position);
            }
        });

        return convertView;
    }
}
