package com.example.a9fregmentviewtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2Activity extends Fragment {
    View view;
    //Fragment import할 시 import androidx.fragment.app.Fragment;로 할 것. 조심!


    public Fragment2Activity() {
    }

    @Nullable
    @Override
    //setContentView와 같다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2,container,false);

        return view;
    }

}
