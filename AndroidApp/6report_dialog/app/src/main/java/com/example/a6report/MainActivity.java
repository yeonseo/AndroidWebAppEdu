package com.example.a6report;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDialog,btnDialogSinlge,btnDialogMulti;
    TextView textView;
    final String[] versionArray = new String[] {"누가", "오레오","파이" };
    String select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialog = findViewById(R.id.btnDialog);
        btnDialogMulti = findViewById(R.id.btnDialogMulti);
        btnDialogSinlge = findViewById(R.id.btnDialogSinlge);
        textView = findViewById(R.id.textView);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("어떤 모델이 좋은가요?");
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText(versionArray[which]);
                    }
                });
                dialog.setPositiveButton("close", null);
                dialog.show();

            }
        });

        btnDialogSinlge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("어떤 모델이 좋은가요?");
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setSingleChoiceItems(versionArray,0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        select = versionArray[which];

                    }
                });
                dialog.setPositiveButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText(select);
                    }
                });
                dialog.show();
            }
        });

        btnDialogMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean[] checkedArray = new boolean[]{true, false, false};
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("어떤 모델이 좋은가요?");
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setMultiChoiceItems(versionArray, checkedArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkedArray[which] = isChecked;
                        select = "";
                        for(int i = 0;  i < checkedArray.length ; i++){
                            if(checkedArray[i]==true) {
                                select = select +" "+ versionArray[i];
                            }
                        }

                    }
                });
                dialog.setPositiveButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText(select);
                    }
                });
                dialog.show();
            }
        });

    }
}
