// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SavedRestaurantListActivity_ViewBinding implements Unbinder {
  private SavedRestaurantListActivity target;

  @UiThread
  public SavedRestaurantListActivity_ViewBinding(SavedRestaurantListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SavedRestaurantListActivity_ViewBinding(SavedRestaurantListActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SavedRestaurantListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
