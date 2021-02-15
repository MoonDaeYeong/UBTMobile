// Generated by Dagger (https://dagger.dev).
package com.nsdevil.ubtmobilev3;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.nsdevil.ubtmobilev3.api.UbtService;
import com.nsdevil.ubtmobilev3.data.db.AppDatabase;
import com.nsdevil.ubtmobilev3.data.db.InAnswerDao;
import com.nsdevil.ubtmobilev3.data.db.InDataDao;
import com.nsdevil.ubtmobilev3.data.db.InExamInfoDao;
import com.nsdevil.ubtmobilev3.data.db.InQuestionDao;
import com.nsdevil.ubtmobilev3.data.repository.ExamRepository;
import com.nsdevil.ubtmobilev3.data.repository.HomeRepository;
import com.nsdevil.ubtmobilev3.data.repository.LoginRepository;
import com.nsdevil.ubtmobilev3.data.repository.MoreRepository;
import com.nsdevil.ubtmobilev3.data.repository.OrgRepository;
import com.nsdevil.ubtmobilev3.data.repository.SignUpRepository;
import com.nsdevil.ubtmobilev3.data.repository.StandByRepository;
import com.nsdevil.ubtmobilev3.di.DatabaseModule;
import com.nsdevil.ubtmobilev3.di.DatabaseModule_ProvideAnswerDaoFactory;
import com.nsdevil.ubtmobilev3.di.DatabaseModule_ProvideAppDatabaseFactory;
import com.nsdevil.ubtmobilev3.di.DatabaseModule_ProvideDataDaoFactory;
import com.nsdevil.ubtmobilev3.di.DatabaseModule_ProvideExamInfoDaoFactory;
import com.nsdevil.ubtmobilev3.di.DatabaseModule_ProvideQuestionDaoFactory;
import com.nsdevil.ubtmobilev3.di.NetworkModule;
import com.nsdevil.ubtmobilev3.di.NetworkModule_ProvideUbtServiceFactory;
import com.nsdevil.ubtmobilev3.dialog.TestPreviewDialog;
import com.nsdevil.ubtmobilev3.ui.ExamFragment;
import com.nsdevil.ubtmobilev3.ui.HomeFragment;
import com.nsdevil.ubtmobilev3.ui.LoginFragment;
import com.nsdevil.ubtmobilev3.ui.MoreFragment;
import com.nsdevil.ubtmobilev3.ui.OrgFragment;
import com.nsdevil.ubtmobilev3.ui.SignUpFragment;
import com.nsdevil.ubtmobilev3.ui.StandByFragment;
import com.nsdevil.ubtmobilev3.ui.exam.CategoryFragment;
import com.nsdevil.ubtmobilev3.ui.exam.ExamTestFragment;
import com.nsdevil.ubtmobilev3.ui.exam.TestQuestionFragment;
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.LoginViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.MoreViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.MoreViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.OrgViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.OrgViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.SignUpViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.SignUpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel;
import com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DatabaseModule databaseModule;

  private final NetworkModule networkModule;

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object ubtService = new MemoizedSentinel();

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam, DatabaseModule databaseModuleParam,
      NetworkModule networkModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.databaseModule = databaseModuleParam;
    this.networkModule = networkModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AppDatabase appDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideAppDatabaseFactory.provideAppDatabase(databaseModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private InExamInfoDao inExamInfoDao() {
    return DatabaseModule_ProvideExamInfoDaoFactory.provideExamInfoDao(databaseModule, appDatabase());
  }

  private InQuestionDao inQuestionDao() {
    return DatabaseModule_ProvideQuestionDaoFactory.provideQuestionDao(databaseModule, appDatabase());
  }

  private InDataDao inDataDao() {
    return DatabaseModule_ProvideDataDaoFactory.provideDataDao(databaseModule, appDatabase());
  }

  private InAnswerDao inAnswerDao() {
    return DatabaseModule_ProvideAnswerDaoFactory.provideAnswerDao(databaseModule, appDatabase());
  }

  private UbtService ubtService() {
    Object local = ubtService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = ubtService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideUbtServiceFactory.provideUbtService(networkModule);
          ubtService = DoubleCheck.reentrantCheck(ubtService, local);
        }
      }
    }
    return (UbtService) local;
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DatabaseModule databaseModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule, databaseModule, networkModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      private Set<String> keySetSetOfString() {
        return SetBuilder.<String>newSetBuilder(7).add(ExamViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MoreViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(OrgViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SignUpViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StandByViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), keySetSetOfString(), new ViewModelCBuilder(), Collections.<ViewModelProvider.Factory>emptySet(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public void injectTestPreviewDialog(TestPreviewDialog testPreviewDialog) {
        }

        @Override
        public void injectExamFragment(ExamFragment examFragment) {
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public void injectLoginFragment(LoginFragment loginFragment) {
        }

        @Override
        public void injectMoreFragment(MoreFragment moreFragment) {
        }

        @Override
        public void injectOrgFragment(OrgFragment orgFragment) {
        }

        @Override
        public void injectSignUpFragment(SignUpFragment signUpFragment) {
        }

        @Override
        public void injectStandByFragment(StandByFragment standByFragment) {
        }

        @Override
        public void injectCategoryFragment(CategoryFragment categoryFragment) {
        }

        @Override
        public void injectExamTestFragment(ExamTestFragment examTestFragment) {
        }

        @Override
        public void injectTestQuestionFragment(TestQuestionFragment testQuestionFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
      private volatile Provider<ExamViewModel> examViewModelProvider;

      private volatile Provider<HomeViewModel> homeViewModelProvider;

      private volatile Provider<LoginViewModel> loginViewModelProvider;

      private volatile Provider<MoreViewModel> moreViewModelProvider;

      private volatile Provider<OrgViewModel> orgViewModelProvider;

      private volatile Provider<SignUpViewModel> signUpViewModelProvider;

      private volatile Provider<StandByViewModel> standByViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private ExamRepository examRepository() {
        return new ExamRepository(DaggerMainApplication_HiltComponents_SingletonC.this.inExamInfoDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inQuestionDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inDataDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inAnswerDao(), DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private ExamViewModel examViewModel() {
        return new ExamViewModel(examRepository());
      }

      private Provider<ExamViewModel> examViewModelProvider() {
        Object local = examViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          examViewModelProvider = (Provider<ExamViewModel>) local;
        }
        return (Provider<ExamViewModel>) local;
      }

      private HomeRepository homeRepository() {
        return new HomeRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private HomeViewModel homeViewModel() {
        return new HomeViewModel(homeRepository());
      }

      private Provider<HomeViewModel> homeViewModelProvider() {
        Object local = homeViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          homeViewModelProvider = (Provider<HomeViewModel>) local;
        }
        return (Provider<HomeViewModel>) local;
      }

      private LoginRepository loginRepository() {
        return new LoginRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private LoginViewModel loginViewModel() {
        return new LoginViewModel(loginRepository());
      }

      private Provider<LoginViewModel> loginViewModelProvider() {
        Object local = loginViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          loginViewModelProvider = (Provider<LoginViewModel>) local;
        }
        return (Provider<LoginViewModel>) local;
      }

      private MoreRepository moreRepository() {
        return new MoreRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private MoreViewModel moreViewModel() {
        return new MoreViewModel(moreRepository());
      }

      private Provider<MoreViewModel> moreViewModelProvider() {
        Object local = moreViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          moreViewModelProvider = (Provider<MoreViewModel>) local;
        }
        return (Provider<MoreViewModel>) local;
      }

      private OrgRepository orgRepository() {
        return new OrgRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private OrgViewModel orgViewModel() {
        return new OrgViewModel(orgRepository());
      }

      private Provider<OrgViewModel> orgViewModelProvider() {
        Object local = orgViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          orgViewModelProvider = (Provider<OrgViewModel>) local;
        }
        return (Provider<OrgViewModel>) local;
      }

      private SignUpRepository signUpRepository() {
        return new SignUpRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService());
      }

      private SignUpViewModel signUpViewModel() {
        return new SignUpViewModel(signUpRepository());
      }

      private Provider<SignUpViewModel> signUpViewModelProvider() {
        Object local = signUpViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          signUpViewModelProvider = (Provider<SignUpViewModel>) local;
        }
        return (Provider<SignUpViewModel>) local;
      }

      private StandByRepository standByRepository() {
        return new StandByRepository(DaggerMainApplication_HiltComponents_SingletonC.this.ubtService(), DaggerMainApplication_HiltComponents_SingletonC.this.inExamInfoDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inAnswerDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inDataDao(), DaggerMainApplication_HiltComponents_SingletonC.this.inQuestionDao());
      }

      private StandByViewModel standByViewModel() {
        return new StandByViewModel(standByRepository());
      }

      private Provider<StandByViewModel> standByViewModelProvider() {
        Object local = standByViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          standByViewModelProvider = (Provider<StandByViewModel>) local;
        }
        return (Provider<StandByViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(7).put("com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel", (Provider) examViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel", (Provider) homeViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.LoginViewModel", (Provider) loginViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.MoreViewModel", (Provider) moreViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.OrgViewModel", (Provider) orgViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.SignUpViewModel", (Provider) signUpViewModelProvider()).put("com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel", (Provider) standByViewModelProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.nsdevil.ubtmobilev3.viewmodels.ExamViewModel 
            return (T) ViewModelCImpl.this.examViewModel();

            case 1: // com.nsdevil.ubtmobilev3.viewmodels.HomeViewModel 
            return (T) ViewModelCImpl.this.homeViewModel();

            case 2: // com.nsdevil.ubtmobilev3.viewmodels.LoginViewModel 
            return (T) ViewModelCImpl.this.loginViewModel();

            case 3: // com.nsdevil.ubtmobilev3.viewmodels.MoreViewModel 
            return (T) ViewModelCImpl.this.moreViewModel();

            case 4: // com.nsdevil.ubtmobilev3.viewmodels.OrgViewModel 
            return (T) ViewModelCImpl.this.orgViewModel();

            case 5: // com.nsdevil.ubtmobilev3.viewmodels.SignUpViewModel 
            return (T) ViewModelCImpl.this.signUpViewModel();

            case 6: // com.nsdevil.ubtmobilev3.viewmodels.StandByViewModel 
            return (T) ViewModelCImpl.this.standByViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
