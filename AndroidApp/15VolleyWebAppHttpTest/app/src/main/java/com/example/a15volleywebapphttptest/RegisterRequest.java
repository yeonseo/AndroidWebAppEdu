package com.example.a15volleywebapphttptest;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL = "http://yanbug.dothome.co.kr/Register.php";
    private Map<String, String> map;
    private String userID;
    private String userPassword;
    private String userName;
    private int userAge;

    public RegisterRequest(String userID, String userPassword, String userName, int userAge, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        this.map = new HashMap<>();
        this.userID = userID;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAge = userAge;

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
        map.put("userAge", String.valueOf(userAge));
        return map;
    }
}
