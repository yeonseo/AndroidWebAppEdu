package com.example.a8custommakeimagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;


public class MyPictureView extends View {
    private String src;

    //이걸 불러야 함!!! 매개변수 2개짜리!!
    public MyPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPictureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(!src.isEmpty()) {
            Bitmap bitmap = BitmapFactory.decodeFile(src);
            //그림을 늘리기 위해서는 캔버스를 늘려야 하고, 변형을 주기 위해서는 캔버스를 변형시켜야한다.
            canvas.scale(2,2,0,0);
            canvas.drawBitmap(bitmap, 0,0, null);
            bitmap.recycle();
        }

    }


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
