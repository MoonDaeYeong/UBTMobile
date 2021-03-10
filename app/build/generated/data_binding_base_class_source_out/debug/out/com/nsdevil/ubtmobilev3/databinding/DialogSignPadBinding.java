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
import com.nsdevil.ubtmobilev3.views.CustomSignaturePad;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogSignPadBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnConfirm;

  @NonNull
  public final MaterialButton btnDelete;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final CustomSignaturePad signPad;

  protected DialogSignPadBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnConfirm, MaterialButton btnDelete, Guideline hGuide1, Guideline hGuide2,
      CustomSignaturePad signPad) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnConfirm = btnConfirm;
    this.btnDelete = btnDelete;
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.signPad = signPad;
  }

  @NonNull
  public static DialogSignPadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_sign_pad, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogSignPadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogSignPadBinding>inflateInternal(inflater, R.layout.dialog_sign_pad, root, attachToRoot, component);
  }

  @NonNull
  public static DialogSignPadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_sign_pad, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogSignPadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogSignPadBinding>inflateInternal(inflater, R.layout.dialog_sign_pad, null, false, component);
  }

  public static DialogSignPadBinding bind(@NonNull View view) {
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
  public static DialogSignPadBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogSignPadBinding)bind(component, view, R.layout.dialog_sign_pad);
  }
}
