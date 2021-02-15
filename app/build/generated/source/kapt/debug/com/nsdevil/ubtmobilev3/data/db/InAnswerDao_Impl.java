package com.nsdevil.ubtmobilev3.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InAnswerDao_Impl implements InAnswerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InAnswer> __insertionAdapterOfInAnswer;

  private final EntityDeletionOrUpdateAdapter<InAnswer> __updateAdapterOfInAnswer;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQuestionUserAnswer;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQuestionTime;

  public InAnswerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInAnswer = new EntityInsertionAdapter<InAnswer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `InAnswer` (`answerFlag`,`answerTrueData`,`answer`,`optionNumber`,`questionType`,`id`,`order`,`checkCount`,`questionId`,`examCode`,`viewOrder`,`userChk`,`textAnswer`,`fileName`,`mediaType`,`examQACode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InAnswer value) {
        if (value.getAnswerFlag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAnswerFlag());
        }
        if (value.getAnswerTrueData() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAnswerTrueData());
        }
        if (value.getAnswer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAnswer());
        }
        if (value.getOptionNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOptionNumber());
        }
        if (value.getQuestionType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getQuestionType());
        }
        stmt.bindLong(6, value.getId());
        stmt.bindLong(7, value.getOrder());
        stmt.bindLong(8, value.getCheckCount());
        stmt.bindLong(9, value.getQuestionId());
        if (value.getExamCode() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getExamCode());
        }
        stmt.bindLong(11, value.getViewOrder());
        final int _tmp;
        _tmp = value.getUserChk() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getTextAnswer() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTextAnswer());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getFileName());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getMediaType());
        }
        if (value.getExamQACode() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getExamQACode());
        }
      }
    };
    this.__updateAdapterOfInAnswer = new EntityDeletionOrUpdateAdapter<InAnswer>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `InAnswer` SET `answerFlag` = ?,`answerTrueData` = ?,`answer` = ?,`optionNumber` = ?,`questionType` = ?,`id` = ?,`order` = ?,`checkCount` = ?,`questionId` = ?,`examCode` = ?,`viewOrder` = ?,`userChk` = ?,`textAnswer` = ?,`fileName` = ?,`mediaType` = ?,`examQACode` = ? WHERE `id` = ? AND `examCode` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InAnswer value) {
        if (value.getAnswerFlag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAnswerFlag());
        }
        if (value.getAnswerTrueData() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAnswerTrueData());
        }
        if (value.getAnswer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAnswer());
        }
        if (value.getOptionNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOptionNumber());
        }
        if (value.getQuestionType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getQuestionType());
        }
        stmt.bindLong(6, value.getId());
        stmt.bindLong(7, value.getOrder());
        stmt.bindLong(8, value.getCheckCount());
        stmt.bindLong(9, value.getQuestionId());
        if (value.getExamCode() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getExamCode());
        }
        stmt.bindLong(11, value.getViewOrder());
        final int _tmp;
        _tmp = value.getUserChk() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getTextAnswer() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTextAnswer());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getFileName());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getMediaType());
        }
        if (value.getExamQACode() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getExamQACode());
        }
        stmt.bindLong(17, value.getId());
        if (value.getExamCode() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getExamCode());
        }
      }
    };
    this.__preparedStmtOfUpdateQuestionUserAnswer = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InQuestion SET userAnswers = ? WHERE examCode = ? AND viewOrder = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateQuestionTime = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InQuestion SET time = time + ? WHERE examCode = ? AND viewOrder = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertAnswer(final List<InAnswer> answerList, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInAnswer.insert(answerList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateAnswers(final List<InAnswer> answerList,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfInAnswer.handleMultiple(answerList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateAnswerData(final List<InAnswer> answerList, final int stayingTime,
      final Continuation<? super Boolean> p2) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Boolean>, Object>() {
      @Override
      public Object invoke(Continuation<? super Boolean> __cont) {
        return InAnswerDao.DefaultImpls.updateAnswerData(InAnswerDao_Impl.this, answerList, stayingTime, __cont);
      }
    }, p2);
  }

  @Override
  public Object updateQuestionUserAnswer(final String userAnswer, final String examCode,
      final int viewOrder, final Continuation<? super Unit> p3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQuestionUserAnswer.acquire();
        int _argIndex = 1;
        if (userAnswer == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, userAnswer);
        }
        _argIndex = 2;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        _argIndex = 3;
        _stmt.bindLong(_argIndex, viewOrder);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateQuestionUserAnswer.release(_stmt);
        }
      }
    }, p3);
  }

  @Override
  public Object updateQuestionTime(final int stayTime, final String examCode, final int viewOrder,
      final Continuation<? super Unit> p3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQuestionTime.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, stayTime);
        _argIndex = 2;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        _argIndex = 3;
        _stmt.bindLong(_argIndex, viewOrder);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateQuestionTime.release(_stmt);
        }
      }
    }, p3);
  }

  @Override
  public Object getInAnswerList(final String examCode,
      final Continuation<? super List<InAnswer>> p1) {
    final String _sql = "SELECT * FROM InAnswer WHERE examCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<InAnswer>>() {
      @Override
      public List<InAnswer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAnswerFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "answerFlag");
          final int _cursorIndexOfAnswerTrueData = CursorUtil.getColumnIndexOrThrow(_cursor, "answerTrueData");
          final int _cursorIndexOfAnswer = CursorUtil.getColumnIndexOrThrow(_cursor, "answer");
          final int _cursorIndexOfOptionNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "optionNumber");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "order");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfQuestionId = CursorUtil.getColumnIndexOrThrow(_cursor, "questionId");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfUserChk = CursorUtil.getColumnIndexOrThrow(_cursor, "userChk");
          final int _cursorIndexOfTextAnswer = CursorUtil.getColumnIndexOrThrow(_cursor, "textAnswer");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final List<InAnswer> _result = new ArrayList<InAnswer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InAnswer _item;
            final String _tmpAnswerFlag;
            _tmpAnswerFlag = _cursor.getString(_cursorIndexOfAnswerFlag);
            final String _tmpAnswerTrueData;
            _tmpAnswerTrueData = _cursor.getString(_cursorIndexOfAnswerTrueData);
            final String _tmpAnswer;
            _tmpAnswer = _cursor.getString(_cursorIndexOfAnswer);
            final String _tmpOptionNumber;
            _tmpOptionNumber = _cursor.getString(_cursorIndexOfOptionNumber);
            final String _tmpQuestionType;
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpOrder;
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
            final int _tmpCheckCount;
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
            final int _tmpQuestionId;
            _tmpQuestionId = _cursor.getInt(_cursorIndexOfQuestionId);
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final boolean _tmpUserChk;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserChk);
            _tmpUserChk = _tmp != 0;
            final String _tmpTextAnswer;
            _tmpTextAnswer = _cursor.getString(_cursorIndexOfTextAnswer);
            final String _tmpFileName;
            _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            final String _tmpMediaType;
            _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            final String _tmpExamQACode;
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
            _item = new InAnswer(_tmpAnswerFlag,_tmpAnswerTrueData,_tmpAnswer,_tmpOptionNumber,_tmpQuestionType,_tmpId,_tmpOrder,_tmpCheckCount,_tmpQuestionId,_tmpExamCode,_tmpViewOrder,_tmpUserChk,_tmpTextAnswer,_tmpFileName,_tmpMediaType,_tmpExamQACode);
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
