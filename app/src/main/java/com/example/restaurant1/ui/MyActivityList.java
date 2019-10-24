package com.example.restaurant1.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurant1.R;
import com.example.restaurant1.adapters.ActivityListAdapter;
import com.example.restaurant1.models.Restaurant;
import com.example.restaurant1.network.YelpService;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

//import android.support.v7.app.AppCompatActivity;
//import butterknife.Bind;

public class MyActivityList extends AppCompatActivity {
    public static final String TAG = MyActivityList.class.getSimpleName();
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    private ActivityListAdapter mAdapter;

    private SharedPreferences mSharedPreferences;
    private String mRecentAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activities);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);
        if(mRecentAddress != null){
            getRestaurants(mRecentAddress);
        }
    }

    private void getRestaurants(String location){
        final YelpService yelpService = new YelpService();
        yelpService.findRestaurants(location, new Callback(){

            @Override
            public void onFailure(Call call, IOException e){
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                restaurants = yelpService.processResults(response);
                MyActivityList.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new ActivityListAdapter(getApplicationContext(), restaurants);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MyActivityList.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
        });
    }


}

