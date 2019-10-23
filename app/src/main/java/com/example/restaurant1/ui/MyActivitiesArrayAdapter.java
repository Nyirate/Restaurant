package com.example.restaurant1.ui;//
 import android.content.Context;
import android.widget.ArrayAdapter;



public class MyActivitiesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mResto;
    private String[] mFood;

    public MyActivitiesArrayAdapter(Context mContext, int resource, String[] mResto, String[] mFood) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mResto = mResto;
        this.mFood = mFood;
    }
    @Override
    public Object getItem(int position) {
        String resto = mResto[position];
        String food = mFood[position];
        return String.format("%s \nGreat book: %s", resto, food);
    }

    @Override
    public int getCount() {
        return mResto.length;
    }
}

