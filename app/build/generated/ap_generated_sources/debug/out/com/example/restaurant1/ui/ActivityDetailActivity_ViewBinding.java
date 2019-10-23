// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityDetailActivity_ViewBinding implements Unbinder {
  private ActivityDetailActivity target;

  @UiThread
  public ActivityDetailActivity_ViewBinding(ActivityDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityDetailActivity_ViewBinding(ActivityDetailActivity target, View source) {
    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mViewPager = null;
  }
}
