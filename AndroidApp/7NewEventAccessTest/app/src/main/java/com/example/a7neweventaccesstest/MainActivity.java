package com.example.a7neweventaccesstest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ArrayList<String> list = new ArrayList<String>();
                list.add("apple");
                list.add("strowberry");
                list.add("orange");
                final String[] items = list.toArray(new String[list.size()]);

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("listBox");
                alertDialog.setItems(items, null);
                alertDialog.show();

                break;
            case R.id.btn2:
                ShowDialogOption();
                break;
            default:
                break;
        }
    }

    private void ShowDialogOption() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("strowberry");
        list.add("orange");
        final String[] items = list.toArray(new String[list.size()]);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("listBox");
        alertDialog.setSingleChoiceItems(items,-1, null);
        alertDialog.show();
    }

}
