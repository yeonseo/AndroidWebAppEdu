package com.example.a9graphiccanvastest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    private class MyGraphicView extends View {

        public MyGraphicView(Context context) {
            super(context);
        }

        public MyGraphicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.GREEN);
            canvas.drawLine(10, 10, 300, 10, paint);

            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(5);
            canvas.drawLine(10, 30, 300, 30, paint);

            paint.setColor(Color.RED);
            paint.setStrokeWidth(0);

            paint.setStyle(Paint.Style.FILL);
            Rect rect1 = new Rect(10, 50, 10 + 100, 50 + 100);
            canvas.drawRect(rect1, paint);

            paint.setStyle(Paint.Style.STROKE);
            Rect rect2 = new Rect(130, 50, 130 + 100, 50 + 100);
            canvas.drawRect(rect2, paint);
//Rect는 정수형, RectF는 float형 실수 자료형
            RectF rect3 = new RectF(250, 50, 250 + 100, 50 + 100);
            canvas.drawRoundRect(rect3, 20, 20, paint);

            canvas.drawCircle(60, 220, 50, paint);
            paint.setStrokeWidth(5);
            Path path1 = new Path();
            path1.moveTo(10, 290);
            path1.lineTo(10 + 50, 290 + 50);
            path1.lineTo(10 + 100, 290);
            path1.lineTo(10 + 150, 290 + 50);
            path1.lineTo(10 + 200, 290);
            canvas.drawPath(path1, paint);

            paint.setStrokeWidth(0);
            paint.setTextSize(30);
            canvas.drawText("안드로이드", 10, 390, paint);



            //과제
//            paint.setAtiAlias(true);

            paint.setStrokeWidth(30);
            canvas.drawLine(30, 30, 300, 30, paint);

            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(30, 80, 300, 80, paint);

            RectF rectF = new RectF();

            rectF.set(60, 120, 60 + 200, 100 + 100);
            canvas.drawOval(rectF, paint);

            rectF.set(60, 170, 60 + 100, 170 + 100);

//drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint pnt)
//RectF : 위에 나와있는 rect 사각형 안에 원을 그린다.
//startAngle : 시작 각도입니다
//sweepAngle : 몇 도 그릴지 정합니다(시계반향)
//useCenter : 맨 위 결과화면을 보면 됩니다(false : 호, true : 부채꼴모양)
//Paint : 위에서 설정한 빨간색 6f의 두께로 테두리를 그려줍니다

            canvas.drawArc(rectF, 40, 110, true, paint);

            paint.setColor(Color.BLUE);
            rectF.set(60, 280, 60 + 100, 280 + 100);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.argb(0x88, 0xff, 0x00, 0x00));
            rectF.set(90, 310, 90 + 100, 310 + 100);
            canvas.drawRect(rectF, paint);


        }
    }

}
