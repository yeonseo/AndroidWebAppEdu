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

public class Fragment1Activity extends Fragment implements View.OnClickListener {
        Button btnFrag1;
        View view;
        //Fragment import할 시 import androidx.fragment.app.Fragment;로 할 것. 조심!


    public Fragment1Activity() {
        }

        @Nullable
        @Override
        //setContentView와 같다.
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment1,container,false);
            btnFrag1 = view.findViewById(R.id.btnFrag1);
            btnFrag1.setOnClickListener(this);

            return view;
        }

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btnFrag1 :
                    displayToast("Hi");
                    break;
            }
        }

        private void displayToast(String message) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
}
