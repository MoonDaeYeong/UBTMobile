// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.data.response.HomeDataResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemHomeExamBinding extends ViewDataBinding {
  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final Guideline hGuide3;

  @NonNull
  public final TextView tvExamCode;

  @NonNull
  public final TextView tvStatus;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected HomeDataResponse.Result.Userexam mUserExamData;

  protected ListItemHomeExamBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Guideline hGuide1, Guideline hGuide2, Guideline hGuide3, TextView tvExamCode,
      TextView tvStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.hGuide3 = hGuide3;
    this.tvExamCode = tvExamCode;
    this.tvStatus = tvStatus;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setUserExamData(@Nullable HomeDataResponse.Result.Userexam userExamData);

  @Nullable
  public HomeDataResponse.Result.Userexam getUserExamData() {
    return mUserExamData;
  }

  @NonNull
  public static ListItemHomeExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_home_exam, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemHomeExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemHomeExamBinding>inflateInternal(inflater, R.layout.list_item_home_exam, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemHomeExamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_home_exam, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemHomeExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemHomeExamBinding>inflateInternal(inflater, R.layout.list_item_home_exam, null, false, component);
  }

  public static ListItemHomeExamBinding bind(@NonNull View view) {
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
  public static ListItemHomeExamBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemHomeExamBinding)bind(component, view, R.layout.list_item_home_exam);
  }
}
