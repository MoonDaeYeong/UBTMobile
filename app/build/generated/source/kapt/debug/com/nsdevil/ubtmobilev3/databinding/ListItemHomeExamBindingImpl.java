package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemHomeExamBindingImpl extends ListItemHomeExamBinding  {

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
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemHomeExamBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ListItemHomeExamBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvExamCode.setTag(null);
        this.tvStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.userExamData == variableId) {
            setUserExamData((com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setUserExamData(@Nullable com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam UserExamData) {
        this.mUserExamData = UserExamData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String userExamDataExamSdate = null;
        java.lang.String userExamDataOrganizLogo = null;
        com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Userexam userExamData = mUserExamData;
        java.lang.String userExamDataExamCode = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



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
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindImageFromUrl(this.mboundView4, userExamDataOrganizLogo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userExamDataExamName);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindExamDate(this.mboundView6, userExamDataExamSdate, userExamDataExamEdate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExamCode, userExamDataExamCode);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindStatusChangeText(this.tvStatus, userExamDataExamStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): userExamData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}