// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.nsdevil.ubtmobilev3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentExamListBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnPreview;

  @NonNull
  public final Button btnSubmission;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final Guideline hGuide2;

  @NonNull
  public final Guideline hGuide3;

  @NonNull
  public final TabItem tiExamList1;

  @NonNull
  public final TabItem tiExamList2;

  @NonNull
  public final TabItem tiExamList3;

  @NonNull
  public final TabItem tiExamList4;

  @NonNull
  public final TabLayout tlExamList;

  @NonNull
  public final TextView tvTabCategoryInfo;

  @NonNull
  public final ViewPager2 vpExamList;

  protected FragmentExamListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnPreview, Button btnSubmission, Guideline hGuide1, Guideline hGuide2,
      Guideline hGuide3, TabItem tiExamList1, TabItem tiExamList2, TabItem tiExamList3,
      TabItem tiExamList4, TabLayout tlExamList, TextView tvTabCategoryInfo,
      ViewPager2 vpExamList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnPreview = btnPreview;
    this.btnSubmission = btnSubmission;
    this.hGuide1 = hGuide1;
    this.hGuide2 = hGuide2;
    this.hGuide3 = hGuide3;
    this.tiExamList1 = tiExamList1;
    this.tiExamList2 = tiExamList2;
    this.tiExamList3 = tiExamList3;
    this.tiExamList4 = tiExamList4;
    this.tlExamList = tlExamList;
    this.tvTabCategoryInfo = tvTabCategoryInfo;
    this.vpExamList = vpExamList;
  }

  @NonNull
  public static FragmentExamListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exam_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExamListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentExamListBinding>inflateInternal(inflater, R.layout.fragment_exam_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentExamListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_exam_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentExamListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentExamListBinding>inflateInternal(inflater, R.layout.fragment_exam_list, null, false, component);
  }

  public static FragmentExamListBinding bind(@NonNull View view) {
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
  public static FragmentExamListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentExamListBinding)bind(component, view, R.layout.fragment_exam_list);
  }
}