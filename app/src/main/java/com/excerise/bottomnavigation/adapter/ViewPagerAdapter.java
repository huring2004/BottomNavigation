package com.excerise.bottomnavigation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.excerise.bottomnavigation.Test1.FragmentCafe;
import com.excerise.bottomnavigation.Test1.FragmentHome;
import com.excerise.bottomnavigation.Test1.FragmentNoti;
import com.excerise.bottomnavigation.Test1.FragmentSearch;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int pageNum;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.pageNum = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentHome();
            case 1: return new FragmentNoti();
            case 2: return new FragmentSearch();
            case 3: return new FragmentCafe();
            default: return new FragmentHome();

        }
    }

    @Override
    public int getCount() {
        return pageNum;
    }
}
