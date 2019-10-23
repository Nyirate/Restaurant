package com.example.restaurant1.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurant1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.state) Button mStateButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();
        mStateButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
     if (v == mStateButton) {
         String location = mLocationEditText.getText().toString();
         if(!(location).equals("")) {
             addToSharedPreferences(location);
         }
         Intent intent = new Intent(MainActivity.this, MyActivityList.class);
         startActivity(intent);
     }
    }
    private void addToSharedPreferences(String location) {
        mEditor.putString(Constants.PREFERENCES_LOCATION_KEY, location).apply();
    }


}