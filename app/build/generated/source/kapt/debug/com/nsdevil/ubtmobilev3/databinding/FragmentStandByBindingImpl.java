package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStandByBindingImpl extends FragmentStandByBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_guide_1, 1);
        sViewsWithIds.put(R.id.h_guide_2, 2);
        sViewsWithIds.put(R.id.h_guide_3, 3);
        sViewsWithIds.put(R.id.h_guide_4, 4);
        sViewsWithIds.put(R.id.h_guide_5, 5);
        sViewsWithIds.put(R.id.h_guide_6, 6);
        sViewsWithIds.put(R.id.v_guide_1, 7);
        sViewsWithIds.put(R.id.v_guide_2, 8);
        sViewsWithIds.put(R.id.ll_current_time, 9);
        sViewsWithIds.put(R.id.ll_start_time, 10);
        sViewsWithIds.put(R.id.tv_start_time, 11);
        sViewsWithIds.put(R.id.ll_remain_time, 12);
        sViewsWithIds.put(R.id.tv_remain_time, 13);
        sViewsWithIds.put(R.id.v_inner_guide_1, 14);
        sViewsWithIds.put(R.id.v_inner_guide_2, 15);
        sViewsWithIds.put(R.id.iv_picture, 16);
        sViewsWithIds.put(R.id.tv_exam_name, 17);
        sViewsWithIds.put(R.id.et_exam_name, 18);
        sViewsWithIds.put(R.id.tv_name, 19);
        sViewsWithIds.put(R.id.et_name, 20);
        sViewsWithIds.put(R.id.tv_email, 21);
        sViewsWithIds.put(R.id.et_email, 22);
        sViewsWithIds.put(R.id.btn_sign, 23);
        sViewsWithIds.put(R.id.tv_desc, 24);
        sViewsWithIds.put(R.id.btn_start, 25);
        sViewsWithIds.put(R.id.fl_progress, 26);
        sViewsWithIds.put(R.id.tv_file_name, 27);
        sViewsWithIds.put(R.id.pr_indicator, 28);
        sViewsWithIds.put(R.id.tv_progress_info, 29);
        sViewsWithIds.put(R.id.fl_count_down, 30);
        sViewsWithIds.put(R.id.tv_count_down, 31);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStandByBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private FragmentStandByBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[23]
            , (com.google.android.material.button.MaterialButton) bindings[25]
            , (com.google.android.material.textfield.TextInputEditText) bindings[22]
            , (com.google.android.material.textfield.TextInputEditText) bindings[18]
            , (com.google.android.material.textfield.TextInputEditText) bindings[20]
            , (android.widget.FrameLayout) bindings[30]
            , (android.widget.FrameLayout) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.ProgressBar) bindings[28]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}