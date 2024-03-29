// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mStateButton = Utils.findRequiredViewAsType(source, R.id.state, "field 'mStateButton'", Button.class);
    target.mAppNameTextView = Utils.findRequiredViewAsType(source, R.id.appNameTextView, "field 'mAppNameTextView'", TextView.class);
    target.mSavedRestaurantsButton = Utils.findRequiredViewAsType(source, R.id.savedRestaurantsButton, "field 'mSavedRestaurantsButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStateButton = null;
    target.mAppNameTextView = null;
    target.mSavedRestaurantsButton = null;
  }
}
