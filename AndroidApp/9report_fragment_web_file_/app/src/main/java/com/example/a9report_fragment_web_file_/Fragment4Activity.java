package com.example.a9report_fragment_web_file_;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment4Activity extends Fragment {
    final static int ROTATION = 1, TRANCELATE = 2, SCALE = 3, SKEW = 4,
            NORMAL = 5, INNER = 6, OUTER = 7, SOLID = 8,
            EM1 = 9, EM2 = 10, EM3 = 11, EM4 = 12, EM5 = 13;
    public static int func = ROTATION;
    public int COLOR = Color.BLACK;
    View view;
    MyGraphicView gView;

    public Fragment4Activity() {
    }

    @Nullable
    @Override
    //setContentView와 같다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, container, false);
        setHasOptionsMenu(true);
        gView = new MyGraphicView(view.getContext());

        return gView;
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        SubMenu sMenu1 = menu.addSubMenu("기하학적 변경 >>");
        sMenu1.add(0, 1, 0, "회전");
        sMenu1.add(0, 2, 0, "변경");
        sMenu1.add(0, 3, 0, "크기변환");
        sMenu1.add(0, 4, 0, "비틀기");
        SubMenu sMenu2 = menu.addSubMenu("블러 변경 >>");
        sMenu2.add(0, 5, 0, "노말");
        sMenu2.add(0, 6, 0, "이너");
        sMenu2.add(0, 7, 0, "아우터");
        sMenu2.add(0, 8, 0, "솔리드");
        menu.add(0, 9, 0, "마스크");
        SubMenu sMenu3 = menu.addSubMenu("엠보싱 변경 >>");
        sMenu3.add(0, 10, 0, "1");
        sMenu3.add(0, 11, 0, "2");
        sMenu3.add(0, 12, 0, "3");
        sMenu3.add(0, 12, 0, "4");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                func = ROTATION;
                gView.invalidate();
                break;
            case 2:
                func = TRANCELATE;
                gView.invalidate();
                break;
            case 3:
                func = SCALE;
                gView.invalidate();
                break;
            case 4:
                func = SKEW;
                gView.invalidate();
                break;
            case 5:
                func = NORMAL;
                gView.invalidate();
                break;
            case 6:
                func = INNER;
                break;
            case 7:
                func = OUTER;
                break;
            case 8:
                func = SOLID;
                break;
            case 9: //마스크변경
                func = EM1;
                break;
            case 10: //엠보싱변경
                func = EM2;
                break;
            case 11: //엠보싱변경
                func = EM3;
                break;
            case 12: //엠보싱변경
                func = EM4;
                break;
            case 13: //엠보싱변경
                func = EM5;

                break;
        }
        gView.invalidate();
        return true;
    }


    private void displayToast(String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static class MyGraphicView extends View {
        public float startX = -1, startY = -1, stopX = -1, stopY = -1;
        BlurMaskFilter bMask;
        EmbossMaskFilter eMask;

        public MyGraphicView(Context context) {
            super(context);
        }

        public MyGraphicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.pic1);
            Paint paint = new Paint();


            int cenX = this.getWidth() / 2;
            int cenY = this.getHeight() / 2;
            int picX = (this.getWidth() - picture.getWidth()) / 2;
            int picY = (this.getHeight() - picture.getHeight()) / 2;

            switch (func) {
                case 1:
                    canvas.rotate(45, cenX, cenY);
                    displayToast("1");
                    break;
                case 2:
                    canvas.translate(-150, 200);
                    displayToast("2");
                    break;
                case 3:
                    canvas.scale(2, 2, cenX, cenY);
                    displayToast("3");
                    break;
                case 4:
                    canvas.skew(0.3f, 0.3f);
                    displayToast("4");
                    break;
                case 5:
                    bMask = new BlurMaskFilter(30, BlurMaskFilter.Blur.NORMAL);
                    break;
                case 6:
                    bMask = new BlurMaskFilter(30, BlurMaskFilter.Blur.INNER);
                    break;
                case 7:
                    bMask = new BlurMaskFilter(30, BlurMaskFilter.Blur.OUTER);
                    break;
                case 8:
                    bMask = new BlurMaskFilter(30, BlurMaskFilter.Blur.SOLID);
                    break;
                case 9:
                    float[] array = {2, 0, 0, 0, -25, 0, 2, 0, 0, -25, 0, 0, 2, 0, -25, 0, 0, 0, 1, 0};
                    ColorMatrix cm = new ColorMatrix(array);
                    paint.setColorFilter(new ColorMatrixColorFilter(cm));
                    break;
                case 10:
                    eMask = new EmbossMaskFilter(new float[]{3, 3, 3}, 0.2f, 1, 1);
                    break;
                case 11:
                    eMask = new EmbossMaskFilter(new float[]{10, 3, 3}, 0.2f, 1, 1);
                    break;
                case 12:
                    eMask = new EmbossMaskFilter(new float[]{3, 10, 3}, 0.2f, 1, 1);
                    break;
                case 13:
                    eMask = new EmbossMaskFilter(new float[]{3, 3, 10}, 0.2f, 1, 1);
                    break;
            }

            if (func > 9) {
                paint.setMaskFilter(eMask);
                canvas.drawCircle(cenX, cenY, 10, paint);
            } else if (func > 4 | func <= 9) {
                paint.setMaskFilter(bMask);
                canvas.drawBitmap(picture, picX, picY, paint);
            } else {
                canvas.drawBitmap(picture, picX, picY, null);
            }
            picture.recycle();

        }

        private void displayToast(String message) {
            Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }

}
