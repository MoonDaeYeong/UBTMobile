package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemAnswerTextBindingImpl extends ListItemAnswerTextBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_guide_1, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemAnswerTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemAnswerTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            );
        this.btnNumber.setTag(null);
        this.etAnswer.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.answer == variableId) {
            setAnswer((com.nsdevil.ubtmobilev3.data.db.InAnswer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAnswer(@Nullable com.nsdevil.ubtmobilev3.data.db.InAnswer Answer) {
        this.mAnswer = Answer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.answer);
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
        java.lang.String answerOptionNumber = null;
        java.lang.String answerAnswer = null;
        java.lang.String answerTextAnswer = null;
        com.nsdevil.ubtmobilev3.data.db.InAnswer answer = mAnswer;

        if ((dirtyFlags & 0x3L) != 0) {



                if (answer != null) {
                    // read answer.optionNumber
                    answerOptionNumber = answer.getOptionNumber();
                    // read answer.answer
                    answerAnswer = answer.getAnswer();
                    // read answer.textAnswer
                    answerTextAnswer = answer.getTextAnswer();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnNumber, answerOptionNumber);
            this.etAnswer.setHint(answerAnswer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAnswer, answerTextAnswer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): answer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}