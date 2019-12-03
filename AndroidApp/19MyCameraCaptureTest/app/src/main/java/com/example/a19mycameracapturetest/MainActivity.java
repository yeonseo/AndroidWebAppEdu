package com.example.a19mycameracapturetest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgResult;
    private Button btnCapture;
    private String imgFilePath;
    private Uri photoUri;
    private static final int REQUEST_IMAGE_CATURE=672;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgResult=findViewById(R.id.imgResult);
        btnCapture=findViewById(R.id.btnCapture);

        TedPermission.with(getApplicationContext())
                .setPermissionListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {
                        toastDisplay("좋은 선택이였당");
                    }

                    @Override
                    public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                        toastDisplay("음.. 그럼 너 이거 사용 못 함");
                    }
                })
                .setRationaleMessage("카메라 권한이 필요합니다.")
                .setDeniedMessage("거부하면 안 되는게 많다능")
                .setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.CAMERA)
                .check();

        btnCapture.setOnClickListener(this);


    }

    private void toastDisplay(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnCapture) {
            //1. 카메라를 불러주세요.
            //카메라 앱을 부르는데 화면을 캡처해서 저장하는 기능의 앱을 작동해줘
            Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if(intent.resolveActivity(getPackageManager())!=null) {
                File photoFile=null;
                try {
                    photoFile=createImageFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                    photoUri = FileProvider.getUriForFile(getApplicationContext(), getPackageName(), photoFile);
                    //버전체크
                }else{
                    photoUri =Uri.fromFile(photoFile);
                }
                intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
                startActivityForResult(intent,REQUEST_IMAGE_CATURE);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==REQUEST_IMAGE_CATURE && resultCode==RESULT_OK) {
            Bitmap bitmap=BitmapFactory.decodeFile(imgFilePath);
            //속성을 확인해야 한다.
            //ex)사용자가 가로로 찍을 때 이미지가 가로로 보이게 해야한다.
            ExifInterface exifInterface=null; //여기에 속성이 들어있다.
            try {
                exifInterface=new ExifInterface(imgFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            int exifOrientation; //방향 설정값을 저장하는 변수
            int exifDegree; //Degree 설정값을 저장하는 변수

            if(exifInterface!=null) {
                exifOrientation=exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
                exifDegree=exifOrientationToDegress(exifOrientation);
            }else {
                exifDegree=0;
            }
            Bitmap bitmapTemp=rotate(bitmap, exifDegree);
            imgResult.setImageBitmap(bitmapTemp);

        }

    }

    //각도를 조절해서 다시만든 비트맵
    private Bitmap rotate(Bitmap bitmap, int exifDegree) {
        Matrix matrix=new Matrix();
        matrix.postRotate(exifDegree);
        Bitmap tempBitmap=Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return tempBitmap;
    }

    private int exifOrientationToDegress(int exifOrientation) {
        switch (exifOrientation) {
            case ExifInterface.ORIENTATION_ROTATE_90 :  return 90;
            case ExifInterface.ORIENTATION_ROTATE_180 :  return 180;
            case ExifInterface.ORIENTATION_ROTATE_270 :  return 270;
        }
        return 0;
    }

    private File createImageFile() throws IOException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timeStamp=simpleDateFormat.format(new Date());
        String imgFileName="test_"+timeStamp+"_";
        File storageDir=getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image=File.createTempFile(imgFileName, ".jpg", storageDir);
        //storage/emulated/0/Android/data/com.example.info1.mycapturetest/files/Pictures/test_20191127103123_~랜덤~.jpg
        imgFilePath=image.getAbsolutePath(); //주석처리된 위의 경로를 가져오는 것!

        return image;
    }
}