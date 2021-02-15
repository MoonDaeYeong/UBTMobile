package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemExamPreviewQBindingImpl extends ListItemExamPreviewQBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.barrier_header_b, 4);
        sViewsWithIds.put(R.id.barrier_quiz_b, 5);
        sViewsWithIds.put(R.id.rv_preview_a, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemExamPreviewQBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemExamPreviewQBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[4]
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeader.setTag(null);
        this.tvNumber.setTag(null);
        this.tvQuestion.setTag(null);
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
        if (BR.questionAnswer == variableId) {
            setQuestionAnswer((com.nsdevil.ubtmobilev3.data.model.QuestionAnswer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestionAnswer(@Nullable com.nsdevil.ubtmobilev3.data.model.QuestionAnswer QuestionAnswer) {
        this.mQuestionAnswer = QuestionAnswer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.questionAnswer);
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
        java.lang.String questionAnswerQuestionQuestion = null;
        com.nsdevil.ubtmobilev3.data.db.InQuestion questionAnswerQuestion = null;
        java.lang.String stringValueOfQuestionAnswerQuestionViewOrder = null;
        com.nsdevil.ubtmobilev3.data.model.QuestionAnswer questionAnswer = mQuestionAnswer;
        java.lang.String questionAnswerQuestionHeaderText = null;
        int questionAnswerQuestionViewOrder = 0;
        java.lang.String stringValueOfQuestionAnswerQuestionViewOrderChar = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (questionAnswer != null) {
                    // read questionAnswer.question
                    questionAnswerQuestion = questionAnswer.getQuestion();
                }


                if (questionAnswerQuestion != null) {
                    // read questionAnswer.question.question
                    questionAnswerQuestionQuestion = questionAnswerQuestion.getQuestion();
                    // read questionAnswer.question.headerText
                    questionAnswerQuestionHeaderText = questionAnswerQuestion.getHeaderText();
                    // read questionAnswer.question.viewOrder
                    questionAnswerQuestionViewOrder = questionAnswerQuestion.getViewOrder();
                }


                // read String.valueOf(questionAnswer.question.viewOrder)
                stringValueOfQuestionAnswerQuestionViewOrder = java.lang.String.valueOf(questionAnswerQuestionViewOrder);


                // read (String.valueOf(questionAnswer.question.viewOrder)) + ('.')
                stringValueOfQuestionAnswerQuestionViewOrderChar = (stringValueOfQuestionAnswerQuestionViewOrder) + ('.');
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindHtmlText(this.tvHeader, questionAnswerQuestionHeaderText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNumber, stringValueOfQuestionAnswerQuestionViewOrderChar);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindHtmlText(this.tvQuestion, questionAnswerQuestionQuestion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): questionAnswer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}