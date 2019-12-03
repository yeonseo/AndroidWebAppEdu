package com.example.a18mymovieplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback, View.OnClickListener {
    private Button btnRecordStart, btnRecordStop;
    private SurfaceView surfaceView;
    //위젯의 surfaceHolder를 가져온다.
    private SurfaceHolder surfaceHolder;
    private MediaRecorder mediaRecorder;

    //import android.hardware.Camera;
    private Camera camera;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecordStart = findViewById(R.id.btnRecordStart);
        btnRecordStop = findViewById(R.id.btnRecordStop);
        surfaceView = findViewById(R.id.surfaceView);

        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

        //다이얼로그 창에서 진행하는 퍼미션 라이브러리 (박상권)
        TedPermission.with(this)
                .setPermissionListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {
                        toastDisplay("Good Job!");
                    }

                    @Override
                    public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                        toastDisplay("후회할텐데...!");
                    }
                })
                .setRationaleMessage("녹화권한 허용여부")
                .setDeniedMessage("녹화권한 허용 거부")
                .setPermissions(Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.RECORD_AUDIO)
                .check();

        btnRecordStart.setOnClickListener(this);
        btnRecordStop.setOnClickListener(this);

    }

    private void toastDisplay(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        //Surface가 준비되었으므로 스레드를 시작한다.
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
        //Surface가 변경됨.
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        //Surface가 소멸되었으므로 스레드를 종료한다.
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRecordStart:
                //성공했을 때,
                btnRecordStart.setEnabled(false);
                btnRecordStop.setEnabled(true);

                camera = Camera.open();
                camera.setDisplayOrientation(90);
                try {
                    if (camera == null) {
                    } else {
                        camera.setPreviewDisplay(surfaceHolder);
                        camera.startPreview();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    Log.d("카메라 테스트", "onClick btnRecordStart");
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            toastDisplay("녹화 시작");

                            //녹화(레코드) 준비
                            mediaRecorder = new MediaRecorder();

                            //카메라를 작동시키기 위해서 잠금해제
                            camera.unlock();
                            mediaRecorder.setCamera(camera);
                            //동영상 촬영 시 나오는 소리 세팅
                            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.CAMCORDER);
                            //동영상 촬영 할 카메라 선택(카메라에서 오는 정보를 가지고 녹화하겠다.)
                            mediaRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
                            //해상도를 세팅
                            mediaRecorder.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_720P));
                            mediaRecorder.setOrientationHint(90);
                            mediaRecorder.setOutputFile("/sdcard/test" + num++ + ".mp4");
                            mediaRecorder.setPreviewDisplay(surfaceHolder.getSurface());
                            mediaRecorder.prepare();
                            mediaRecorder.start();
                        } catch (IOException e) {
                            e.printStackTrace();
                            mediaRecorder.release();
                            camera.release();
                        }
                    }
                });

                //카메라 각도 셋팅

                break;
            case R.id.btnRecordStop:
                btnRecordStart.setEnabled(true);
                btnRecordStop.setEnabled(false);

                //녹화하는 과정을 정지시킴
                mediaRecorder.stop();
                mediaRecorder.release();

                //카메라 기능을 정지시킴
                camera.lock();

                if (camera != null) {
                    camera.stopPreview();
                    camera.release();
                    camera = null;
                }

                break;
        }
    }
}
