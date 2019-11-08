package com.example.a6report3_imageboxtoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnView;
    RadioButton rdo1,rdo2,rdo3,rdo4;
    ImageView image;
    View imageView;
    int num;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnView = findViewById(R.id.btnView);
        rdo1 = findViewById(R.id.rdo1);
        rdo2 = findViewById(R.id.rdo2);
        rdo3 = findViewById(R.id.rdo3);
        rdo4 = findViewById(R.id.rdo4);

        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=R.drawable.food1; name = "연탄구이홍탄";
            }
        });

        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=R.drawable.food2; name = "엽기꼼닭발";
            }
        });

        rdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=R.drawable.food3; name = "스테이크&팟타이";
            }
        });

        rdo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=R.drawable.food4; name = "튀김족발";
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogAction(num, name);
            }
        });
    }
    public void alertDialogAction(int num, String name){
        imageView = View.inflate(MainActivity.this, R.layout.view_activity, null);
        AlertDialog.Builder viewDialog = new AlertDialog.Builder(MainActivity.this);
        viewDialog.setTitle("*^^*  "+name);
        viewDialog.setView(imageView);

        ImageView image = imageView.findViewById(R.id.image);
        image.setImageResource(num);

        viewDialog.setPositiveButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        viewDialog.show();

    }
}
