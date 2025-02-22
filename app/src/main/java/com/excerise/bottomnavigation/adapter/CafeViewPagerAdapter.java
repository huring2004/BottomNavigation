package com.excerise.bottomnavigation.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.excerise.bottomnavigation.cafe.Fragment1;
import com.excerise.bottomnavigation.cafe.Fragment2;
import com.excerise.bottomnavigation.cafe.Fragment3;

public class CafeViewPagerAdapter extends FragmentStatePagerAdapter {
    public CafeViewPagerAdapter(@NonNull FragmentManager fm,int behavior) {
        super(fm,behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return new Fragment3();
            default: return new Fragment1();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Cà Phê 1";
            case 1: return "Cà Phê 2";
            case 2: return "Cà Phê 3";
            default: return "Cà Phê 1";

        }
    }
}
