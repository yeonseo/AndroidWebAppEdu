package com.example.a6userinterfacetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvUserId, tvUserEmail;
    Button btnClick;
    View dialog, toast;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUserId = findViewById(R.id.tvUserId);
        tvUserEmail = findViewById(R.id.tvUserEmail);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = View.inflate(MainActivity.this, R.layout.dialog_activity, null);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("user Input");
                alertDialog.setIcon(R.mipmap.ic_launcher);
                alertDialog.setView(dialog);
                alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        EditText edUserId, edUserEmail;
                        edUserId = dialog.findViewById(R.id.edUserId);
                        edUserEmail = dialog.findViewById(R.id.edUserEmail);
                        tvUserId.setText(edUserId.getText().toString().trim());
                        tvUserEmail.setText(edUserEmail.getText().toString().trim());
                    }
                });

                alertDialog.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        toast = View.inflate(MainActivity.this, R.layout.toast_activity, null);
                        Toast toastdia = new Toast(MainActivity.this);
                        toastdia.setView(toast);
                        toastdia.show();
                    }
                });
                alertDialog.show();

            }
        });


    }
}
