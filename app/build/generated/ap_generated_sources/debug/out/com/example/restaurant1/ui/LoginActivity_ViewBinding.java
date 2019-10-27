// Generated code from Butter Knife. Do not modify!
package com.example.restaurant1.ui;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.restaurant1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.mRegisterTextView = Utils.findRequiredViewAsType(source, R.id.registerTextView, "field 'mRegisterTextView'", TextView.class);
    target.mPasswordLoginButton = Utils.findRequiredViewAsType(source, R.id.passwordLoginButton, "field 'mPasswordLoginButton'", Button.class);
    target.mEmailEditText = Utils.findRequiredViewAsType(source, R.id.emailEditText, "field 'mEmailEditText'", EditText.class);
    target.mPasswordEditText = Utils.findRequiredViewAsType(source, R.id.passwordEditText, "field 'mPasswordEditText'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRegisterTextView = null;
    target.mPasswordLoginButton = null;
    target.mEmailEditText = null;
    target.mPasswordEditText = null;
  }
}