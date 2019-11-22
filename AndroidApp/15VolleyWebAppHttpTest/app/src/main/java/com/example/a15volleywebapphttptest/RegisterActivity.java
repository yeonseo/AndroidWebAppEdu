package com.example.a15volleywebapphttptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegister;
    private EditText edtID, edtPassword, edtName, edtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtID = findViewById(R.id.edtID);
        edtPassword = findViewById(R.id.edtPassword);
        edtName = findViewById(R.id.edtName);
        edtAge = findViewById(R.id.edtAge);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String userID = edtID.getText().toString().trim();
        String userPassword = edtPassword.getText().toString().trim();
        String userName = edtName.getText().toString().trim();
        String userAge = edtAge.getText().toString().trim();
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    boolean success = jsonObject.getBoolean("success");
                    if (success) {
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        intent.putExtra("userID", edtID.getText().toString());
                        intent.putExtra("userPassword", edtPassword.getText().toString());
                        startActivity(intent);
                        toastDisplay("Register!!");
                    } else {
                        toastDisplay("Register fail...");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        //회원가입 완료되면 이 화면을 불러줌(아이디, 패스워드)
        RegisterRequest registerRequest = new RegisterRequest(userID, userPassword, userName, Integer.parseInt(userAge), responseListener);
        RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
        queue.add(registerRequest);
        Log.d("RegisterActivity", "회원가입완료");
    }

    private void toastDisplay(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
