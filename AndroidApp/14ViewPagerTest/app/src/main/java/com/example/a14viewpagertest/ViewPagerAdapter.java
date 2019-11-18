package com.example.a14viewpagertest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    //여기는 건들지 말것!!!
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트를 뷰 페이저에서 프래그먼트 교체를 보여주는 역할
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return Fragment1.newInstance();
            case 1 : return Fragment2.newInstance();
            case 2 : return Fragment3.newInstance();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    //상단의 탭 레이아웃 인디케이터에 텍스트를 선언해주는것
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : return "Left";
            case 1 : return "Center";
            case 2 : return "Right";
            default: return null;
        }
    }
}
