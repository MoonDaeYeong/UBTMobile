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
import com.google.android.exoplayer2.ui.PlayerView;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.data.db.InAnswer;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemAnswerVideoBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnNumber;

  @NonNull
  public final Guideline hGuide1;

  @NonNull
  public final PlayerView playerView;

  @NonNull
  public final Guideline vGuide1;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected InAnswer mAnswer;

  protected ListItemAnswerVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnNumber, Guideline hGuide1, PlayerView playerView, Guideline vGuide1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNumber = btnNumber;
    this.hGuide1 = hGuide1;
    this.playerView = playerView;
    this.vGuide1 = vGuide1;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setAnswer(@Nullable InAnswer answer);

  @Nullable
  public InAnswer getAnswer() {
    return mAnswer;
  }

  @NonNull
  public static ListItemAnswerVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_answer_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAnswerVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemAnswerVideoBinding>inflateInternal(inflater, R.layout.list_item_answer_video, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemAnswerVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_answer_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemAnswerVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemAnswerVideoBinding>inflateInternal(inflater, R.layout.list_item_answer_video, null, false, component);
  }

  public static ListItemAnswerVideoBinding bind(@NonNull View view) {
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
  public static ListItemAnswerVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemAnswerVideoBinding)bind(component, view, R.layout.list_item_answer_video);
  }
}
