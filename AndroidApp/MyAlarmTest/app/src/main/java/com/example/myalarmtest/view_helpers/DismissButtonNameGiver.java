package com.example.myalarmtest.view_helpers;

import android.content.Context;

import com.example.myalarmtest.R;
import com.example.myalarmtest.SharedPreferencesHelper;

import java.util.Random;

public class DismissButtonNameGiver {
    private String[] possibleNames;
    private Context context;
    private final int DAYS_WITH_DEFAULT_NAME_NUMBER = 7;

    public DismissButtonNameGiver(Context context) {
        this.context = context;
        possibleNames = context.getResources().getStringArray(R.array.dismiss_button_names_array);
    }

    public String getName() {
        SharedPreferencesHelper sharPrefHelper = new SharedPreferencesHelper(context);
        if (sharPrefHelper.getDaysSinceInstallation() < DAYS_WITH_DEFAULT_NAME_NUMBER) {
            return possibleNames[0];
        } else {
            return getRandomName();
        }
    }

    private String getRandomName() {
        Random random = new Random();
        return possibleNames[random.nextInt(possibleNames.length)];
    }
}
