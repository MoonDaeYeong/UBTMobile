// Generated by data binding compiler. Do not edit!
package com.nsdevil.ubtmobilev3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.data.response.AllOrgResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemMoreOrgBinding extends ViewDataBinding {
  @NonNull
  public final Barrier hBarrier1;

  @NonNull
  public final ImageView ivBookMark;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvType;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected AllOrgResponse.Content mContent;

  protected ListItemMoreOrgBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier hBarrier1, ImageView ivBookMark, ImageView ivLogo, TextView tvDesc, TextView tvTitle,
      TextView tvType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hBarrier1 = hBarrier1;
    this.ivBookMark = ivBookMark;
    this.ivLogo = ivLogo;
    this.tvDesc = tvDesc;
    this.tvTitle = tvTitle;
    this.tvType = tvType;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setContent(@Nullable AllOrgResponse.Content content);

  @Nullable
  public AllOrgResponse.Content getContent() {
    return mContent;
  }

  @NonNull
  public static ListItemMoreOrgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_more_org, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemMoreOrgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemMoreOrgBinding>inflateInternal(inflater, R.layout.list_item_more_org, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemMoreOrgBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_more_org, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemMoreOrgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemMoreOrgBinding>inflateInternal(inflater, R.layout.list_item_more_org, null, false, component);
  }

  public static ListItemMoreOrgBinding bind(@NonNull View view) {
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
  public static ListItemMoreOrgBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemMoreOrgBinding)bind(component, view, R.layout.list_item_more_org);
  }
}
