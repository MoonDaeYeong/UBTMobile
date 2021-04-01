package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingHomeBindingImpl extends FragmentSettingHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_title, 7);
        sViewsWithIds.put(R.id.ll_point, 8);
        sViewsWithIds.put(R.id.ll_exams, 9);
        sViewsWithIds.put(R.id.ll_organiztions, 10);
        sViewsWithIds.put(R.id.card_content, 11);
        sViewsWithIds.put(R.id.btn_user_info, 12);
        sViewsWithIds.put(R.id.btn_password_change, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentSettingHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivPicture.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvUserEmail.setTag(null);
        this.tvUserName.setTag(null);
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
        if (BR.profileData == variableId) {
            setProfileData((com.nsdevil.ubtmobilev3.data.model.ProfileData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileData(@Nullable com.nsdevil.ubtmobilev3.data.model.ProfileData ProfileData) {
        this.mProfileData = ProfileData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.profileData);
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
        int androidxDatabindingViewDataBindingSafeUnboxProfileDataOrgCount = 0;
        java.lang.Integer profileDataPoint = null;
        java.lang.String stringValueOfProfileDataOrgCount = null;
        java.lang.String profileDataImgUrl = null;
        java.lang.String stringValueOfProfileDataExamCount = null;
        java.lang.String mboundView4AndroidStringPointFormatProfileDataPoint = null;
        int androidxDatabindingViewDataBindingSafeUnboxProfileDataExamCount = 0;
        java.lang.Integer profileDataExamCount = null;
        java.lang.Integer profileDataOrgCount = null;
        java.lang.String profileDataUserEmail = null;
        java.lang.String profileDataUserName = null;
        com.nsdevil.ubtmobilev3.data.model.ProfileData profileData = mProfileData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (profileData != null) {
                    // read profileData.point
                    profileDataPoint = profileData.getPoint();
                    // read profileData.imgUrl
                    profileDataImgUrl = profileData.getImgUrl();
                    // read profileData.examCount
                    profileDataExamCount = profileData.getExamCount();
                    // read profileData.orgCount
                    profileDataOrgCount = profileData.getOrgCount();
                    // read profileData.userEmail
                    profileDataUserEmail = profileData.getUserEmail();
                    // read profileData.userName
                    profileDataUserName = profileData.getUserName();
                }


                // read @android:string/pointFormat
                mboundView4AndroidStringPointFormatProfileDataPoint = mboundView4.getResources().getString(R.string.pointFormat, profileDataPoint);
                // read androidx.databinding.ViewDataBinding.safeUnbox(profileData.examCount)
                androidxDatabindingViewDataBindingSafeUnboxProfileDataExamCount = androidx.databinding.ViewDataBinding.safeUnbox(profileDataExamCount);
                // read androidx.databinding.ViewDataBinding.safeUnbox(profileData.orgCount)
                androidxDatabindingViewDataBindingSafeUnboxProfileDataOrgCount = androidx.databinding.ViewDataBinding.safeUnbox(profileDataOrgCount);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(profileData.examCount))
                stringValueOfProfileDataExamCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxProfileDataExamCount);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(profileData.orgCount))
                stringValueOfProfileDataOrgCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxProfileDataOrgCount);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindCirclePicUrl(this.ivPicture, profileDataImgUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringPointFormatProfileDataPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfProfileDataExamCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, stringValueOfProfileDataOrgCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserEmail, profileDataUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, profileDataUserName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}