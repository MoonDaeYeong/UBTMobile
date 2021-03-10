package com.nsdevil.ubtmobilev3.data.db;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.nsdevil.ubtmobilev3.data.model.QuestionAnswer;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InQuestionDao_Impl implements InQuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InQuestion> __insertionAdapterOfInQuestion;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUserCheck;

  public InQuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInQuestion = new EntityInsertionAdapter<InQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `InQuestion` (`category`,`question`,`headerText`,`difficultyLevel`,`answerType`,`userAnswers`,`checkCount`,`controlNo`,`point`,`viewOrder`,`id`,`correctRate`,`questionType`,`incorrectNote`,`option`,`time`,`userCheck`,`examCode`,`examQACode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InQuestion value) {
        if (value.getCategory() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategory());
        }
        if (value.getQuestion() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuestion());
        }
        if (value.getHeaderText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHeaderText());
        }
        if (value.getDifficultyLevel() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDifficultyLevel());
        }
        if (value.getAnswerType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAnswerType());
        }
        if (value.getUserAnswers() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUserAnswers());
        }
        stmt.bindLong(7, value.getCheckCount());
        if (value.getControlNo() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getControlNo());
        }
        stmt.bindDouble(9, value.getPoint());
        stmt.bindLong(10, value.getViewOrder());
        stmt.bindLong(11, value.getId());
        if (value.getCorrectRate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCorrectRate());
        }
        if (value.getQuestionType() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getQuestionType());
        }
        if (value.getIncorrectNote() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getIncorrectNote());
        }
        if (value.getOption() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getOption());
        }
        stmt.bindLong(16, value.getTime());
        final int _tmp;
        _tmp = value.getUserCheck() ? 1 : 0;
        stmt.bindLong(17, _tmp);
        if (value.getExamCode() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getExamCode());
        }
        if (value.getExamQACode() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getExamQACode());
        }
      }
    };
    this.__preparedStmtOfUpdateUserCheck = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE InQuestion SET userCheck = CASE WHEN userCheck = 0 THEN 1 ELSE userCheck = 0 END WHERE examCode = ? AND viewOrder = ?+1";
        return _query;
      }
    };
  }

  @Override
  public void insertQuestion(final List<InQuestion> inQuestionList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfInQuestion.insert(inQuestionList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object updateUserCheck(final String examCode, final int index,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUserCheck.acquire();
        int _argIndex = 1;
        if (examCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, examCode);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, index);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateUserCheck.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Flow<List<InQuestion>> getWholeList(final String examCode) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<List<InQuestion>>() {
      @Override
      public List<InQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final List<InQuestion> _result = new ArrayList<InQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InQuestion _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpQuestion;
            _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
            final String _tmpHeaderText;
            _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
            final String _tmpDifficultyLevel;
            _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
            final String _tmpAnswerType;
            _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
            final String _tmpUserAnswers;
            _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
            final int _tmpCheckCount;
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
            final String _tmpControlNo;
            _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
            final float _tmpPoint;
            _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCorrectRate;
            _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
            final String _tmpQuestionType;
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
            final String _tmpIncorrectNote;
            _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
            final String _tmpOption;
            _tmpOption = _cursor.getString(_cursorIndexOfOption);
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            final boolean _tmpUserCheck;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
            _tmpUserCheck = _tmp != 0;
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final String _tmpExamQACode;
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
            _item = new InQuestion(_tmpCategory,_tmpQuestion,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
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
  public Flow<List<InQuestion>> getCompletedList(final String examCode) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ? AND userAnswers IS NOT NULL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<List<InQuestion>>() {
      @Override
      public List<InQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final List<InQuestion> _result = new ArrayList<InQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InQuestion _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpQuestion;
            _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
            final String _tmpHeaderText;
            _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
            final String _tmpDifficultyLevel;
            _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
            final String _tmpAnswerType;
            _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
            final String _tmpUserAnswers;
            _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
            final int _tmpCheckCount;
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
            final String _tmpControlNo;
            _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
            final float _tmpPoint;
            _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCorrectRate;
            _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
            final String _tmpQuestionType;
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
            final String _tmpIncorrectNote;
            _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
            final String _tmpOption;
            _tmpOption = _cursor.getString(_cursorIndexOfOption);
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            final boolean _tmpUserCheck;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
            _tmpUserCheck = _tmp != 0;
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final String _tmpExamQACode;
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
            _item = new InQuestion(_tmpCategory,_tmpQuestion,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
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
  public Flow<List<InQuestion>> getUnCompletedList(final String examCode) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ? AND userAnswers IS NULL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<List<InQuestion>>() {
      @Override
      public List<InQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final List<InQuestion> _result = new ArrayList<InQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InQuestion _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpQuestion;
            _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
            final String _tmpHeaderText;
            _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
            final String _tmpDifficultyLevel;
            _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
            final String _tmpAnswerType;
            _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
            final String _tmpUserAnswers;
            _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
            final int _tmpCheckCount;
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
            final String _tmpControlNo;
            _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
            final float _tmpPoint;
            _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCorrectRate;
            _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
            final String _tmpQuestionType;
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
            final String _tmpIncorrectNote;
            _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
            final String _tmpOption;
            _tmpOption = _cursor.getString(_cursorIndexOfOption);
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            final boolean _tmpUserCheck;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
            _tmpUserCheck = _tmp != 0;
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final String _tmpExamQACode;
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
            _item = new InQuestion(_tmpCategory,_tmpQuestion,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
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
  public Flow<List<InQuestion>> getCheckList(final String examCode) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ? AND userCheck = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<List<InQuestion>>() {
      @Override
      public List<InQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final List<InQuestion> _result = new ArrayList<InQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InQuestion _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpQuestion;
            _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
            final String _tmpHeaderText;
            _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
            final String _tmpDifficultyLevel;
            _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
            final String _tmpAnswerType;
            _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
            final String _tmpUserAnswers;
            _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
            final int _tmpCheckCount;
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
            final String _tmpControlNo;
            _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
            final float _tmpPoint;
            _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
            final int _tmpViewOrder;
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCorrectRate;
            _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
            final String _tmpQuestionType;
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
            final String _tmpIncorrectNote;
            _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
            final String _tmpOption;
            _tmpOption = _cursor.getString(_cursorIndexOfOption);
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            final boolean _tmpUserCheck;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
            _tmpUserCheck = _tmp != 0;
            final String _tmpExamCode;
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
            final String _tmpExamQACode;
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
            _item = new InQuestion(_tmpCategory,_tmpQuestion,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
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
  public Flow<QuestionAnswer> getQuestionAnswer(final String examCode, final int index) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ? AND viewOrder = ?+1 AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, index);
    _argIndex = 3;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InAnswer","InQuestion"}, new Callable<QuestionAnswer>() {
      @Override
      public QuestionAnswer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final ArrayMap<String, ArrayList<InAnswer>> _collectionAnswersList = new ArrayMap<String, ArrayList<InAnswer>>();
          while (_cursor.moveToNext()) {
            final String _tmpKey = _cursor.getString(_cursorIndexOfExamQACode);
            ArrayList<InAnswer> _tmpAnswersListCollection = _collectionAnswersList.get(_tmpKey);
            if (_tmpAnswersListCollection == null) {
              _tmpAnswersListCollection = new ArrayList<InAnswer>();
              _collectionAnswersList.put(_tmpKey, _tmpAnswersListCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipInAnswerAscomNsdevilUbtmobilev3DataDbInAnswer(_collectionAnswersList);
          final QuestionAnswer _result;
          if(_cursor.moveToFirst()) {
            final InQuestion _tmpQuestion;
            if (! (_cursor.isNull(_cursorIndexOfCategory) && _cursor.isNull(_cursorIndexOfQuestion) && _cursor.isNull(_cursorIndexOfHeaderText) && _cursor.isNull(_cursorIndexOfDifficultyLevel) && _cursor.isNull(_cursorIndexOfAnswerType) && _cursor.isNull(_cursorIndexOfUserAnswers) && _cursor.isNull(_cursorIndexOfCheckCount) && _cursor.isNull(_cursorIndexOfControlNo) && _cursor.isNull(_cursorIndexOfPoint) && _cursor.isNull(_cursorIndexOfViewOrder) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCorrectRate) && _cursor.isNull(_cursorIndexOfQuestionType) && _cursor.isNull(_cursorIndexOfIncorrectNote) && _cursor.isNull(_cursorIndexOfOption) && _cursor.isNull(_cursorIndexOfTime) && _cursor.isNull(_cursorIndexOfUserCheck) && _cursor.isNull(_cursorIndexOfExamCode) && _cursor.isNull(_cursorIndexOfExamQACode))) {
              final String _tmpCategory;
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
              final String _tmpQuestion_1;
              _tmpQuestion_1 = _cursor.getString(_cursorIndexOfQuestion);
              final String _tmpHeaderText;
              _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
              final String _tmpDifficultyLevel;
              _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
              final String _tmpAnswerType;
              _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
              final String _tmpUserAnswers;
              _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
              final int _tmpCheckCount;
              _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
              final String _tmpControlNo;
              _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
              final float _tmpPoint;
              _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
              final int _tmpViewOrder;
              _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final String _tmpCorrectRate;
              _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
              final String _tmpQuestionType;
              _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
              final String _tmpIncorrectNote;
              _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
              final String _tmpOption;
              _tmpOption = _cursor.getString(_cursorIndexOfOption);
              final int _tmpTime;
              _tmpTime = _cursor.getInt(_cursorIndexOfTime);
              final boolean _tmpUserCheck;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
              _tmpUserCheck = _tmp != 0;
              final String _tmpExamCode;
              _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
              final String _tmpExamQACode;
              _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
              _tmpQuestion = new InQuestion(_tmpCategory,_tmpQuestion_1,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
            }  else  {
              _tmpQuestion = null;
            }
            ArrayList<InAnswer> _tmpAnswersListCollection_1 = null;
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfExamQACode);
            _tmpAnswersListCollection_1 = _collectionAnswersList.get(_tmpKey_1);
            if (_tmpAnswersListCollection_1 == null) {
              _tmpAnswersListCollection_1 = new ArrayList<InAnswer>();
            }
            _result = new QuestionAnswer(_tmpQuestion,_tmpAnswersListCollection_1);
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
  public Object getQuestionAnswerList(final String examCode,
      final Continuation<? super List<QuestionAnswer>> p1) {
    final String _sql = "SELECT * FROM InQuestion WHERE examCode = ? AND examQACode IN (SELECT examQACode FROM InAnswer AS A WHERE A.examCode = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    _argIndex = 2;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<QuestionAnswer>>() {
      @Override
      public List<QuestionAnswer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfHeaderText = CursorUtil.getColumnIndexOrThrow(_cursor, "headerText");
          final int _cursorIndexOfDifficultyLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "difficultyLevel");
          final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndexOrThrow(_cursor, "answerType");
          final int _cursorIndexOfUserAnswers = CursorUtil.getColumnIndexOrThrow(_cursor, "userAnswers");
          final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCount");
          final int _cursorIndexOfControlNo = CursorUtil.getColumnIndexOrThrow(_cursor, "controlNo");
          final int _cursorIndexOfPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "point");
          final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "viewOrder");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCorrectRate = CursorUtil.getColumnIndexOrThrow(_cursor, "correctRate");
          final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndexOrThrow(_cursor, "questionType");
          final int _cursorIndexOfIncorrectNote = CursorUtil.getColumnIndexOrThrow(_cursor, "incorrectNote");
          final int _cursorIndexOfOption = CursorUtil.getColumnIndexOrThrow(_cursor, "option");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfUserCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "userCheck");
          final int _cursorIndexOfExamCode = CursorUtil.getColumnIndexOrThrow(_cursor, "examCode");
          final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndexOrThrow(_cursor, "examQACode");
          final ArrayMap<String, ArrayList<InAnswer>> _collectionAnswersList = new ArrayMap<String, ArrayList<InAnswer>>();
          while (_cursor.moveToNext()) {
            final String _tmpKey = _cursor.getString(_cursorIndexOfExamQACode);
            ArrayList<InAnswer> _tmpAnswersListCollection = _collectionAnswersList.get(_tmpKey);
            if (_tmpAnswersListCollection == null) {
              _tmpAnswersListCollection = new ArrayList<InAnswer>();
              _collectionAnswersList.put(_tmpKey, _tmpAnswersListCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipInAnswerAscomNsdevilUbtmobilev3DataDbInAnswer(_collectionAnswersList);
          final List<QuestionAnswer> _result = new ArrayList<QuestionAnswer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final QuestionAnswer _item;
            final InQuestion _tmpQuestion;
            if (! (_cursor.isNull(_cursorIndexOfCategory) && _cursor.isNull(_cursorIndexOfQuestion) && _cursor.isNull(_cursorIndexOfHeaderText) && _cursor.isNull(_cursorIndexOfDifficultyLevel) && _cursor.isNull(_cursorIndexOfAnswerType) && _cursor.isNull(_cursorIndexOfUserAnswers) && _cursor.isNull(_cursorIndexOfCheckCount) && _cursor.isNull(_cursorIndexOfControlNo) && _cursor.isNull(_cursorIndexOfPoint) && _cursor.isNull(_cursorIndexOfViewOrder) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfCorrectRate) && _cursor.isNull(_cursorIndexOfQuestionType) && _cursor.isNull(_cursorIndexOfIncorrectNote) && _cursor.isNull(_cursorIndexOfOption) && _cursor.isNull(_cursorIndexOfTime) && _cursor.isNull(_cursorIndexOfUserCheck) && _cursor.isNull(_cursorIndexOfExamCode) && _cursor.isNull(_cursorIndexOfExamQACode))) {
              final String _tmpCategory;
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
              final String _tmpQuestion_1;
              _tmpQuestion_1 = _cursor.getString(_cursorIndexOfQuestion);
              final String _tmpHeaderText;
              _tmpHeaderText = _cursor.getString(_cursorIndexOfHeaderText);
              final String _tmpDifficultyLevel;
              _tmpDifficultyLevel = _cursor.getString(_cursorIndexOfDifficultyLevel);
              final String _tmpAnswerType;
              _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
              final String _tmpUserAnswers;
              _tmpUserAnswers = _cursor.getString(_cursorIndexOfUserAnswers);
              final int _tmpCheckCount;
              _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
              final String _tmpControlNo;
              _tmpControlNo = _cursor.getString(_cursorIndexOfControlNo);
              final float _tmpPoint;
              _tmpPoint = _cursor.getFloat(_cursorIndexOfPoint);
              final int _tmpViewOrder;
              _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final String _tmpCorrectRate;
              _tmpCorrectRate = _cursor.getString(_cursorIndexOfCorrectRate);
              final String _tmpQuestionType;
              _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
              final String _tmpIncorrectNote;
              _tmpIncorrectNote = _cursor.getString(_cursorIndexOfIncorrectNote);
              final String _tmpOption;
              _tmpOption = _cursor.getString(_cursorIndexOfOption);
              final int _tmpTime;
              _tmpTime = _cursor.getInt(_cursorIndexOfTime);
              final boolean _tmpUserCheck;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfUserCheck);
              _tmpUserCheck = _tmp != 0;
              final String _tmpExamCode;
              _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
              final String _tmpExamQACode;
              _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
              _tmpQuestion = new InQuestion(_tmpCategory,_tmpQuestion_1,_tmpHeaderText,_tmpDifficultyLevel,_tmpAnswerType,_tmpUserAnswers,_tmpCheckCount,_tmpControlNo,_tmpPoint,_tmpViewOrder,_tmpId,_tmpCorrectRate,_tmpQuestionType,_tmpIncorrectNote,_tmpOption,_tmpTime,_tmpUserCheck,_tmpExamCode,_tmpExamQACode);
            }  else  {
              _tmpQuestion = null;
            }
            ArrayList<InAnswer> _tmpAnswersListCollection_1 = null;
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfExamQACode);
            _tmpAnswersListCollection_1 = _collectionAnswersList.get(_tmpKey_1);
            if (_tmpAnswersListCollection_1 == null) {
              _tmpAnswersListCollection_1 = new ArrayList<InAnswer>();
            }
            _item = new QuestionAnswer(_tmpQuestion,_tmpAnswersListCollection_1);
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

  @Override
  public Flow<Integer> getTotalCount(final String examCode) {
    final String _sql = "SELECT COUNT(id) FROM InQuestion WHERE examCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
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
  public Flow<Integer> getRemainCount(final String examCode) {
    final String _sql = "SELECT COUNT(id) FROM InQuestion WHERE examCode = ? AND userAnswers IS NULL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (examCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, examCode);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"InQuestion"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
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

  private void __fetchRelationshipInAnswerAscomNsdevilUbtmobilev3DataDbInAnswer(
      final ArrayMap<String, ArrayList<InAnswer>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<InAnswer>> _tmpInnerMap = new ArrayMap<String, ArrayList<InAnswer>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipInAnswerAscomNsdevilUbtmobilev3DataDbInAnswer(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<InAnswer>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipInAnswerAscomNsdevilUbtmobilev3DataDbInAnswer(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `answerFlag`,`answerTrueData`,`answer`,`optionNumber`,`questionType`,`id`,`order`,`answerType`,`checkCount`,`questionId`,`examCode`,`viewOrder`,`userChk`,`textAnswer`,`fileName`,`mediaType`,`examQACode` FROM `InAnswer` WHERE `examQACode` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "examQACode");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfAnswerFlag = CursorUtil.getColumnIndex(_cursor, "answerFlag");
      final int _cursorIndexOfAnswerTrueData = CursorUtil.getColumnIndex(_cursor, "answerTrueData");
      final int _cursorIndexOfAnswer = CursorUtil.getColumnIndex(_cursor, "answer");
      final int _cursorIndexOfOptionNumber = CursorUtil.getColumnIndex(_cursor, "optionNumber");
      final int _cursorIndexOfQuestionType = CursorUtil.getColumnIndex(_cursor, "questionType");
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndex(_cursor, "order");
      final int _cursorIndexOfAnswerType = CursorUtil.getColumnIndex(_cursor, "answerType");
      final int _cursorIndexOfCheckCount = CursorUtil.getColumnIndex(_cursor, "checkCount");
      final int _cursorIndexOfQuestionId = CursorUtil.getColumnIndex(_cursor, "questionId");
      final int _cursorIndexOfExamCode = CursorUtil.getColumnIndex(_cursor, "examCode");
      final int _cursorIndexOfViewOrder = CursorUtil.getColumnIndex(_cursor, "viewOrder");
      final int _cursorIndexOfUserChk = CursorUtil.getColumnIndex(_cursor, "userChk");
      final int _cursorIndexOfTextAnswer = CursorUtil.getColumnIndex(_cursor, "textAnswer");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndex(_cursor, "fileName");
      final int _cursorIndexOfMediaType = CursorUtil.getColumnIndex(_cursor, "mediaType");
      final int _cursorIndexOfExamQACode = CursorUtil.getColumnIndex(_cursor, "examQACode");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<InAnswer> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final InAnswer _item_1;
          final String _tmpAnswerFlag;
          if (_cursorIndexOfAnswerFlag == -1) {
            _tmpAnswerFlag = null;
          } else {
            _tmpAnswerFlag = _cursor.getString(_cursorIndexOfAnswerFlag);
          }
          final String _tmpAnswerTrueData;
          if (_cursorIndexOfAnswerTrueData == -1) {
            _tmpAnswerTrueData = null;
          } else {
            _tmpAnswerTrueData = _cursor.getString(_cursorIndexOfAnswerTrueData);
          }
          final String _tmpAnswer;
          if (_cursorIndexOfAnswer == -1) {
            _tmpAnswer = null;
          } else {
            _tmpAnswer = _cursor.getString(_cursorIndexOfAnswer);
          }
          final String _tmpOptionNumber;
          if (_cursorIndexOfOptionNumber == -1) {
            _tmpOptionNumber = null;
          } else {
            _tmpOptionNumber = _cursor.getString(_cursorIndexOfOptionNumber);
          }
          final String _tmpQuestionType;
          if (_cursorIndexOfQuestionType == -1) {
            _tmpQuestionType = null;
          } else {
            _tmpQuestionType = _cursor.getString(_cursorIndexOfQuestionType);
          }
          final int _tmpId;
          if (_cursorIndexOfId == -1) {
            _tmpId = 0;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          final int _tmpOrder;
          if (_cursorIndexOfOrder == -1) {
            _tmpOrder = 0;
          } else {
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
          }
          final String _tmpAnswerType;
          if (_cursorIndexOfAnswerType == -1) {
            _tmpAnswerType = null;
          } else {
            _tmpAnswerType = _cursor.getString(_cursorIndexOfAnswerType);
          }
          final int _tmpCheckCount;
          if (_cursorIndexOfCheckCount == -1) {
            _tmpCheckCount = 0;
          } else {
            _tmpCheckCount = _cursor.getInt(_cursorIndexOfCheckCount);
          }
          final int _tmpQuestionId;
          if (_cursorIndexOfQuestionId == -1) {
            _tmpQuestionId = 0;
          } else {
            _tmpQuestionId = _cursor.getInt(_cursorIndexOfQuestionId);
          }
          final String _tmpExamCode;
          if (_cursorIndexOfExamCode == -1) {
            _tmpExamCode = null;
          } else {
            _tmpExamCode = _cursor.getString(_cursorIndexOfExamCode);
          }
          final int _tmpViewOrder;
          if (_cursorIndexOfViewOrder == -1) {
            _tmpViewOrder = 0;
          } else {
            _tmpViewOrder = _cursor.getInt(_cursorIndexOfViewOrder);
          }
          final boolean _tmpUserChk;
          if (_cursorIndexOfUserChk == -1) {
            _tmpUserChk = false;
          } else {
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfUserChk);
            _tmpUserChk = _tmp != 0;
          }
          final String _tmpTextAnswer;
          if (_cursorIndexOfTextAnswer == -1) {
            _tmpTextAnswer = null;
          } else {
            _tmpTextAnswer = _cursor.getString(_cursorIndexOfTextAnswer);
          }
          final String _tmpFileName;
          if (_cursorIndexOfFileName == -1) {
            _tmpFileName = null;
          } else {
            _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
          }
          final String _tmpMediaType;
          if (_cursorIndexOfMediaType == -1) {
            _tmpMediaType = null;
          } else {
            _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
          }
          final String _tmpExamQACode;
          if (_cursorIndexOfExamQACode == -1) {
            _tmpExamQACode = null;
          } else {
            _tmpExamQACode = _cursor.getString(_cursorIndexOfExamQACode);
          }
          _item_1 = new InAnswer(_tmpAnswerFlag,_tmpAnswerTrueData,_tmpAnswer,_tmpOptionNumber,_tmpQuestionType,_tmpId,_tmpOrder,_tmpAnswerType,_tmpCheckCount,_tmpQuestionId,_tmpExamCode,_tmpViewOrder,_tmpUserChk,_tmpTextAnswer,_tmpFileName,_tmpMediaType,_tmpExamQACode);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
