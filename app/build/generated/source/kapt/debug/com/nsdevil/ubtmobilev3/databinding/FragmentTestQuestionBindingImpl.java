package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTestQuestionBindingImpl extends FragmentTestQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_barrier_1, 5);
        sViewsWithIds.put(R.id.h_barrier_2, 6);
        sViewsWithIds.put(R.id.h_barrier_3, 7);
        sViewsWithIds.put(R.id.h_barrier_4, 8);
        sViewsWithIds.put(R.id.h_barrier_5, 9);
        sViewsWithIds.put(R.id.ll_data_root, 10);
        sViewsWithIds.put(R.id.rv_answer, 11);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTestQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentTestQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (androidx.constraintlayout.widget.Barrier) bindings[7]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvHeader.setTag(null);
        this.tvQuestion.setTag(null);
        this.tvQuestionNo.setTag(null);
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
        if (BR.inQ == variableId) {
            setInQ((com.nsdevil.ubtmobilev3.data.db.InQuestion) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInQ(@Nullable com.nsdevil.ubtmobilev3.data.db.InQuestion InQ) {
        this.mInQ = InQ;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.inQ);
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
        com.nsdevil.ubtmobilev3.data.db.InQuestion inQ = mInQ;
        java.lang.String inQHeaderText = null;
        boolean inQUserCheck = false;
        int inQViewOrder = 0;
        java.lang.String stringValueOfInQViewOrder = null;
        java.lang.String stringValueOfInQViewOrderChar = null;
        java.lang.String inQQuestion = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (inQ != null) {
                    // read inQ.headerText
                    inQHeaderText = inQ.getHeaderText();
                    // read inQ.userCheck
                    inQUserCheck = inQ.getUserCheck();
                    // read inQ.viewOrder
                    inQViewOrder = inQ.getViewOrder();
                    // read inQ.question
                    inQQuestion = inQ.getQuestion();
                }


                // read String.valueOf(inQ.viewOrder)
                stringValueOfInQViewOrder = java.lang.String.valueOf(inQViewOrder);


                // read (String.valueOf(inQ.viewOrder)) + ('.')
                stringValueOfInQViewOrderChar = (stringValueOfInQViewOrder) + ('.');
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindCheckVisible(this.mboundView2, inQUserCheck);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindHtmlText(this.tvHeader, inQHeaderText);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindHtmlText(this.tvQuestion, inQQuestion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuestionNo, stringValueOfInQViewOrderChar);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): inQ
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}