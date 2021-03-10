package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemMoreExamBindingImpl extends ListItemMoreExamBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.h_barrier_1, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemMoreExamBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ListItemMoreExamBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.ivLogo.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDate.setTag(null);
        this.tvExamCode.setTag(null);
        this.tvExamTime.setTag(null);
        this.tvStatus.setTag(null);
        this.tvTitle.setTag(null);
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
        if (BR.content == variableId) {
            setContent((com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContent(@Nullable com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content Content) {
        this.mContent = Content;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.content);
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
        com.nsdevil.ubtmobilev3.data.response.AllMyExamResponse.Content content = mContent;
        java.lang.String contentExamSdate = null;
        java.lang.String contentExamTime = null;
        java.lang.String contentExamStatus = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String tvExamTimeAndroidStringExamTimeFormatContentExamTime = null;
        java.lang.String contentOrganizLogo = null;
        java.lang.String contentExamCode = null;
        java.lang.String contentExamName = null;
        java.lang.String contentExamEdate = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (content != null) {
                    // read content.examSdate
                    contentExamSdate = content.getExamSdate();
                    // read content.examTime
                    contentExamTime = content.getExamTime();
                    // read content.examStatus
                    contentExamStatus = content.getExamStatus();
                    // read content.organizLogo
                    contentOrganizLogo = content.getOrganizLogo();
                    // read content.examCode
                    contentExamCode = content.getExamCode();
                    // read content.examName
                    contentExamName = content.getExamName();
                    // read content.examEdate
                    contentExamEdate = content.getExamEdate();
                }


                // read @android:string/exam_time_format
                tvExamTimeAndroidStringExamTimeFormatContentExamTime = tvExamTime.getResources().getString(R.string.exam_time_format, contentExamTime);
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindImageFromUrl(this.ivLogo, contentOrganizLogo);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindExamDate(this.tvDate, contentExamSdate, contentExamEdate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExamCode, contentExamCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExamTime, tvExamTimeAndroidStringExamTimeFormatContentExamTime);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindStatusChangeText(this.tvStatus, contentExamStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, contentExamName);
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
        flag 0 (0x1L): content
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}