package com.nsdevil.ubtmobilev3.data.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InExamInfoDao_Impl implements InExamInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InExamInfo> __insertionAdapterOfInExamInfo;

  private final SharedSQLiteStatement __preparedStmtOfUpdateRemainTime;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubmitCheck;

  private final SharedSQLiteStatement __preparedStmtOfUpdateRetakeInfo;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAddTime;

  public InExamInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInExamInfo = new EntityInsertionAdapter<InExamInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `InExamInfo` (`examId`,`examCode`,`examName`,`totalTime`,`remainTime`,`submissionYN`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InExamInfo value) {
        stmt.bindLong(1, value.getExamId());
        if (value.getExamCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExamCode());
        }
        if (value.getExamName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExamName());
        }
        stmt.bindLong(4, value.getTotalTime());
        stmt.bindLong(5, value.getRemainTime());
        final int _tmp;
        _tmp = value.getSubmissionYN() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__preparedStmtOfUpdateRemainTime = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InExamInfo SET remainTime = CASE WHEN remainTime <= 0 THEN 0 ELSE remainTime - 1 END WHERE examCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubmitCheck = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InExamInfo SET submissionYN = 1 WHERE examCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateRetakeInfo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InExamInfo SET submissionYN = 0 AND remainTime = totalTime WHERE examCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAddTime = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InExamInfo SET remainTime = remainTime + ? WHERE examCode = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertExamInfo(final InExamInfo examInfo, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInExamInfo.insert(examInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateRemainTime(final String examCode, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateRemainTime.acquire();
        int _argIndex = 1;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateRemainTime.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object updateSubmitCheck(final String examCode, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubmitCheck.acquire();
        int _argIndex = 1;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateSubmitCheck.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object updateRetakeInfo(final String examCode, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateRetakeInfo.acquire();
        int _argIndex = 1;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateRetakeInfo.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object updateAddTime(final String examCode, final int addTime,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAddTime.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, addTime);
        _argIndex = 2;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateAddTime.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Flow<Integer> getRemainTime(final String examCode) {
    final String _sql = "SELECT remainTime FROM InExamInfo WHERE examCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InExamInfo"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getExamInfo(final String examCode, final Continuation<? super InExamInfo> p1) {
    final String _sql = "SELECT * FROM InExamInfo WHERE examCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<InExamInfo>() {
      @Override
      public InExamInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExamId = CursorUtil.getColumnIndexOrThrow(_cursor, "examId");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamName = CursorUtil.getColumnIndexOrThrow(_cursor, "examName");
          final int _cursorIndexOfTotalTime = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTime");
          final int _cursorIndexOfRemainTime = CursorUtil.getColumnIndexOrThrow(_cursor, "remainTime");
          final int _cursorIndexOfSubmissionYN = CursorUtil.getColumnIndexOrThrow(_cursor, "submissionYN");
          final InExamInfo _result;
          if(_cursor.moveToFirst()) {
            final int _tmpExamId;
            _tmpExamId = _cursor.getInt(_cursorIndexOfExamId);
            final String _tmpExamCode;
            if (_cursor.isNull(_cursorIndexOfExamCode)) {
              _tmpExamCode = null;
            } else {
              _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            }
            final String _tmpExamName;
            if (_cursor.isNull(_cursorIndexOfExamName)) {
              _tmpExamName = null;
            } else {
              _tmpExamName = _cursor.getString(_cursorIndexOfExamName);
            }
            final int _tmpTotalTime;
            _tmpTotalTime = _cursor.getInt(_cursorIndexOfTotalTime);
            final int _tmpRemainTime;
            _tmpRemainTime = _cursor.getInt(_cursorIndexOfRemainTime);
            final boolean _tmpSubmissionYN;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSubmissionYN);
            _tmpSubmissionYN = _tmp != 0;
            _result = new InExamInfo(_tmpExamId,_tmpExamCode,_tmpExamName,_tmpTotalTime,_tmpRemainTime,_tmpSubmissionYN);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
