// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityDetailFragment_ViewBinding implements Unbinder {
  private ActivityDetailFragment target;

  @UiThread
  public ActivityDetailFragment_ViewBinding(ActivityDetailFragment target, View source) {
    this.target = target;

    target.mImageLabel = Utils.findRequiredViewAsType(source, R.id.restaurantImageView, "field 'mImageLabel'", ImageView.class);
    target.mNameLabel = Utils.findRequiredViewAsType(source, R.id.restaurantNameTextView, "field 'mNameLabel'", TextView.class);
    target.mCategoriesLabel = Utils.findRequiredViewAsType(source, R.id.cuisineTextView, "field 'mCategoriesLabel'", TextView.class);
    target.mRatingLabel = Utils.findRequiredViewAsType(source, R.id.ratingTextView, "field 'mRatingLabel'", TextView.class);
    target.mWebsiteLabel = Utils.findRequiredViewAsType(source, R.id.websiteTextView, "field 'mWebsiteLabel'", TextView.class);
    target.mPhoneLabel = Utils.findRequiredViewAsType(source, R.id.phoneTextView, "field 'mPhoneLabel'", TextView.class);
    target.mAddressLabel = Utils.findRequiredViewAsType(source, R.id.addressTextView, "field 'mAddressLabel'", TextView.class);
    target.mSaveRestaurantButton = Utils.findRequiredViewAsType(source, R.id.saveRestaurantButton, "field 'mSaveRestaurantButton'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImageLabel = null;
    target.mNameLabel = null;
    target.mCategoriesLabel = null;
    target.mRatingLabel = null;
    target.mWebsiteLabel = null;
    target.mPhoneLabel = null;
    target.mAddressLabel = null;
    target.mSaveRestaurantButton = null;
  }
}
