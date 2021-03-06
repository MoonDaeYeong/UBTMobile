// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nsdevil.ubtmobilev3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSignUpBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnBackToLogin;

  @NonNull
  public final MaterialButton btnSignUp;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final Guideline hGuide3;

  @NonNull
  public final Guideline hGuide4;

  @NonNull
  public final Guideline hInnerGuide1;

  @NonNull
  public final Guideline hInnerGuide2;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilName;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextView tvCreateInfo;

  @NonNull
  public final TextView tvVersion;

  @NonNull
  public final Guideline vGuide1;

  @NonNull
  public final Guideline vGuide2;

  protected FragmentSignUpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnBackToLogin, MaterialButton btnSignUp, TextInputEditText etEmail,
      TextInputEditText etName, TextInputEditText etPassword, Guideline hGuide1, Guideline hGuide2,
      Guideline hGuide3, Guideline hGuide4, Guideline hInnerGuide1, Guideline hInnerGuide2,
      TextInputLayout tilEmail, TextInputLayout tilName, TextInputLayout tilPassword,
      TextView tvCreateInfo, TextView tvVersion, Guideline vGuide1, Guideline vGuide2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBackToLogin = btnBackToLogin;
    this.btnSignUp = btnSignUp;
    this.etEmail = etEmail;
    this.etName = etName;
    this.etPassword = etPassword;
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.hGuide3 = hGuide3;
    this.hGuide4 = hGuide4;
    this.hInnerGuide1 = hInnerGuide1;
    this.hInnerGuide2 = hInnerGuide2;
    this.tilEmail = tilEmail;
    this.tilName = tilName;
    this.tilPassword = tilPassword;
    this.tvCreateInfo = tvCreateInfo;
    this.tvVersion = tvVersion;
    this.vGuide1 = vGuide1;
    this.vGuide2 = vGuide2;
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, null, false, component);
  }

  public static FragmentSignUpBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSignUpBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSignUpBinding)bind(component, view, R.layout.fragment_sign_up);
  }
}
