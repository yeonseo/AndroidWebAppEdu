package com.example.a12implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDial, btnHomapage, btnGoogleMap, btnGoogleSearch, btnSms, btnPhoto, btnEnd;

    Uri uri = null;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);
        btnHomapage = findViewById(R.id.btnHomapage);
        btnGoogleMap = findViewById(R.id.btnGoogleMap);
        btnGoogleSearch = findViewById(R.id.btnGoogleSearch);
        btnSms = findViewById(R.id.btnSms);
        btnPhoto = findViewById(R.id.btnPhoto);
        btnEnd = findViewById(R.id.btnEnd);

        btnDial.setOnClickListener(this);
        btnHomapage.setOnClickListener(this);
        btnGoogleMap.setOnClickListener(this);
        btnGoogleSearch.setOnClickListener(this);
        btnSms.setOnClickListener(this);
        btnPhoto.setOnClickListener(this);
        btnEnd.setOnClickListener(this);

        android.util.Log.i("액티비티 테스트", "onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("액티비티 테스트", "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("액티비티 테스트", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("액티비티 테스트", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("액티비티 테스트", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("액티비티 테스트", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDial:
                handlerBtnDialAction();
                break;
            case R.id.btnHomapage:
                handlerBtnHomapageAction();
                break;
            case R.id.btnGoogleMap:
                handlerBtnGoogleMapAction();
                break;
            case R.id.btnGoogleSearch:
                handlerBtnGoogleSearchAction();
                break;
            case R.id.btnSms:
                handlerBtnSmsAction();
                break;
            case R.id.btnPhoto:
                handlerBtnPhotoAction();
                break;
            case R.id.btnEnd:
                finish();
                break;

        }
    }

    private void handlerBtnDialAction() {
        uri = Uri.parse("tel:/010-9991-9092");
        intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    private void handlerBtnHomapageAction() {
        uri = Uri.parse("http://m.naver.com");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void handlerBtnGoogleMapAction() {
        uri = Uri.parse("http://maps.google.com/maps?q=" + 37.554264 + "," + 126.913598);
        intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void handlerBtnGoogleSearchAction() {
        intent = new Intent(Intent.ACTION_WEB_SEARCH);
        startActivity(intent);
    }

    private void handlerBtnSmsAction() {
        intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra("sms_body", "HELLO");
        intent.setData(Uri.parse("smsto:" + Uri.encode("010-9991-9092")));
        startActivity(intent);
    }

    private void handlerBtnPhotoAction() {
        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }


}
