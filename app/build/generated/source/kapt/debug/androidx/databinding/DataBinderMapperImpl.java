package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.nsdevil.ubtmobilev3.DataBinderMapperImpl());
  }
}
