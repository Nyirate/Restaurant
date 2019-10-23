// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyActivityList_ViewBinding implements Unbinder {
  private MyActivityList target;

  @UiThread
  public MyActivityList_ViewBinding(MyActivityList target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyActivityList_ViewBinding(MyActivityList target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mErrorTextView = Utils.findRequiredViewAsType(source, R.id.errorTextView, "field 'mErrorTextView'", TextView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'mProgressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyActivityList target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mErrorTextView = null;
    target.mProgressBar = null;
  }
}
