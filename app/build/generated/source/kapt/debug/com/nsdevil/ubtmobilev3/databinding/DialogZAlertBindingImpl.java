package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogZAlertBindingImpl extends DialogZAlertBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_success, 1);
        sViewsWithIds.put(R.id.success, 2);
        sViewsWithIds.put(R.id.layout_warning, 3);
        sViewsWithIds.put(R.id.layout_error, 4);
        sViewsWithIds.put(R.id.error, 5);
        sViewsWithIds.put(R.id.layout_progress, 6);
        sViewsWithIds.put(R.id.loading, 7);
        sViewsWithIds.put(R.id.title, 8);
        sViewsWithIds.put(R.id.message, 9);
        sViewsWithIds.put(R.id.cancel, 10);
        sViewsWithIds.put(R.id.confirm, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogZAlertBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogZAlertBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
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