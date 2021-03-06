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
import androidx.fragment.app.FragmentContainerView;
import com.nsdevil.ubtmobilev3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentExamBinding extends ViewDataBinding {
  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final FragmentContainerView navExamHost;

  @NonNull
  public final TextView tvExamCode;

  @NonNull
  public final TextView tvExamName;

  @NonNull
  public final TextView tvExamTime;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvRemainQuestion;

  @NonNull
  public final TextView tvRemainQuestionInfo;

  @NonNull
  public final TextView tvTotalQuestion;

  @NonNull
  public final TextView tvTotalQuestionInfo;

  protected FragmentExamBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Guideline hGuide1, FragmentContainerView navExamHost, TextView tvExamCode,
      TextView tvExamName, TextView tvExamTime, TextView tvName, TextView tvRemainQuestion,
      TextView tvRemainQuestionInfo, TextView tvTotalQuestion, TextView tvTotalQuestionInfo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hGuide1 = hGuide1;
    this.navExamHost = navExamHost;
    this.tvExamCode = tvExamCode;
    this.tvExamName = tvExamName;
    this.tvExamTime = tvExamTime;
    this.tvName = tvName;
    this.tvRemainQuestion = tvRemainQuestion;
    this.tvRemainQuestionInfo = tvRemainQuestionInfo;
    this.tvTotalQuestion = tvTotalQuestion;
    this.tvTotalQuestionInfo = tvTotalQuestionInfo;
  }

  @NonNull
  public static FragmentExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exam, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentExamBinding>inflateInternal(inflater, R.layout.fragment_exam, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentExamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exam, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentExamBinding>inflateInternal(inflater, R.layout.fragment_exam, null, false, component);
  }

  public static FragmentExamBinding bind(@NonNull View view) {
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
  public static FragmentExamBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentExamBinding)bind(component, view, R.layout.fragment_exam);
  }
}
