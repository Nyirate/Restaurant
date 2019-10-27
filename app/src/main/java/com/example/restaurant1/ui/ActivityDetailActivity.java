package com.example.restaurant1.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.restaurant1.R;
import com.example.restaurant1.adapters.ActivityPagerAdapter;
import com.example.restaurant1.models.Business;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityDetailActivity extends AppCompatActivity {
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    private ActivityPagerAdapter adapterViewPager;
    List<Business> mRestaurant;
    private int FragmentPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_detail);
        ButterKnife.bind(this);

        mRestaurant = Parcels.unwrap(getIntent().getParcelableExtra("restaurant"));
        int startingPosition = getIntent().getIntExtra("position", 0);
        adapterViewPager = new ActivityPagerAdapter(getSupportFragmentManager(),mRestaurant);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}