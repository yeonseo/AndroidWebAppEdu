package com.example.a17myplayerproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return Fragment_Main.newInstance();
            case 1 : return Fragment_Play.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
