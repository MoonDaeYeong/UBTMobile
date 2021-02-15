package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

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
        sViewsWithIds.put(R.id.card_my_exam, 11);
        sViewsWithIds.put(R.id.h_guide_my_exam, 12);
        sViewsWithIds.put(R.id.btn_my_exam_more, 13);
        sViewsWithIds.put(R.id.rv_my_exam, 14);
        sViewsWithIds.put(R.id.card_last_exam, 15);
        sViewsWithIds.put(R.id.h_guide_last_exam, 16);
        sViewsWithIds.put(R.id.btn_other_exam_more, 17);
        sViewsWithIds.put(R.id.rv_last_exam, 18);
        sViewsWithIds.put(R.id.card_my_org, 19);
        sViewsWithIds.put(R.id.h_guide_my_org, 20);
        sViewsWithIds.put(R.id.btn_my_org_more, 21);
        sViewsWithIds.put(R.id.rv_my_org, 22);
        sViewsWithIds.put(R.id.card_other_org, 23);
        sViewsWithIds.put(R.id.h_guide_other_org, 24);
        sViewsWithIds.put(R.id.btn_other_org_more, 25);
        sViewsWithIds.put(R.id.rv_other_org, 26);
        sViewsWithIds.put(R.id.empty_view, 27);
        sViewsWithIds.put(R.id.bar, 28);
        sViewsWithIds.put(R.id.fab, 29);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
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

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[28]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[25]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.view.View) bindings[27]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[29]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[24]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivPicture.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
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
        if (BR.homeResponseData == variableId) {
            setHomeResponseData((com.nsdevil.ubtmobilev3.data.response.HomeDataResponse) variable);
        }
        else if (BR.meResponseData == variableId) {
            setMeResponseData((com.nsdevil.ubtmobilev3.data.response.MeResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeResponseData(@Nullable com.nsdevil.ubtmobilev3.data.response.HomeDataResponse HomeResponseData) {
        this.mHomeResponseData = HomeResponseData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.homeResponseData);
        super.requestRebind();
    }
    public void setMeResponseData(@Nullable com.nsdevil.ubtmobilev3.data.response.MeResponse MeResponseData) {
        this.mMeResponseData = MeResponseData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.meResponseData);
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
        java.lang.String meResponseDataLastName = null;
        java.lang.String stringValueOfHomeResponseDataResultMyOrganizCount = null;
        java.lang.String meResponseDataImage = null;
        java.lang.String mboundView4AndroidStringPointFormatMeResponseDataPoint = null;
        int meResponseDataPoint = 0;
        java.lang.String stringValueOfHomeResponseDataResultMyExamCount = null;
        com.nsdevil.ubtmobilev3.data.response.HomeDataResponse homeResponseData = mHomeResponseData;
        com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result homeResponseDataResult = null;
        com.nsdevil.ubtmobilev3.data.response.MeResponse meResponseData = mMeResponseData;
        int homeResponseDataResultMyOrganizCount = 0;
        java.lang.String meResponseDataEmail = null;
        int homeResponseDataResultMyExamCount = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (homeResponseData != null) {
                    // read homeResponseData.result
                    homeResponseDataResult = homeResponseData.getResult();
                }


                if (homeResponseDataResult != null) {
                    // read homeResponseData.result.myOrganizCount
                    homeResponseDataResultMyOrganizCount = homeResponseDataResult.getMyOrganizCount();
                    // read homeResponseData.result.myExamCount
                    homeResponseDataResultMyExamCount = homeResponseDataResult.getMyExamCount();
                }


                // read String.valueOf(homeResponseData.result.myOrganizCount)
                stringValueOfHomeResponseDataResultMyOrganizCount = java.lang.String.valueOf(homeResponseDataResultMyOrganizCount);
                // read String.valueOf(homeResponseData.result.myExamCount)
                stringValueOfHomeResponseDataResultMyExamCount = java.lang.String.valueOf(homeResponseDataResultMyExamCount);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (meResponseData != null) {
                    // read meResponseData.lastName
                    meResponseDataLastName = meResponseData.getLastName();
                    // read meResponseData.image
                    meResponseDataImage = meResponseData.getImage();
                    // read meResponseData.point
                    meResponseDataPoint = meResponseData.getPoint();
                    // read meResponseData.email
                    meResponseDataEmail = meResponseData.getEmail();
                }


                // read @android:string/pointFormat
                mboundView4AndroidStringPointFormatMeResponseDataPoint = mboundView4.getResources().getString(R.string.pointFormat, meResponseDataPoint);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindCirclePicUrl(this.ivPicture, meResponseDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, mboundView4AndroidStringPointFormatMeResponseDataPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserEmail, meResponseDataEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, meResponseDataLastName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfHomeResponseDataResultMyExamCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, stringValueOfHomeResponseDataResultMyOrganizCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeResponseData
        flag 1 (0x2L): meResponseData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}