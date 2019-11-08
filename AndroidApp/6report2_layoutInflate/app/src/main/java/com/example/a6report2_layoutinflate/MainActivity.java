package com.example.a6report2_layoutinflate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnInfoEdit;
    EditText edMainUserId,edMainUserEmail;
    View userInfoEditView,  toastView;

    EditText edUserId, edUserEmail;
    String test1;
    String test2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInfoEdit = findViewById(R.id.btnInfoEdit);
        edMainUserId = findViewById(R.id.edMainUserId);
        edMainUserEmail = findViewById(R.id.edMainUserEmail);



        btnInfoEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1 = edMainUserId.getText().toString();
                test2 = edMainUserEmail.getText().toString();

                userInfoEditView = View.inflate(MainActivity.this, R.layout.user_interface_activity, null);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("User Info Edit");
                alertDialog.setIcon(R.mipmap.edit);
                alertDialog.setView(userInfoEditView);

                edUserId = userInfoEditView.findViewById(R.id.edUserId);
                edUserEmail = userInfoEditView.findViewById(R.id.edUserEmail);

                edUserId.setText(test1);
                edUserEmail.setText(test2);

                alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edMainUserId.setText(edUserId.getText().toString());
                        edMainUserEmail.setText(edUserEmail.getText().toString());
                    }
                });
                alertDialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toastView = View.inflate(MainActivity.this, R.layout.toast_activity, null);
                        Toast toast = new Toast(MainActivity.this);
                        toast.setView(toastView);
                        toast.show();

                    }
                });
                alertDialog.show();
            }
        });

    }
}
