package com.example.a10report_fragment_miniphotoshop_paint;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Intent3Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    EditText edtText1, edtText2;
    RadioButton rdoSum, rdoSub, rdoMul, rdoDiv;
    Button btnCal;

    int cal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment3);

        edtText1 = findViewById(R.id.edtText1);
        edtText2 = findViewById(R.id.edtText2);
        rdoSum = findViewById(R.id.rdoSum);
        rdoSub = findViewById(R.id.rdoSub);
        rdoMul = findViewById(R.id.rdoMul);
        rdoDiv = findViewById(R.id.rdoDiv);
        btnCal = findViewById(R.id.btnCal);

        rdoSum.setOnCheckedChangeListener(this);
        rdoSub.setOnCheckedChangeListener(this);
        rdoMul.setOnCheckedChangeListener(this);
        rdoDiv.setOnCheckedChangeListener(this);
        btnCal.setOnClickListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rdoSum:
                cal = 1;
                break;
            case R.id.rdoSub:
                cal = 2;
                break;
            case R.id.rdoMul:
                cal = 3;
                break;
            case R.id.btnCal:
                cal = 4;
                break;
        }

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("number1", Integer.parseInt(edtText1.getText().toString().trim()));
        intent.putExtra("number2", Integer.parseInt(edtText2.getText().toString().trim()));
        intent.putExtra("cal", cal);

        //값을 가지고 보낸다.
        setResult(1001, intent);
        //요청,결과 코드란? : 포트번호처럼 사용할 수 있는 번호. 이건 사전에 약속을 하고 사용할 것.
        finish();
    }
}
