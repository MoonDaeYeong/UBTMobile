// Generated by Dagger (https://dagger.dev).
package com.nsdevil.ubtmobilev3.viewmodels;

import com.nsdevil.ubtmobilev3.data.repository.ExamRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ExamViewModel_Factory implements Factory<ExamViewModel> {
  private final Provider<ExamRepository> repositoryProvider;

  public ExamViewModel_Factory(Provider<ExamRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ExamViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ExamViewModel_Factory create(Provider<ExamRepository> repositoryProvider) {
    return new ExamViewModel_Factory(repositoryProvider);
  }

  public static ExamViewModel newInstance(ExamRepository repository) {
    return new ExamViewModel(repository);
  }
}
