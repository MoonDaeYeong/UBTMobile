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
import com.nsdevil.ubtmobilev3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogTextInputBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnClose;

  @NonNull
  public final MaterialButton btnConfirm;

  @NonNull
  public final TextInputEditText etTextCode;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final TextView tvTitle;

  protected DialogTextInputBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnClose, MaterialButton btnConfirm, TextInputEditText etTextCode,
      Guideline hGuide1, Guideline hGuide2, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.btnConfirm = btnConfirm;
    this.etTextCode = etTextCode;
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static DialogTextInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_text_input, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogTextInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogTextInputBinding>inflateInternal(inflater, R.layout.dialog_text_input, root, attachToRoot, component);
  }

  @NonNull
  public static DialogTextInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_text_input, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogTextInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogTextInputBinding>inflateInternal(inflater, R.layout.dialog_text_input, null, false, component);
  }

  public static DialogTextInputBinding bind(@NonNull View view) {
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
  public static DialogTextInputBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogTextInputBinding)bind(component, view, R.layout.dialog_text_input);
  }
}
