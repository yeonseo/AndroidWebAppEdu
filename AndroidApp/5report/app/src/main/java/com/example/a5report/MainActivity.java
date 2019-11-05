package com.example.a5report;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    private TabHost tabHost;
    ArrayList<String> data = new ArrayList<String>();

    EditText editText;
    Button btnGo, btnBack, btnAdd;
    WebView webView;
    ImageView iv1,iv2;

    AutoCompleteTextView autoCompleteTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btnGo = findViewById(R.id.btnGo);
        btnBack = findViewById(R.id.btnBack);
        btnAdd = findViewById(R.id.btnAdd);
        webView = findViewById(R.id.webView);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);

        //브러우저를 가지고 옴
        webView.setWebViewClient(new CookWebViewClient());

        //웹 셋팅을 함
        final WebSettings webSet = webView.getSettings();
        //크고 작게하는 기능을 줌
        webSet.setBuiltInZoomControls(true);


        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        iv1.setImageResource(R.mipmap.ic_launcher);
        iv2.setImageResource(R.mipmap.ic_launcher2);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https://"+editText.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.goBack();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(autoCompleteTextView.getText().toString());
                Toast.makeText(getApplicationContext(),autoCompleteTextView.getText().toString(),Toast.LENGTH_LONG).show();

                //update로 해볼것
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                        MainActivity.this, android.R.layout.simple_dropdown_item_1line, data.toArray(new String[data.size()]));
                autoCompleteTextView.setAdapter(adapter);
            }
        });

        tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("WEB").setIndicator("WEB");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("IMAGE").setIndicator("IMAGE");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("SEARCH").setIndicator("DATA");
        tabSpec3.setContent(R.id.tab3);
        tabHost.addTab(tabSpec3);

        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("IMAGE").setIndicator("IMAGE");
        tabSpec4.setContent(R.id.tab4);
        tabHost.addTab(tabSpec4);

    }

    private class CookWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
