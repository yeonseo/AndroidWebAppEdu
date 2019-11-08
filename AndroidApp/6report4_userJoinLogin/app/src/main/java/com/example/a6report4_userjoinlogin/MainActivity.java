package com.example.a6report4_userjoinlogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    EditText edMainUserId,edMainUserPass;
    Button btnJoin,btnLogin;

    EditText edJoinUserId,edJoinUserPass,edJoinUserAge,edJoinUserAddress;
    EditText edUserId,edUserAge,edUserAddress;
    View joinView,loginView;


    boolean check = false;
    ArrayList<String[]> data = new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMainUserId = findViewById(R.id.edMainUserId);
        edMainUserPass = findViewById(R.id.edMainUserPass);
        btnJoin = findViewById(R.id.btnJoin);
        btnLogin = findViewById(R.id.btnLogin);

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogJoinAction();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edMainUserId.getText().toString();
                String password = edMainUserPass.getText().toString();
                if(data.size()>0){
                    for (String[] i : data){
                        if(i[0].equals(name)&&i[1].equals(password)){
                            alertDialogLoginAction();
                        }
                    }
                }else {
                    Toast.makeText(MainActivity.this, "?!!!!!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void alertDialogJoinAction(){
        joinView = View.inflate(MainActivity.this, R.layout.join_activity, null);
        AlertDialog.Builder viewDialog = new AlertDialog.Builder(MainActivity.this);
        viewDialog.setTitle("Membership Join");
        viewDialog.setView(joinView);

        edJoinUserId = joinView.findViewById(R.id.edJoinUserId);
        edJoinUserPass = joinView.findViewById(R.id.edJoinUserPass);
        edJoinUserAge = joinView.findViewById(R.id.edJoinUserAge);
        edJoinUserAddress = joinView.findViewById(R.id.edJoinUserAddress);

        viewDialog.setPositiveButton("Join", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] userData = {
                        edJoinUserId.getText().toString(),
                        edJoinUserPass.getText().toString(),
                        edJoinUserAge.getText().toString(),
                        edJoinUserAddress.getText().toString()
                };
                data.add(userData);
            }
        });
        viewDialog.show();

    }

    public void alertDialogLoginAction(){
        loginView = View.inflate(MainActivity.this, R.layout.login_activity, null);
        AlertDialog.Builder viewDialog = new AlertDialog.Builder(MainActivity.this);
        viewDialog.setTitle("Welcom~");
        viewDialog.setView(loginView);

        edUserId = loginView.findViewById(R.id.edUserId);
        edUserAge = loginView.findViewById(R.id.edUserAge);
        edUserAddress = loginView.findViewById(R.id.edUserAddress);

        String name = edMainUserId.getText().toString();
        edUserId.setText(name);
        for (String[] i : data){
            if(i[0].equals(name)){
                edUserAge.setText(i[2]);
                edUserAddress.setText(i[3]);
            }
        }

        viewDialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Bye", Toast.LENGTH_LONG).show();
            }
        });
        viewDialog.show();

    }
}
