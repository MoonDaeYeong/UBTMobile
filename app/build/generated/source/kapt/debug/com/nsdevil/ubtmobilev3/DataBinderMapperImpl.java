package com.nsdevil.ubtmobilev3;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.nsdevil.ubtmobilev3.databinding.ActivityMainBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogAddTimeBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogCodeRegisterBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogExamInfoBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogOrgRegisterBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogSignPadBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogTestPreviewBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogTextInputBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.DialogZAlertBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentCategoryBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentEditProfileBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentExamBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentExamFinishBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentExamListBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentExamTestBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentHomeBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentLoginBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentMoreBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentOrgBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentPassChangeBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentSettingBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentSettingHomeBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentSignUpBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentStandByBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentSurveyBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentSurveyItemBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.FragmentTestQuestionBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerAudioBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerImgBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerMathBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerTextBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemAnswerVideoBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemExamListBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewABindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewATxtBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemExamPreviewQBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemHomeExamBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemHomeOrgBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemMoreExamBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemMoreOrgBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemOrgExamBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyAnswerBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyAnswerTxtBindingImpl;
import com.nsdevil.ubtmobilev3.databinding.ListItemSurveyQuestionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGADDTIME = 2;

  private static final int LAYOUT_DIALOGCODEREGISTER = 3;

  private static final int LAYOUT_DIALOGEXAMINFO = 4;

  private static final int LAYOUT_DIALOGORGREGISTER = 5;

  private static final int LAYOUT_DIALOGSIGNPAD = 6;

  private static final int LAYOUT_DIALOGTESTPREVIEW = 7;

  private static final int LAYOUT_DIALOGTEXTINPUT = 8;

  private static final int LAYOUT_DIALOGZALERT = 9;

  private static final int LAYOUT_FRAGMENTCATEGORY = 10;

  private static final int LAYOUT_FRAGMENTEDITPROFILE = 11;

  private static final int LAYOUT_FRAGMENTEXAM = 12;

  private static final int LAYOUT_FRAGMENTEXAMFINISH = 13;

  private static final int LAYOUT_FRAGMENTEXAMLIST = 14;

  private static final int LAYOUT_FRAGMENTEXAMTEST = 15;

  private static final int LAYOUT_FRAGMENTHOME = 16;

  private static final int LAYOUT_FRAGMENTLOGIN = 17;

  private static final int LAYOUT_FRAGMENTMORE = 18;

  private static final int LAYOUT_FRAGMENTORG = 19;

  private static final int LAYOUT_FRAGMENTPASSCHANGE = 20;

  private static final int LAYOUT_FRAGMENTSETTING = 21;

  private static final int LAYOUT_FRAGMENTSETTINGHOME = 22;

  private static final int LAYOUT_FRAGMENTSIGNUP = 23;

  private static final int LAYOUT_FRAGMENTSTANDBY = 24;

  private static final int LAYOUT_FRAGMENTSURVEY = 25;

  private static final int LAYOUT_FRAGMENTSURVEYITEM = 26;

  private static final int LAYOUT_FRAGMENTTESTQUESTION = 27;

  private static final int LAYOUT_LISTITEMANSWER = 28;

  private static final int LAYOUT_LISTITEMANSWERAUDIO = 29;

  private static final int LAYOUT_LISTITEMANSWERIMG = 30;

  private static final int LAYOUT_LISTITEMANSWERMATH = 31;

  private static final int LAYOUT_LISTITEMANSWERTEXT = 32;

  private static final int LAYOUT_LISTITEMANSWERVIDEO = 33;

  private static final int LAYOUT_LISTITEMEXAMLIST = 34;

  private static final int LAYOUT_LISTITEMEXAMPREVIEWA = 35;

  private static final int LAYOUT_LISTITEMEXAMPREVIEWATXT = 36;

  private static final int LAYOUT_LISTITEMEXAMPREVIEWQ = 37;

  private static final int LAYOUT_LISTITEMHOMEEXAM = 38;

  private static final int LAYOUT_LISTITEMHOMEORG = 39;

  private static final int LAYOUT_LISTITEMMOREEXAM = 40;

  private static final int LAYOUT_LISTITEMMOREORG = 41;

  private static final int LAYOUT_LISTITEMORGEXAM = 42;

  private static final int LAYOUT_LISTITEMSURVEYANSWER = 43;

  private static final int LAYOUT_LISTITEMSURVEYANSWERTXT = 44;

  private static final int LAYOUT_LISTITEMSURVEYQUESTION = 45;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(45);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_add_time, LAYOUT_DIALOGADDTIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_code_register, LAYOUT_DIALOGCODEREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_exam_info, LAYOUT_DIALOGEXAMINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_org_register, LAYOUT_DIALOGORGREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_sign_pad, LAYOUT_DIALOGSIGNPAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_test_preview, LAYOUT_DIALOGTESTPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_text_input, LAYOUT_DIALOGTEXTINPUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.dialog_z_alert, LAYOUT_DIALOGZALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_category, LAYOUT_FRAGMENTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_edit_profile, LAYOUT_FRAGMENTEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_exam, LAYOUT_FRAGMENTEXAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_exam_finish, LAYOUT_FRAGMENTEXAMFINISH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_exam_list, LAYOUT_FRAGMENTEXAMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_exam_test, LAYOUT_FRAGMENTEXAMTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_more, LAYOUT_FRAGMENTMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_org, LAYOUT_FRAGMENTORG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_pass_change, LAYOUT_FRAGMENTPASSCHANGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_setting_home, LAYOUT_FRAGMENTSETTINGHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_stand_by, LAYOUT_FRAGMENTSTANDBY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_survey, LAYOUT_FRAGMENTSURVEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_survey_item, LAYOUT_FRAGMENTSURVEYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.fragment_test_question, LAYOUT_FRAGMENTTESTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer, LAYOUT_LISTITEMANSWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer_audio, LAYOUT_LISTITEMANSWERAUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer_img, LAYOUT_LISTITEMANSWERIMG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer_math, LAYOUT_LISTITEMANSWERMATH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer_text, LAYOUT_LISTITEMANSWERTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_answer_video, LAYOUT_LISTITEMANSWERVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_exam_list, LAYOUT_LISTITEMEXAMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_a, LAYOUT_LISTITEMEXAMPREVIEWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_a_txt, LAYOUT_LISTITEMEXAMPREVIEWATXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_q, LAYOUT_LISTITEMEXAMPREVIEWQ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_home_exam, LAYOUT_LISTITEMHOMEEXAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_home_org, LAYOUT_LISTITEMHOMEORG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_more_exam, LAYOUT_LISTITEMMOREEXAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_more_org, LAYOUT_LISTITEMMOREORG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_org_exam, LAYOUT_LISTITEMORGEXAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_survey_answer, LAYOUT_LISTITEMSURVEYANSWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_survey_answer_txt, LAYOUT_LISTITEMSURVEYANSWERTXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nsdevil.ubtmobilev3.R.layout.list_item_survey_question, LAYOUT_LISTITEMSURVEYQUESTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGADDTIME: {
          if ("layout/dialog_add_time_0".equals(tag)) {
            return new DialogAddTimeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_add_time is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCODEREGISTER: {
          if ("layout/dialog_code_register_0".equals(tag)) {
            return new DialogCodeRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_code_register is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGEXAMINFO: {
          if ("layout/dialog_exam_info_0".equals(tag)) {
            return new DialogExamInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_exam_info is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGORGREGISTER: {
          if ("layout/dialog_org_register_0".equals(tag)) {
            return new DialogOrgRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_org_register is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSIGNPAD: {
          if ("layout/dialog_sign_pad_0".equals(tag)) {
            return new DialogSignPadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_sign_pad is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGTESTPREVIEW: {
          if ("layout/dialog_test_preview_0".equals(tag)) {
            return new DialogTestPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_test_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGTEXTINPUT: {
          if ("layout/dialog_text_input_0".equals(tag)) {
            return new DialogTextInputBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_text_input is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGZALERT: {
          if ("layout/dialog_z_alert_0".equals(tag)) {
            return new DialogZAlertBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_z_alert is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORY: {
          if ("layout/fragment_category_0".equals(tag)) {
            return new FragmentCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITPROFILE: {
          if ("layout/fragment_edit_profile_0".equals(tag)) {
            return new FragmentEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXAM: {
          if ("layout/fragment_exam_0".equals(tag)) {
            return new FragmentExamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exam is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXAMFINISH: {
          if ("layout/fragment_exam_finish_0".equals(tag)) {
            return new FragmentExamFinishBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exam_finish is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXAMLIST: {
          if ("layout/fragment_exam_list_0".equals(tag)) {
            return new FragmentExamListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exam_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXAMTEST: {
          if ("layout/fragment_exam_test_0".equals(tag)) {
            return new FragmentExamTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_exam_test is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMORE: {
          if ("layout/fragment_more_0".equals(tag)) {
            return new FragmentMoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_more is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORG: {
          if ("layout/fragment_org_0".equals(tag)) {
            return new FragmentOrgBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_org is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPASSCHANGE: {
          if ("layout/fragment_pass_change_0".equals(tag)) {
            return new FragmentPassChangeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pass_change is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGHOME: {
          if ("layout/fragment_setting_home_0".equals(tag)) {
            return new FragmentSettingHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_sign_up_0".equals(tag)) {
            return new FragmentSignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTANDBY: {
          if ("layout/fragment_stand_by_0".equals(tag)) {
            return new FragmentStandByBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_stand_by is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSURVEY: {
          if ("layout/fragment_survey_0".equals(tag)) {
            return new FragmentSurveyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_survey is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSURVEYITEM: {
          if ("layout/fragment_survey_item_0".equals(tag)) {
            return new FragmentSurveyItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_survey_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTESTQUESTION: {
          if ("layout/fragment_test_question_0".equals(tag)) {
            return new FragmentTestQuestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test_question is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWER: {
          if ("layout/list_item_answer_0".equals(tag)) {
            return new ListItemAnswerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWERAUDIO: {
          if ("layout/list_item_answer_audio_0".equals(tag)) {
            return new ListItemAnswerAudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer_audio is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWERIMG: {
          if ("layout/list_item_answer_img_0".equals(tag)) {
            return new ListItemAnswerImgBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer_img is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWERMATH: {
          if ("layout/list_item_answer_math_0".equals(tag)) {
            return new ListItemAnswerMathBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer_math is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWERTEXT: {
          if ("layout/list_item_answer_text_0".equals(tag)) {
            return new ListItemAnswerTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer_text is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMANSWERVIDEO: {
          if ("layout/list_item_answer_video_0".equals(tag)) {
            return new ListItemAnswerVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_answer_video is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMEXAMLIST: {
          if ("layout/list_item_exam_list_0".equals(tag)) {
            return new ListItemExamListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_exam_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMEXAMPREVIEWA: {
          if ("layout/list_item_exam_preview_a_0".equals(tag)) {
            return new ListItemExamPreviewABindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_exam_preview_a is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMEXAMPREVIEWATXT: {
          if ("layout/list_item_exam_preview_a_txt_0".equals(tag)) {
            return new ListItemExamPreviewATxtBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_exam_preview_a_txt is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMEXAMPREVIEWQ: {
          if ("layout/list_item_exam_preview_q_0".equals(tag)) {
            return new ListItemExamPreviewQBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_exam_preview_q is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMHOMEEXAM: {
          if ("layout/list_item_home_exam_0".equals(tag)) {
            return new ListItemHomeExamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_home_exam is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMHOMEORG: {
          if ("layout/list_item_home_org_0".equals(tag)) {
            return new ListItemHomeOrgBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_home_org is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMMOREEXAM: {
          if ("layout/list_item_more_exam_0".equals(tag)) {
            return new ListItemMoreExamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_more_exam is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMMOREORG: {
          if ("layout/list_item_more_org_0".equals(tag)) {
            return new ListItemMoreOrgBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_more_org is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMORGEXAM: {
          if ("layout/list_item_org_exam_0".equals(tag)) {
            return new ListItemOrgExamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_org_exam is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSURVEYANSWER: {
          if ("layout/list_item_survey_answer_0".equals(tag)) {
            return new ListItemSurveyAnswerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_survey_answer is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSURVEYANSWERTXT: {
          if ("layout/list_item_survey_answer_txt_0".equals(tag)) {
            return new ListItemSurveyAnswerTxtBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_survey_answer_txt is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSURVEYQUESTION: {
          if ("layout/list_item_survey_question_0".equals(tag)) {
            return new ListItemSurveyQuestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_survey_question is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.github.gcacace.signaturepad.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(15);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "answer");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "content");
      sKeys.put(4, "homeResponseData");
      sKeys.put(5, "inQ");
      sKeys.put(6, "meResponseData");
      sKeys.put(7, "orgData");
      sKeys.put(8, "orgExamContent");
      sKeys.put(9, "organizeData");
      sKeys.put(10, "profileData");
      sKeys.put(11, "question");
      sKeys.put(12, "questionAnswer");
      sKeys.put(13, "surveyAnswer");
      sKeys.put(14, "userExamData");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(45);

    static {
      sKeys.put("layout/activity_main_0", com.nsdevil.ubtmobilev3.R.layout.activity_main);
      sKeys.put("layout/dialog_add_time_0", com.nsdevil.ubtmobilev3.R.layout.dialog_add_time);
      sKeys.put("layout/dialog_code_register_0", com.nsdevil.ubtmobilev3.R.layout.dialog_code_register);
      sKeys.put("layout/dialog_exam_info_0", com.nsdevil.ubtmobilev3.R.layout.dialog_exam_info);
      sKeys.put("layout/dialog_org_register_0", com.nsdevil.ubtmobilev3.R.layout.dialog_org_register);
      sKeys.put("layout/dialog_sign_pad_0", com.nsdevil.ubtmobilev3.R.layout.dialog_sign_pad);
      sKeys.put("layout/dialog_test_preview_0", com.nsdevil.ubtmobilev3.R.layout.dialog_test_preview);
      sKeys.put("layout/dialog_text_input_0", com.nsdevil.ubtmobilev3.R.layout.dialog_text_input);
      sKeys.put("layout/dialog_z_alert_0", com.nsdevil.ubtmobilev3.R.layout.dialog_z_alert);
      sKeys.put("layout/fragment_category_0", com.nsdevil.ubtmobilev3.R.layout.fragment_category);
      sKeys.put("layout/fragment_edit_profile_0", com.nsdevil.ubtmobilev3.R.layout.fragment_edit_profile);
      sKeys.put("layout/fragment_exam_0", com.nsdevil.ubtmobilev3.R.layout.fragment_exam);
      sKeys.put("layout/fragment_exam_finish_0", com.nsdevil.ubtmobilev3.R.layout.fragment_exam_finish);
      sKeys.put("layout/fragment_exam_list_0", com.nsdevil.ubtmobilev3.R.layout.fragment_exam_list);
      sKeys.put("layout/fragment_exam_test_0", com.nsdevil.ubtmobilev3.R.layout.fragment_exam_test);
      sKeys.put("layout/fragment_home_0", com.nsdevil.ubtmobilev3.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.nsdevil.ubtmobilev3.R.layout.fragment_login);
      sKeys.put("layout/fragment_more_0", com.nsdevil.ubtmobilev3.R.layout.fragment_more);
      sKeys.put("layout/fragment_org_0", com.nsdevil.ubtmobilev3.R.layout.fragment_org);
      sKeys.put("layout/fragment_pass_change_0", com.nsdevil.ubtmobilev3.R.layout.fragment_pass_change);
      sKeys.put("layout/fragment_setting_0", com.nsdevil.ubtmobilev3.R.layout.fragment_setting);
      sKeys.put("layout/fragment_setting_home_0", com.nsdevil.ubtmobilev3.R.layout.fragment_setting_home);
      sKeys.put("layout/fragment_sign_up_0", com.nsdevil.ubtmobilev3.R.layout.fragment_sign_up);
      sKeys.put("layout/fragment_stand_by_0", com.nsdevil.ubtmobilev3.R.layout.fragment_stand_by);
      sKeys.put("layout/fragment_survey_0", com.nsdevil.ubtmobilev3.R.layout.fragment_survey);
      sKeys.put("layout/fragment_survey_item_0", com.nsdevil.ubtmobilev3.R.layout.fragment_survey_item);
      sKeys.put("layout/fragment_test_question_0", com.nsdevil.ubtmobilev3.R.layout.fragment_test_question);
      sKeys.put("layout/list_item_answer_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer);
      sKeys.put("layout/list_item_answer_audio_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer_audio);
      sKeys.put("layout/list_item_answer_img_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer_img);
      sKeys.put("layout/list_item_answer_math_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer_math);
      sKeys.put("layout/list_item_answer_text_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer_text);
      sKeys.put("layout/list_item_answer_video_0", com.nsdevil.ubtmobilev3.R.layout.list_item_answer_video);
      sKeys.put("layout/list_item_exam_list_0", com.nsdevil.ubtmobilev3.R.layout.list_item_exam_list);
      sKeys.put("layout/list_item_exam_preview_a_0", com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_a);
      sKeys.put("layout/list_item_exam_preview_a_txt_0", com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_a_txt);
      sKeys.put("layout/list_item_exam_preview_q_0", com.nsdevil.ubtmobilev3.R.layout.list_item_exam_preview_q);
      sKeys.put("layout/list_item_home_exam_0", com.nsdevil.ubtmobilev3.R.layout.list_item_home_exam);
      sKeys.put("layout/list_item_home_org_0", com.nsdevil.ubtmobilev3.R.layout.list_item_home_org);
      sKeys.put("layout/list_item_more_exam_0", com.nsdevil.ubtmobilev3.R.layout.list_item_more_exam);
      sKeys.put("layout/list_item_more_org_0", com.nsdevil.ubtmobilev3.R.layout.list_item_more_org);
      sKeys.put("layout/list_item_org_exam_0", com.nsdevil.ubtmobilev3.R.layout.list_item_org_exam);
      sKeys.put("layout/list_item_survey_answer_0", com.nsdevil.ubtmobilev3.R.layout.list_item_survey_answer);
      sKeys.put("layout/list_item_survey_answer_txt_0", com.nsdevil.ubtmobilev3.R.layout.list_item_survey_answer_txt);
      sKeys.put("layout/list_item_survey_question_0", com.nsdevil.ubtmobilev3.R.layout.list_item_survey_question);
    }
  }
}
