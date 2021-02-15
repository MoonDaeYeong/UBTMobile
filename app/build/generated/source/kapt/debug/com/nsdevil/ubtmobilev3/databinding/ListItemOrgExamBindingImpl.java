package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemOrgExamBindingImpl extends ListItemOrgExamBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_guide_1, 6);
        sViewsWithIds.put(R.id.h_guide_2, 7);
        sViewsWithIds.put(R.id.h_guide_3, 8);
        sViewsWithIds.put(R.id.iv_logo, 9);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemOrgExamBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ListItemOrgExamBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.examName.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvPoint.setTag(null);
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
        if (BR.orgExamContent == variableId) {
            setOrgExamContent((com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrgExamContent(@Nullable com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content OrgExamContent) {
        this.mOrgExamContent = OrgExamContent;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.orgExamContent);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
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
        java.lang.String tvPointAndroidStringPointFormatOrgExamContentExamPrice = null;
        com.nsdevil.ubtmobilev3.data.response.OrgExamListResponse.Content orgExamContent = mOrgExamContent;
        java.lang.String orgExamContentExamSdate = null;
        java.lang.String orgExamContentExamStatus = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        int orgExamContentExamPrice = 0;
        java.lang.String orgExamContentExamName = null;
        java.lang.String orgExamContentExamEdate = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (orgExamContent != null) {
                    // read orgExamContent.examSdate
                    orgExamContentExamSdate = orgExamContent.getExamSdate();
                    // read orgExamContent.examStatus
                    orgExamContentExamStatus = orgExamContent.getExamStatus();
                    // read orgExamContent.examPrice
                    orgExamContentExamPrice = orgExamContent.getExamPrice();
                    // read orgExamContent.examName
                    orgExamContentExamName = orgExamContent.getExamName();
                    // read orgExamContent.examEdate
                    orgExamContentExamEdate = orgExamContent.getExamEdate();
                }


                // read @android:string/pointFormat
                tvPointAndroidStringPointFormatOrgExamContentExamPrice = tvPoint.getResources().getString(R.string.pointFormat, orgExamContentExamPrice);
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.examName, orgExamContentExamName);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindExamDate(this.mboundView5, orgExamContentExamSdate, orgExamContentExamEdate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPoint, tvPointAndroidStringPointFormatOrgExamContentExamPrice);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindStatusChangeText(this.tvStatus, orgExamContentExamStatus);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orgExamContent
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}