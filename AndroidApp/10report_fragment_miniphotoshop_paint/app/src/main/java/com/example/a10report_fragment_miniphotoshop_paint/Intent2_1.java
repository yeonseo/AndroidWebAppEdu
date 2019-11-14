package com.example.a10report_fragment_miniphotoshop_paint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Intent2_1 extends AppCompatActivity implements View.OnClickListener {
    Button frag2intent1btnBack, frag2intent1btnGo;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2intent1);

        frag2intent1btnBack = findViewById(R.id.frag2intent1btnBack);
        frag2intent1btnGo = findViewById(R.id.frag2intent1btnGo);
        frag2intent1btnBack.setOnClickListener(this);
        frag2intent1btnGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frag2intent1btnBack:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.frag2intent1btnGo:
                intent = new Intent(this, Intent2Activity.class);
                startActivity(intent);
                finish();
                break;
        }
        finish();
    }

}
