package com.example.a10miniphotoshoptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ibZoomIn, ibZoomOut, ibRotate, ibBright, ibDark, ibGray;
    LinearLayout llBitmap;
    float scaleX = 1.0f, scaleY = 1.0f, color = 1.0f, satur = 1.0f, angle = 0.0f;
    MyGraphicView myGraphicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibZoomIn = findViewById(R.id.ibZoomIn);
        ibZoomOut = findViewById(R.id.ibZoomOut);
        ibRotate = findViewById(R.id.ibRotate);
        ibBright = findViewById(R.id.ibBright);
        ibDark = findViewById(R.id.ibDark);
        ibGray = findViewById(R.id.ibGray);
        llBitmap = findViewById(R.id.llBitmap);

        myGraphicView = new MyGraphicView(this); //this = setContentView(R.layout.activity_main);에 있는 컨택스
        llBitmap.addView(myGraphicView);

        ibZoomIn.setOnClickListener(this);
        ibZoomOut.setOnClickListener(this);
        ibRotate.setOnClickListener(this);
        ibBright.setOnClickListener(this);
        ibDark.setOnClickListener(this);
        ibGray.setOnClickListener(this);

        ibZoomIn.callOnClick();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibZoomIn:
                scaleX += 0.2f;
                scaleY += 0.2f;
                break;
            case R.id.ibZoomOut:
                scaleX -= 0.2f;
                scaleY -= 0.2f;
                break;
            case R.id.ibRotate:
                angle += 20.0f;
                break;
            case R.id.ibBright:
                color += 0.2f;
                break;
            case R.id.ibDark:
                color -= 0.2f;
                break;
            case R.id.ibGray:
                satur = (satur == 0) ? (1) : (0);
                break;
        }
        myGraphicView.invalidate();
    }

    private class MyGraphicView extends View {

        public MyGraphicView(Context context) {
            super(context);
        }

        public MyGraphicView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lena256);

            //MyGraphicView의 중심점 구하기
            int centerX = this.getWidth() / 2;
            int centerY = this.getHeight() / 2;

            //스케일을 정하기
            canvas.scale(scaleX, scaleY, centerX, centerY);

            canvas.rotate(angle, centerX, centerY);
            //붓을 결정
            Paint paint = new Paint();

            //명암 조절하기 위한 배열
            float[] array = {color, 0, 0, 0, -25, 0, color, 0, 0, -25, 0, 0, color, 0, -25, 0, 0, 0, 1, 0};

            ColorMatrix colorMatrix = new ColorMatrix(array);

            if (satur == 0.0) {
                colorMatrix.setSaturation(0.0f);
            }
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));

            //비트맵을 캔버스 중앙에 그리기 위해서 좌표계산
            int picX = (this.getWidth() - bitmap.getWidth()) / 2;
            int picY = (this.getHeight() - bitmap.getHeight()) / 2;

            //캔버스에 비트맵을 그린다.
            canvas.drawBitmap(bitmap, picX, picY, paint);

            //비트맵을 메모리 버퍼기능을 한다. 한꺼번에 올리면 부담이 되므로..!
            bitmap.recycle();

        }
    }//end of MyGraphicView
}
