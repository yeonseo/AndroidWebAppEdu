package com.example.a12listviewstringtest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {
    ListView listView;
    ArrayList<String> arrayData = new ArrayList<String>();
    Button btnItemAdd;
    EditText edtItem;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        btnItemAdd = findViewById(R.id.btnItemAdd);
        edtItem = findViewById(R.id.edtItem);

        arrayDataInput();
        //정의되어있는 어뎁터를 사용한다.
        arrayAdapter= new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_single_choice, arrayData);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
        btnItemAdd.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    private void arrayDataInput() {

        for (int i = 0; i < 10; i++) {
            arrayData.add("data" + i);
        }

    }
    private void arrayDataInputAdd(String data) {

        arrayData.add(data);
//        listView.invalidate();
//        이것도 됨
        arrayAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> arrayAdapter, View view, int position, long id) {
        android.util.Log.i("액티비티", "view : " + view +
                ", position : " + position + ", id : " + id + ", data : " + arrayData.get(position));
    }

    @Override
    public void onClick(View v) {
        arrayDataInputAdd(edtItem.getText().toString());
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        android.util.Log.i("액티비티", "view : " + view +
                ", position : " + position + ", id : " + id + ", data : " + arrayData.get(position)+"REMOVE");
        arrayData.remove(position);
        arrayAdapter.notifyDataSetChanged();
        return false;
    }
}
