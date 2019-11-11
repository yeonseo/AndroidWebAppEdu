package com.example.a8newimageviewtest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class MyPictureView extends View {

    private String src;

    public MyPictureView(Context context) {
        super(context);
        src = "";
    }
    public MyPictureView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }
    public MyPictureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(!src.isEmpty()) {
            Bitmap bitmap = BitmapFactory.decodeFile(src);
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