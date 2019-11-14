package com.example.a11report_navi_frag_ratingbar_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class VoteActivity extends Fragment implements View.OnClickListener {

    View view;
    Intent intent;
    Button btnVote;
    ImageView[] viewlist = new ImageView[9];
    Integer[] ivID = {R.id.iv1, R.id.iv2, R.id.iv3,
            R.id.iv4, R.id.iv5, R.id.iv6,
            R.id.iv7, R.id.iv8, R.id.iv9};
    String[] ivName = {"Pic 1", "Pic 2", "Pic 3",
            "Pic 4", "Pic 5", "Pic 6",
            "Pic 7", "Pic 8", "Pic 9"};
    int[] count = new int[9];

    ArrayList<String> bestList = new ArrayList<String>();
    ArrayList<String> worstList = new ArrayList<String>();
    int bestStar = 0;
    int worstStar = 5;

    final static int REQUEST_CODE = 1000, RESULT_CODE = 1001;


    public VoteActivity() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_vote, container, false);
        btnVote = view.findViewById(R.id.btnVote);
        btnVote.setOnClickListener(this);
        for (int i = 0; i < viewlist.length; i++) {
            viewlist[i] = view.findViewById(ivID[i]);
            viewlist[i].setOnClickListener(this);
        }
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv1:
                ivCheked(0);
                break;
            case R.id.iv2:
                ivCheked(1);
                break;
            case R.id.iv3:
                ivCheked(2);
                break;
            case R.id.iv4:
                ivCheked(3);
                break;
            case R.id.iv5:
                ivCheked(4);
                break;
            case R.id.iv6:
                ivCheked(5);
                break;
            case R.id.iv7:
                ivCheked(6);
                break;
            case R.id.iv8:
                ivCheked(7);
                break;
            case R.id.iv9:
                ivCheked(8);
                break;
            case R.id.btnVote:
                bestCheked();
                intentView();
                break;
        }
    }

    private void ivCheked(int i) {
        count[i] = (count[i] == 5) ? (5) : (++count[i]);
        if (count[i] == 5) toastDisplay("최고점수를 주셨습니다.");
        else toastDisplay(ivName + " " + count[i]);
    }

    private void bestCheked() {
        for (int i : count) {
            bestStar = (bestStar < i) ? i : bestStar;
            worstStar = (worstStar > i) ? i : worstStar;
        }
        toastDisplay("최고 평점은 " + bestStar +"최저 평점은 " + worstStar);
        for (int i = 0; i < ivName.length; i++) {
            if (count[i] == bestStar) {
                bestList.add(ivName[i]);
                toastDisplay("최고 평점을 받은 그림 " + ivName[i]);
            } else if (count[i] == worstStar) {
                worstList.add(ivName[i]);
                toastDisplay("최저 평점을 받은 그림 " + ivName[i]);
            }
        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent returnIntent) {
        super.onActivityResult(requestCode, resultCode, returnIntent);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CODE) {
            String message = returnIntent.getStringExtra("message");
            toastDisplay(message+"  Good, number set default");
            for(int i = 0 ; i < ivName.length ; i++){
                count[i] = 0;
            }
            bestList.clear();
            worstList.clear();
        }
    }

    private void intentView() {
        intent = new Intent(getContext(), ResultActivity.class);
        intent.putExtra("ivName", ivName);
        intent.putExtra("count", count);
        intent.putExtra("bestList", bestList);
        intent.putExtra("worstList", worstList);
        startActivityForResult(intent, REQUEST_CODE);
    }

    private void toastDisplay(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_LONG).show();
    }
}
