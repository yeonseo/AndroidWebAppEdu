package com.example.a9report_fragment_web_file_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1Activity extends Fragment{
    EditText frag1EdtText;
    Button frag1BtnGo, frag1BtnBack;
    WebView frag1WebView;

    View view;

    //Fragment import할 시 import androidx.fragment.app.Fragment;로 할 것. 조심!
    public Fragment1Activity() {
    }

    @Nullable
    @Override
    //setContentView와 같다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        frag1EdtText = view.findViewById(R.id.frag1EdtText);
        frag1BtnGo = view.findViewById(R.id.frag1BtnGo);
        frag1BtnBack = view.findViewById(R.id.frag1BtnBack);
        frag1WebView = view.findViewById(R.id.frag1WebView);

        //브러우저를 가지고 옴
        frag1WebView.setWebViewClient(new CookWebViewClient());

        //웹 셋팅을 함
        final WebSettings webSet = frag1WebView.getSettings();
        //크고 작게하는 기능을 줌
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true); // 웹페이지 자바스클비트 허용 여부
        webSet.setSupportMultipleWindows(false); // 새창 띄우기 허용 여부
        webSet.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
        webSet.setLoadWithOverviewMode(true); // 메타태그 허용 여부
        webSet.setUseWideViewPort(true); // 화면 사이즈 맞추기 허용 여부
        webSet.setSupportZoom(false); // 화면 줌 허용 여부
        webSet.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
        webSet.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠 사이즈 맞추기
        webSet.setCacheMode(WebSettings.LOAD_NO_CACHE); // 브라우저 캐시 허용 여부
        webSet.setDomStorageEnabled(true); // 로컬저장소 허용 여부


        frag1BtnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag1WebView.loadUrl("https://" + frag1EdtText.getText().toString());
            }
        });

        frag1BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag1WebView.goBack();
            }
        });

        return view;
    }

    private void displayToast(String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    private class CookWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
