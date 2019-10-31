package com.example.a1nugaoreo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editMessage;
    Button btnShow, btnHome;
    RadioButton rdoSun, rdoRain;
    ImageView ivShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Soso... app");

        editMessage = (EditText)findViewById(R.id.editMessage);
        btnShow = (Button)findViewById(R.id.btnShow);
        btnHome = (Button)findViewById(R.id.btnHome);
        rdoSun = (RadioButton)findViewById(R.id.rdoSun);
        rdoRain = (RadioButton)findViewById(R.id.rdoRain);
        ivShow = (ImageView)findViewById(R.id.ivShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editMessage.getText().toString().trim();
                toastDisplay(message);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4.Intent
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("http://m."+editMessage.getText()));
                startActivity(intent);
            }
        });

        rdoSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivShow.setImageResource(R.drawable.cat0033);
            }
        });

        rdoRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivShow.setImageResource(R.drawable.cat0034);
            }
        });

    }//end of onCreate()

    public void toastDisplay(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }
}
