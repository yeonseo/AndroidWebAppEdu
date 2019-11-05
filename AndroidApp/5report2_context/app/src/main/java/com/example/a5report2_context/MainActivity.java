package com.example.a5report2_context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    float rotValue = 0f;
    float ivSize = 5f;

    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv1);
        iv1.setImageResource(R.mipmap.iv1);
        registerForContextMenu(iv1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        handlerContextAction(item);

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        handlerContextAction(item);
        return true;
    }

    public void handlerContextAction(MenuItem item){
        switch (item.getItemId()) {
            case R.id.option1:
                rotValue = rotValue + 45f;
                iv1.setRotation(rotValue);
                break;
            case R.id.option2:
                ivSize = ivSize+1f;
                iv1.setScaleX(ivSize);
                iv1.setScaleY(ivSize);
                break;
            case R.id.option3:
                ivSize = ivSize-1f;
                iv1.setScaleX(ivSize);
                iv1.setScaleY(ivSize);
                break;
            default:
                break;
        }
    }

}
