package com.example.restaurant1.adapters;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurant1.R;
import com.example.restaurant1.models.Business;
import com.example.restaurant1.ui.ActivityDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.restaurant1.R.layout.activity_list_item;

public class ActivityListAdapter extends RecyclerView.Adapter<ActivityListAdapter.ActivityViewHolder> {
    private List<Business> mRestaurant;
    private Context mContext;

    public ActivityListAdapter(Context context, List<Business> restaurant) {
        mContext = context;
        mRestaurant= restaurant;

    }


    @Override
    public ActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(activity_list_item, parent, false);
        ActivityViewHolder viewHolder = new ActivityViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ActivityViewHolder holder, int position) {
        holder.bindRestaurant(mRestaurant.get(position));
    }

    @Override
    public int getItemCount() {
        return mRestaurant.size();
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.restaurantImageView)
        ImageView mRestaurantImageView;
        @BindView(R.id.restaurantNameTextView)
        TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;

        private Context mContext;

        public ActivityViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }
        public void bindRestaurant(Business restaurant) {
            mNameTextView.setText(restaurant.getName());
            mCategoryTextView.setText(restaurant.getCategories().get(0).getTitle());
            mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
            Picasso.get().load(restaurant.getImageUrl()).into(mRestaurantImageView);
        }
        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, ActivityDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("restaurant", Parcels.wrap(mRestaurant));
            mContext.startActivity(intent);
        }


    }

}

