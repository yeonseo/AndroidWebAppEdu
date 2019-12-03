package com.example.a19customcalendartest;

import android.content.Context;
import android.text.format.Time;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Calendar;

class MonthAdapter extends BaseAdapter {

    private Context mContext;
    private MonthItem[] items;
    private Calendar mCalendar;
    private int firstDau = 0;
    private int mStartDay = 0;
    private int startDay=0;
    private int curYear = 0;
    private int curMonth = 0;
    private int lastDay = 0;


    public MonthAdapter() {
    }

    public MonthAdapter(Context mContext) {
        this.mContext = mContext;
        //달력을 계산할 내용으로 진행한다.
        init();
    }

    private void init() {
        items = new MonthItem[42];
        //현재 년도, 달, 날짜, 시간
        mCalendar = Calendar.getInstance();

        reCalculate();
    }

    private void reCalculate() {
        mCalendar.set(Calendar.DAY_OF_MONTH, 1);

        int dayOfWeek = mCalendar.get(Calendar.DAY_OF_WEEK);
        firstDau = getFirstDay(dayOfWeek);

        mStartDay = mCalendar.getFirstDayOfWeek();
        curYear = mCalendar.get(Calendar.YEAR);
        curMonth = mCalendar.get(Calendar.MONTH);
        lastDay = getMonthLastDay(curYear, curMonth);
        startDay = getFirstDayOfWeek();


    }

    private int getFirstDayOfWeek() {
        int startDay = Calendar.getInstance().getFirstDayOfWeek();
        switch (startDay){
            case Calendar.SATURDAY : return Time.SATURDAY;
            case Calendar.MONDAY : return Time.MONDAY;
            case Calendar.SUNDAY : return Time.SUNDAY;
        }
        return 0;
    }

    private int getMonthLastDay(int curYear, int curMonth) {
        switch (curMonth + 1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if ((curYear % 4 == 0) && (curYear % 100 != 0) || (curYear % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
        }
    }

    private int getFirstDay(int dayOfWeek) {
        int result = 0;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                result = 0;
                break;
            case Calendar.MONDAY:
                result = 1;
                break;
            case Calendar.TUESDAY:
                result = 2;
                break;
            case Calendar.WEDNESDAY:
                result = 3;
                break;
            case Calendar.THURSDAY:
                result = 4;
                break;
            case Calendar.FRIDAY:
                result = 5;
                break;
            case Calendar.SATURDAY:
                result = 6;
                break;
        }
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

}
