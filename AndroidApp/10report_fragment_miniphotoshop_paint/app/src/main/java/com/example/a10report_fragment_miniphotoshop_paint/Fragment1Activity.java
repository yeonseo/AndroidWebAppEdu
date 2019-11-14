package com.example.a10report_fragment_miniphotoshop_paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment1Activity extends Fragment {
    final static int LINE = 1, CIRCLE = 2, RECTANGLE = 3;
    public int curShape = LINE;
    public int COLOR = Color.BLACK;
    View view;
    MyGraphicView pView;
    public boolean draw = false;
    public ArrayList<MyGraphicView> drawList = new ArrayList<MyGraphicView>();

    public Fragment1Activity() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        setHasOptionsMenu(true);
        pView = new MyGraphicView(view.getContext());

        return pView;
    }

    private void displayToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.add(0, 1, 0, "선그리기");
        menu.add(0, 2, 0, "원그리기");
        menu.add(0, 3, 0, "사각형그리기");
        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
        sMenu.add(0, 4, 0, "빨강");
        sMenu.add(0, 5, 0, "파랑");
        sMenu.add(0, 6, 0, "노랑");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                curShape = LINE;
                break;
            case 2:
                curShape = CIRCLE;
                break;
            case 3:
                curShape = RECTANGLE;
                break;
            case 4:
                COLOR = Color.RED;
                break;
            case 5:
                COLOR = Color.BLUE;
                break;
            case 6:
                COLOR = Color.YELLOW;
                break;
        }
        return true;
    }


    private void drawPaint() {
        if (draw == true) {
            MyGraphicView paint = new MyGraphicView(view.getContext());
            paint.startX = pView.startX;
            paint.startY = pView.startY;
            paint.stopX = pView.stopX;
            paint.stopY = pView.stopY;
            paint.curShapePaint = curShape;
            paint.COLORPaint = COLOR;

            drawList.add(paint);

            pView.invalidate();
        }
    }


    private class MyGraphicView extends View {
        public float startX = -1, startY = -1, stopX = -1, stopY = -1;
        public int curShapePaint = curShape;
        public int COLORPaint = COLOR;

        public MyGraphicView(Context context) {
            super(context);
        }

        public MyGraphicView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }


        //선을 그릴지 원을 그릴지 메뉴에서 선택정보가 있어야 함.
        //디폴트: 선
        //터치하는 좌표정보가 넘어와야 함.

        //화면에서 이벤트 정보를 받는 함수
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    startX = event.getX();
                    startY = event.getY();
                    draw = false;
                    displayToast("" + draw);
                    break;
                case MotionEvent.ACTION_UP:
                    stopX = event.getX();
                    stopY = event.getY();
                    draw = true;
                    drawPaint();
                    break;
                case MotionEvent.ACTION_MOVE:
                    break;
                case MotionEvent.ACTION_CANCEL:
                    break;
            }


            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.GREEN);
            paint.setStrokeWidth(5);
            paint.setColor(COLORPaint);
            paint.setStyle(Paint.Style.FILL);

            for (int i = 0; i < drawList.size(); i++) {
                MyGraphicView draw = drawList.get(i);
                startX = draw.startX;
                startY = draw.startY;
                stopX = draw.stopX;
                stopY = draw.stopY;
                curShapePaint = draw.curShapePaint;
                COLORPaint = draw.COLORPaint;

                paint.setColor(COLORPaint);
                switch (curShapePaint) {
                    case LINE:
                        canvas.drawLine(startX, startY, stopX, stopY, paint);
                        break;
                    case CIRCLE:
                        int radius = (int) Math.sqrt(Math.pow(stopX - startX, 2)
                                + Math.pow(stopY - startY, 2));
                        canvas.drawCircle(startX, startY, radius, paint);
                        break;
                    case RECTANGLE:
                        RectF rectF = new RectF();
                        rectF.set(startX, startY, stopX, stopY);
                        canvas.drawRect(rectF, paint);
                        break;
                }
            }

        }//end of Draw
    }

}
