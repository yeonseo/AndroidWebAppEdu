package com.example.a19customcalendartest;

import android.content.Context;
import android.graphics.Color;

import androidx.appcompat.widget.AppCompatTextView;

public class MonthItemView extends AppCompatTextView {
    private MonthItem item;

    public MonthItemView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundColor(Color.WHITE);
    }

    public MonthItem getItem() {
        return item;
    }

    public void setItem(MonthItem item) {
        this.item = item;

        int day = item.getDayValue();
        if (day != 0) {
            setText(String.valueOf(day));} else {setText("");
        }
    }
}
