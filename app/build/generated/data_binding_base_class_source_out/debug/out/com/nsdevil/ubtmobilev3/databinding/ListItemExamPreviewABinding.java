// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.data.db.InAnswer;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemExamPreviewABinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnNumber;

  @NonNull
  public final Barrier hBarrier1;

  @NonNull
  public final TextView tvAnswer;

  @NonNull
  public final Guideline vGuide1;

  @Bindable
  protected InAnswer mAnswer;

  protected ListItemExamPreviewABinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnNumber, Barrier hBarrier1, TextView tvAnswer, Guideline vGuide1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNumber = btnNumber;
    this.hBarrier1 = hBarrier1;
    this.tvAnswer = tvAnswer;
    this.vGuide1 = vGuide1;
  }

  public abstract void setAnswer(@Nullable InAnswer answer);

  @Nullable
  public InAnswer getAnswer() {
    return mAnswer;
  }

  @NonNull
  public static ListItemExamPreviewABinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_exam_preview_a, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemExamPreviewABinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemExamPreviewABinding>inflateInternal(inflater, R.layout.list_item_exam_preview_a, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemExamPreviewABinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_exam_preview_a, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemExamPreviewABinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemExamPreviewABinding>inflateInternal(inflater, R.layout.list_item_exam_preview_a, null, false, component);
  }

  public static ListItemExamPreviewABinding bind(@NonNull View view) {
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
  public static ListItemExamPreviewABinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemExamPreviewABinding)bind(component, view, R.layout.list_item_exam_preview_a);
  }
}
