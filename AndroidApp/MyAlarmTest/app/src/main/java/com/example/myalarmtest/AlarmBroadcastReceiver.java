package com.example.myalarmtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public static final String ONE_TIME = "onetime";

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent dismissAlarmIntent = new Intent(context, DismissAlarmActivity.class);
        context.startActivity(dismissAlarmIntent);
    }
}
