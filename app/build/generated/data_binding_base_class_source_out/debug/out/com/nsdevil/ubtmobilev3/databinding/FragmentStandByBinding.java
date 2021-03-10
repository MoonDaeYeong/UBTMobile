// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

public abstract class FragmentStandByBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnSign;

  @NonNull
  public final MaterialButton btnStart;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etExamName;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final FrameLayout flCountDown;

  @NonNull
  public final FrameLayout flProgress;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final Guideline hGuide3;

  @NonNull
  public final Guideline hGuide4;

  @NonNull
  public final Guideline hGuide5;

  @NonNull
  public final Guideline hGuide6;

  @NonNull
  public final ImageView ivPicture;

  @NonNull
  public final LinearLayout llCurrentTime;

  @NonNull
  public final LinearLayout llRemainTime;

  @NonNull
  public final LinearLayout llStartTime;

  @NonNull
  public final ProgressBar prIndicator;

  @NonNull
  public final TextView tvCountDown;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvExamName;

  @NonNull
  public final TextView tvFileName;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvProgressInfo;

  @NonNull
  public final TextView tvRemainTime;

  @NonNull
  public final TextView tvStartTime;

  @NonNull
  public final Guideline vGuide1;

  @NonNull
  public final Guideline vGuide2;

  @NonNull
  public final Guideline vInnerGuide1;

  @NonNull
  public final Guideline vInnerGuide2;

  protected FragmentStandByBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnSign, MaterialButton btnStart, TextInputEditText etEmail,
      TextInputEditText etExamName, TextInputEditText etName, FrameLayout flCountDown,
      FrameLayout flProgress, Guideline hGuide1, Guideline hGuide2, Guideline hGuide3,
      Guideline hGuide4, Guideline hGuide5, Guideline hGuide6, ImageView ivPicture,
      LinearLayout llCurrentTime, LinearLayout llRemainTime, LinearLayout llStartTime,
      ProgressBar prIndicator, TextView tvCountDown, TextView tvDesc, TextView tvEmail,
      TextView tvExamName, TextView tvFileName, TextView tvName, TextView tvProgressInfo,
      TextView tvRemainTime, TextView tvStartTime, Guideline vGuide1, Guideline vGuide2,
      Guideline vInnerGuide1, Guideline vInnerGuide2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSign = btnSign;
    this.btnStart = btnStart;
    this.etEmail = etEmail;
    this.etExamName = etExamName;
    this.etName = etName;
    this.flCountDown = flCountDown;
    this.flProgress = flProgress;
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.hGuide3 = hGuide3;
    this.hGuide4 = hGuide4;
    this.hGuide5 = hGuide5;
    this.hGuide6 = hGuide6;
    this.ivPicture = ivPicture;
    this.llCurrentTime = llCurrentTime;
    this.llRemainTime = llRemainTime;
    this.llStartTime = llStartTime;
    this.prIndicator = prIndicator;
    this.tvCountDown = tvCountDown;
    this.tvDesc = tvDesc;
    this.tvEmail = tvEmail;
    this.tvExamName = tvExamName;
    this.tvFileName = tvFileName;
    this.tvName = tvName;
    this.tvProgressInfo = tvProgressInfo;
    this.tvRemainTime = tvRemainTime;
    this.tvStartTime = tvStartTime;
    this.vGuide1 = vGuide1;
    this.vGuide2 = vGuide2;
    this.vInnerGuide1 = vInnerGuide1;
    this.vInnerGuide2 = vInnerGuide2;
  }

  @NonNull
  public static FragmentStandByBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_stand_by, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStandByBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStandByBinding>inflateInternal(inflater, R.layout.fragment_stand_by, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStandByBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_stand_by, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStandByBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStandByBinding>inflateInternal(inflater, R.layout.fragment_stand_by, null, false, component);
  }

  public static FragmentStandByBinding bind(@NonNull View view) {
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
  public static FragmentStandByBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentStandByBinding)bind(component, view, R.layout.fragment_stand_by);
  }
}
