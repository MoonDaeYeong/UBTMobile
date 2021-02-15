package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogExamInfoBindingImpl extends DialogExamInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_guide_1, 7);
        sViewsWithIds.put(R.id.h_guide_2, 8);
        sViewsWithIds.put(R.id.h_guide_3, 9);
        sViewsWithIds.put(R.id.h_guide_4, 10);
        sViewsWithIds.put(R.id.btn_close, 11);
        sViewsWithIds.put(R.id.btn_take_an_exam, 12);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogExamInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private DialogExamInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvExamCode.setTag(null);
        this.tvExamInfo.setTag(null);
        this.tvExamName.setTag(null);
        this.tvExamStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.userExamData == variableId) {
            setUserExamData((com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.UserExam) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserExamData(@Nullable com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.UserExam UserExamData) {
        this.mUserExamData = UserExamData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userExamData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userExamDataExamEdate = null;
        java.lang.String userExamDataExamName = null;
        java.lang.String userExamDataExamStatus = null;
        java.lang.String userExamDataExamSdate = null;
        java.lang.String userExamDataOrganizLogo = null;
        com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.UserExam userExamData = mUserExamData;
        java.lang.String userExamDataExamCode = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userExamData != null) {
                    // read userExamData.examEdate
                    userExamDataExamEdate = userExamData.getExamEdate();
                    // read userExamData.examName
                    userExamDataExamName = userExamData.getExamName();
                    // read userExamData.examStatus
                    userExamDataExamStatus = userExamData.getExamStatus();
                    // read userExamData.examSdate
                    userExamDataExamSdate = userExamData.getExamSdate();
                    // read userExamData.organizLogo
                    userExamDataOrganizLogo = userExamData.getOrganizLogo();
                    // read userExamData.examCode
                    userExamDataExamCode = userExamData.getExamCode();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindImageFromUrl(this.mboundView3, userExamDataOrganizLogo);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindExamDate(this.mboundView6, userExamDataExamSdate, userExamDataExamEdate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExamCode, userExamDataExamCode);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindStatusChangeInfoText(this.tvExamInfo, userExamDataExamStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExamName, userExamDataExamName);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindStatusChangeText(this.tvExamStatus, userExamDataExamStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userExamData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}