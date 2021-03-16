package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemSurveyAnswerBindingImpl extends ListItemSurveyAnswerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_barrier_1, 3);
        sViewsWithIds.put(R.id.v_guide_1, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemSurveyAnswerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemSurveyAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            );
        this.btnNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAnswer.setTag(null);
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
        else if (BR.answer == variableId) {
            setAnswer((com.nsdevil.ubtmobilev3.data.model.SurveyAnswer) variable);
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
    public void setAnswer(@Nullable com.nsdevil.ubtmobilev3.data.model.SurveyAnswer Answer) {
        this.mAnswer = Answer;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        int answerNo = 0;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String stringValueOfAnswerNo = null;
        java.lang.String answerAnswers = null;
        com.nsdevil.ubtmobilev3.data.model.SurveyAnswer answer = mAnswer;
        boolean answerUserCheck = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (answer != null) {
                    // read answer.no
                    answerNo = answer.getNo();
                    // read answer.answers
                    answerAnswers = answer.getAnswers();
                    // read answer.userCheck
                    answerUserCheck = answer.getUserCheck();
                }


                // read String.valueOf(answer.no)
                stringValueOfAnswerNo = java.lang.String.valueOf(answerNo);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnNumber.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnNumber, stringValueOfAnswerNo);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindCheckAnswer(this.btnNumber, answerUserCheck);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAnswer, answerAnswers);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): answer
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}