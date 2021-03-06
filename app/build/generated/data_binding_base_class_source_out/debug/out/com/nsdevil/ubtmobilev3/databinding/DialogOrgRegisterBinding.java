// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.nsdevil.ubtmobilev3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogOrgRegisterBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnNo;

  @NonNull
  public final MaterialButton btnYes;

  @NonNull
  public final Guideline hGuide1;

  protected DialogOrgRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnNo, MaterialButton btnYes, Guideline hGuide1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNo = btnNo;
    this.btnYes = btnYes;
    this.hGuide1 = hGuide1;
  }

  @NonNull
  public static DialogOrgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_org_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogOrgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogOrgRegisterBinding>inflateInternal(inflater, R.layout.dialog_org_register, root, attachToRoot, component);
  }

  @NonNull
  public static DialogOrgRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_org_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogOrgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogOrgRegisterBinding>inflateInternal(inflater, R.layout.dialog_org_register, null, false, component);
  }

  public static DialogOrgRegisterBinding bind(@NonNull View view) {
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
  public static DialogOrgRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogOrgRegisterBinding)bind(component, view, R.layout.dialog_org_register);
  }
}
