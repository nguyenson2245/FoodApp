package com.example.foodapp_gt.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.foodapp_gt.Activity.Dangki;
import com.example.foodapp_gt.Activity.Dangnhap;

public class ViewPagerAdaper extends FragmentStateAdapter {
    public ViewPagerAdaper(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Dangnhap();
            case 1:
                return new Dangki();
            default:
                return new Dangnhap();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
