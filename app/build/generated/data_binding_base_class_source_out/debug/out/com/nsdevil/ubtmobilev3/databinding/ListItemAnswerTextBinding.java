// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.data.db.InAnswer;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemAnswerTextBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnNumber;

  @NonNull
  public final TextInputEditText etAnswer;

  @NonNull
  public final Guideline hGuide1;

  @Bindable
  protected InAnswer mAnswer;

  protected ListItemAnswerTextBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnNumber, TextInputEditText etAnswer, Guideline hGuide1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNumber = btnNumber;
    this.etAnswer = etAnswer;
    this.hGuide1 = hGuide1;
  }

  public abstract void setAnswer(@Nullable InAnswer answer);

  @Nullable
  public InAnswer getAnswer() {
    return mAnswer;
  }

  @NonNull
  public static ListItemAnswerTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_answer_text, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAnswerTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemAnswerTextBinding>inflateInternal(inflater, R.layout.list_item_answer_text, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemAnswerTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_answer_text, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAnswerTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemAnswerTextBinding>inflateInternal(inflater, R.layout.list_item_answer_text, null, false, component);
  }

  public static ListItemAnswerTextBinding bind(@NonNull View view) {
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
  public static ListItemAnswerTextBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemAnswerTextBinding)bind(component, view, R.layout.list_item_answer_text);
  }
}
