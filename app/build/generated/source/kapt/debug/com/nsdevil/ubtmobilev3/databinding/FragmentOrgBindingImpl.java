package com.nsdevil.ubtmobilev3.databinding;
import com.nsdevil.ubtmobilev3.R;
import com.nsdevil.ubtmobilev3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrgBindingImpl extends FragmentOrgBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 4);
        sViewsWithIds.put(R.id.toolbar_layout, 5);
        sViewsWithIds.put(R.id.card_title, 6);
        sViewsWithIds.put(R.id.rv_exams, 7);
        sViewsWithIds.put(R.id.tv_empty, 8);
        sViewsWithIds.put(R.id.bar, 9);
        sViewsWithIds.put(R.id.fab, 10);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrgBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentOrgBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[2]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[5]
            , (android.widget.TextView) bindings[8]
            );
        this.btnJoin.setTag(null);
        this.ivCover.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbar.setTag(null);
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
        if (BR.orgData == variableId) {
            setOrgData((com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Organiz) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrgData(@Nullable com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Organiz OrgData) {
        this.mOrgData = OrgData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.orgData);
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
        boolean orgDataMy = false;
        com.nsdevil.ubtmobilev3.data.response.HomeDataResponse.Result.Organiz orgData = mOrgData;
        java.lang.String orgDataCoverImage = null;
        java.lang.String orgDataOrganizName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (orgData != null) {
                    // read orgData.my
                    orgDataMy = orgData.isMy();
                    // read orgData.coverImage
                    orgDataCoverImage = orgData.getCoverImage();
                    // read orgData.organizName
                    orgDataOrganizName = orgData.getOrganizName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.setVisibility(this.btnJoin, orgDataMy);
            com.nsdevil.ubtmobilev3.adapter.BindingAdapterKt.bindImageFromUrl(this.ivCover, orgDataCoverImage);
            this.toolbar.setTitle(orgDataOrganizName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orgData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}