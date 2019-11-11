package com.example.a9report_fragment_web_file_;

import android.Manifest;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Fragment3Activity extends Fragment {
    final static int LINE = 1, CIRCLE = 2, RECTANGLE = 3;
    public int curShape = LINE;
    public int COLOR = Color.BLACK;
    View view;

    public Fragment3Activity() {
    }

    @Nullable
    @Override
    //setContentView와 같다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, container, false);
        setHasOptionsMenu(true);
        return new MyGraphicView(view.getContext());
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

    private void displayToast(String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    private class MyGraphicView extends View {
        public float startX = -1, startY = -1, stopX = -1, stopY = -1;

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
                    break;
                case MotionEvent.ACTION_UP:
                    stopX = event.getX();
                    stopY = event.getY();

                    //무효화영역 처리
                    invalidate();
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
            paint.setColor(COLOR);
            paint.setStyle(Paint.Style.FILL);

            switch (curShape) {
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
    }


}
