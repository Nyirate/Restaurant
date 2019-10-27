package com.example.restaurant1.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.restaurant1.models.Business;
import com.example.restaurant1.ui.ActivityDetailFragment;

import java.util.List;

public class ActivityPagerAdapter extends FragmentPagerAdapter {

    private List<Business> mRestaurant;

    public ActivityPagerAdapter(FragmentManager fm,  List<Business> restaurants) {
        super(fm);
        mRestaurant = restaurants;
    }

    @Override
    public Fragment getItem(int position) {
        return ActivityDetailFragment.newInstance(mRestaurant.get(position));
    }

    @Override
    public int getCount() {
        return mRestaurant.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mRestaurant.get(position).getName();
    }
}
