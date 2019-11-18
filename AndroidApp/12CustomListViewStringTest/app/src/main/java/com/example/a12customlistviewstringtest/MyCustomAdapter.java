package com.example.a12customlistviewstringtest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends BaseAdapter {
    //this를 저장할 멤버변수가 필요하다.
    private Context context;
    private int layout;
    private ArrayList<MyCustomDAO> data;

    //일반클래스에서 스스로 인플렉션을 진행하기 위해서 요청을 해야한다.
    private LayoutInflater layoutInflater;

    public MyCustomAdapter(Context context, int layout, ArrayList<MyCustomDAO> data) {
        this.context = context; //활동영역이 어디인가?
        this.layout = layout; //홀더
        this.data = data;
        Log.i("테스트", "MyCustomAdapter 생성자");
        //인틀렉터 할 수 있도록 기능을 요청하는 것.
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //속도 저하의 원인
    }

    //데이타 갯수를 리턴해준다.
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //홀더뷰를 가지고 온다.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(layout, null);
            Log.i("테스트", "MyCustomAdapter getView" + ", convertView : " + convertView + ", parent : " + parent + ", position : " + position);
        }
        TextView textView = convertView.findViewById(R.id.text1);
        MyCustomDAO myCustomDAO = data.get(position);
        textView.setText(myCustomDAO.getData());

        return convertView;
    }
}
