package com.example.a9report_fragment_web_file_;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import java.io.File;

import static android.content.Context.MODE_PRIVATE;

public class Fragment2Activity extends Fragment implements View.OnClickListener {
    private Button frag2BtPrevious, frag2BtNext;
    private MyPictureView myPictureView;
    private File[] imageFile;
    private TextView frag2TxtFileNum,frag2TxtFileName;
    private int currentPoint = 0;
    View view;

    public Fragment2Activity() {
    }

    @Nullable
    @Override
    //setContentView와 같다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);
        frag2BtPrevious = view.findViewById(R.id.frag2BtPrevious);
        frag2BtNext = view.findViewById(R.id.frag2BtNext);
        myPictureView = view.findViewById(R.id.myPictureView);
        frag2TxtFileNum = view.findViewById(R.id.frag2TxtFileNum);
        frag2TxtFileName = view.findViewById(R.id.frag2TxtFileName);

        ActivityCompat.requestPermissions((Activity) getContext(), new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        imageFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/Naver").listFiles();

        myPictureView.setSrc(imageFile[0].toString().trim());
        myPictureView.invalidate();

        frag2BtPrevious.setOnClickListener(this);
        frag2BtNext.setOnClickListener(this);
        return view;
    }

    private void displayToast(String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.frag2BtPrevious : imageChangePrevious();
                break;
            case R.id.frag2BtNext : imageChangeNext();
                break;
        }
    }
    private void imageChangeNext() {
        currentPoint += 1;
        currentPoint = (currentPoint>imageFile.length-1)?(0):(currentPoint);
        myPictureView.setSrc(imageFile[currentPoint].toString());
        frag2TxtFileNum.setText((currentPoint+1)+" / "+(imageFile.length-1));
        frag2TxtFileName.setText(imageFile[currentPoint].toString().trim());
        //이미지 소스가 변경되었다. 즉시 다시 그려라.
        myPictureView.invalidate();
    }

    private void imageChangePrevious() {
        currentPoint -= 1;
        currentPoint = (currentPoint<0)?(imageFile.length-1):(currentPoint);
        myPictureView.setSrc(imageFile[currentPoint].toString());
        frag2TxtFileNum.setText((currentPoint+1)+" / "+(imageFile.length-1));
        frag2TxtFileName.setText(imageFile[currentPoint].toString().trim());
        //이미지 소스가 변경되었다. 즉시 다시 그려라.
        myPictureView.invalidate();
    }
}
