package com.nsdevil.ubtmobilev3.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.nsdevil.ubtmobilev3.data.response.QuestionResponse;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InDataDao_Impl implements InDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InData> __insertionAdapterOfInData;

  private final Converters __converters = new Converters();

  public InDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInData = new EntityInsertionAdapter<InData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `InData` (`dataOrder`,`dataText`,`dataType`,`id`,`viewOrder`,`examCode`,`media`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InData value) {
        if (value.getDataOrder() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getDataOrder());
        }
        if (value.getDataText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDataText());
        }
        if (value.getDataType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDataType());
        }
        stmt.bindLong(4, value.getId());
        stmt.bindLong(5, value.getViewOrder());
        if (value.getExamCode() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExamCode());
        }
        final String _tmp;
        _tmp = __converters.mediaToJsonString(value.getMedia());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
      }
    };
  }

  @Override
  public Object insertData(final List<InData> answerList, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInData.insert(answerList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<InData>> getDataList(final String examCode, final int index) {
    final String _sql = "SELECT * FROM InData WHERE examCode = ? AND viewOrder = ?+1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, index);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InData"}, new Callable<List<InData>>() {
      @Override
      public List<InData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDataOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "dataOrder");
          final int _cursorIndexOfDataText = CursorUtil.getColumnIndexOrThrow(_cursor, "dataText");
          final int _cursorIndexOfDataType = CursorUtil.getColumnIndexOrThrow(_cursor, "dataType");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfMedia = CursorUtil.getColumnIndexOrThrow(_cursor, "media");
          final List<InData> _result = new ArrayList<InData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InData _item;
            final Integer _tmpDataOrder;
            if (_cursor.isNull(_cursorIndexOfDataOrder)) {
              _tmpDataOrder = null;
            } else {
              _tmpDataOrder = _cursor.getInt(_cursorIndexOfDataOrder);
            }
            final String _tmpDataText;
            _tmpDataText = _cursor.getString(_cursorIndexOfDataText);
            final String _tmpDataType;
            _tmpDataType = _cursor.getString(_cursorIndexOfDataType);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final QuestionResponse.Result.Question.Data.MediaX _tmpMedia;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfMedia);
            _tmpMedia = __converters.stringToMedia(_tmp);
            _item = new InData(_tmpDataOrder,_tmpDataText,_tmpDataType,_tmpId,_tmpViewOrder,_tmpExamCode,_tmpMedia);
            _result.add(_item);
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
  public Object getMediaList(final String examCode,
      final Continuation<? super List<QuestionResponse.Result.Question.Data.MediaX>> p1) {
    final String _sql = "SELECT media FROM InData WHERE examCode = ? AND media IS NOT NULL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<QuestionResponse.Result.Question.Data.MediaX>>() {
      @Override
      public List<QuestionResponse.Result.Question.Data.MediaX> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<QuestionResponse.Result.Question.Data.MediaX> _result = new ArrayList<QuestionResponse.Result.Question.Data.MediaX>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final QuestionResponse.Result.Question.Data.MediaX _item;
            final String _tmp;
            _tmp = _cursor.getString(0);
            _item = __converters.stringToMedia(_tmp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
