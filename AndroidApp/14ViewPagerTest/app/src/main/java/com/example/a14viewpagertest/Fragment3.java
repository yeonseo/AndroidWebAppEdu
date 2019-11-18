package com.example.a14viewpagertest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    TextView txtFragment3;
    View view;

    //뷰페이저를 통해서 슬라이딩이나 탭키를 눌러서 뷰페이저 프레그먼트가 변경이 되려면
    //이 정보를 현 프레그먼트상태를 저장하는 변수가 필요하다.싱글톤과 흡사하다.

    public static Fragment3 newInstance(){
        Fragment3 fragment3 = new Fragment3();
        return fragment3;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, container, false);
        return view;
    }
}
