package com.nsdevil.ubtmobilev3.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile InAnswerDao _inAnswerDao;

  private volatile InDataDao _inDataDao;

  private volatile InExamInfoDao _inExamInfoDao;

  private volatile InQuestionDao _inQuestionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InAnswer` (`answerFlag` TEXT, `answerTrueData` TEXT, `answer` TEXT NOT NULL, `optionNumber` TEXT NOT NULL, `questionType` TEXT NOT NULL, `id` INTEGER NOT NULL, `order` INTEGER NOT NULL, `answerType` TEXT NOT NULL, `checkCount` INTEGER NOT NULL, `questionId` INTEGER NOT NULL, `examCode` TEXT NOT NULL, `viewOrder` INTEGER NOT NULL, `userChk` INTEGER NOT NULL, `textAnswer` TEXT, `fileName` TEXT, `mediaType` TEXT, `examQACode` TEXT NOT NULL, PRIMARY KEY(`id`, `examCode`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InData` (`dataOrder` INTEGER, `dataText` TEXT, `dataType` TEXT, `id` INTEGER NOT NULL, `viewOrder` INTEGER NOT NULL, `examCode` TEXT NOT NULL, `media` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InExamInfo` (`examId` INTEGER NOT NULL, `examCode` TEXT NOT NULL, `examName` TEXT NOT NULL, `totalTime` INTEGER NOT NULL, `remainTime` INTEGER NOT NULL, `submissionYN` INTEGER NOT NULL, PRIMARY KEY(`examCode`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InQuestion` (`category` TEXT, `question` TEXT NOT NULL, `headerText` TEXT NOT NULL, `difficultyLevel` TEXT NOT NULL, `answerType` TEXT NOT NULL, `userAnswers` TEXT, `checkCount` INTEGER NOT NULL, `controlNo` TEXT NOT NULL, `point` REAL NOT NULL, `viewOrder` INTEGER NOT NULL, `id` INTEGER NOT NULL, `correctRate` TEXT NOT NULL, `questionType` TEXT NOT NULL, `incorrectNote` TEXT NOT NULL, `option` TEXT, `time` INTEGER NOT NULL, `userCheck` INTEGER NOT NULL, `examCode` TEXT NOT NULL, `examQACode` TEXT NOT NULL, PRIMARY KEY(`id`, `examCode`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f88c4e61953dca957280a3da4746efdc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `InAnswer`");
        _db.execSQL("DROP TABLE IF EXISTS `InData`");
        _db.execSQL("DROP TABLE IF EXISTS `InExamInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `InQuestion`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsInAnswer = new HashMap<String, TableInfo.Column>(17);
        _columnsInAnswer.put("answerFlag", new TableInfo.Column("answerFlag", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("answerTrueData", new TableInfo.Column("answerTrueData", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("answer", new TableInfo.Column("answer", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("optionNumber", new TableInfo.Column("optionNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("questionType", new TableInfo.Column("questionType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("answerType", new TableInfo.Column("answerType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("checkCount", new TableInfo.Column("checkCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("questionId", new TableInfo.Column("questionId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("examCode", new TableInfo.Column("examCode", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("viewOrder", new TableInfo.Column("viewOrder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("userChk", new TableInfo.Column("userChk", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("textAnswer", new TableInfo.Column("textAnswer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("fileName", new TableInfo.Column("fileName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("mediaType", new TableInfo.Column("mediaType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAnswer.put("examQACode", new TableInfo.Column("examQACode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInAnswer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInAnswer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInAnswer = new TableInfo("InAnswer", _columnsInAnswer, _foreignKeysInAnswer, _indicesInAnswer);
        final TableInfo _existingInAnswer = TableInfo.read(_db, "InAnswer");
        if (! _infoInAnswer.equals(_existingInAnswer)) {
          return new RoomOpenHelper.ValidationResult(false, "InAnswer(com.nsdevil.ubtmobilev3.data.db.InAnswer).\n"
                  + " Expected:\n" + _infoInAnswer + "\n"
                  + " Found:\n" + _existingInAnswer);
        }
        final HashMap<String, TableInfo.Column> _columnsInData = new HashMap<String, TableInfo.Column>(7);
        _columnsInData.put("dataOrder", new TableInfo.Column("dataOrder", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("dataText", new TableInfo.Column("dataText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("dataType", new TableInfo.Column("dataType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("viewOrder", new TableInfo.Column("viewOrder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("examCode", new TableInfo.Column("examCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInData.put("media", new TableInfo.Column("media", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInData = new TableInfo("InData", _columnsInData, _foreignKeysInData, _indicesInData);
        final TableInfo _existingInData = TableInfo.read(_db, "InData");
        if (! _infoInData.equals(_existingInData)) {
          return new RoomOpenHelper.ValidationResult(false, "InData(com.nsdevil.ubtmobilev3.data.db.InData).\n"
                  + " Expected:\n" + _infoInData + "\n"
                  + " Found:\n" + _existingInData);
        }
        final HashMap<String, TableInfo.Column> _columnsInExamInfo = new HashMap<String, TableInfo.Column>(6);
        _columnsInExamInfo.put("examId", new TableInfo.Column("examId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInExamInfo.put("examCode", new TableInfo.Column("examCode", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInExamInfo.put("examName", new TableInfo.Column("examName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInExamInfo.put("totalTime", new TableInfo.Column("totalTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInExamInfo.put("remainTime", new TableInfo.Column("remainTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInExamInfo.put("submissionYN", new TableInfo.Column("submissionYN", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInExamInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInExamInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInExamInfo = new TableInfo("InExamInfo", _columnsInExamInfo, _foreignKeysInExamInfo, _indicesInExamInfo);
        final TableInfo _existingInExamInfo = TableInfo.read(_db, "InExamInfo");
        if (! _infoInExamInfo.equals(_existingInExamInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "InExamInfo(com.nsdevil.ubtmobilev3.data.db.InExamInfo).\n"
                  + " Expected:\n" + _infoInExamInfo + "\n"
                  + " Found:\n" + _existingInExamInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsInQuestion = new HashMap<String, TableInfo.Column>(19);
        _columnsInQuestion.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("question", new TableInfo.Column("question", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("headerText", new TableInfo.Column("headerText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("difficultyLevel", new TableInfo.Column("difficultyLevel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("answerType", new TableInfo.Column("answerType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("userAnswers", new TableInfo.Column("userAnswers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("checkCount", new TableInfo.Column("checkCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("controlNo", new TableInfo.Column("controlNo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("point", new TableInfo.Column("point", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("viewOrder", new TableInfo.Column("viewOrder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("correctRate", new TableInfo.Column("correctRate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("questionType", new TableInfo.Column("questionType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("incorrectNote", new TableInfo.Column("incorrectNote", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("option", new TableInfo.Column("option", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("userCheck", new TableInfo.Column("userCheck", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("examCode", new TableInfo.Column("examCode", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInQuestion.put("examQACode", new TableInfo.Column("examQACode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInQuestion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInQuestion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInQuestion = new TableInfo("InQuestion", _columnsInQuestion, _foreignKeysInQuestion, _indicesInQuestion);
        final TableInfo _existingInQuestion = TableInfo.read(_db, "InQuestion");
        if (! _infoInQuestion.equals(_existingInQuestion)) {
          return new RoomOpenHelper.ValidationResult(false, "InQuestion(com.nsdevil.ubtmobilev3.data.db.InQuestion).\n"
                  + " Expected:\n" + _infoInQuestion + "\n"
                  + " Found:\n" + _existingInQuestion);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f88c4e61953dca957280a3da4746efdc", "53fdd4ffc5c01609318111a175c2bc41");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "InAnswer","InData","InExamInfo","InQuestion");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `InAnswer`");
      _db.execSQL("DELETE FROM `InData`");
      _db.execSQL("DELETE FROM `InExamInfo`");
      _db.execSQL("DELETE FROM `InQuestion`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(InAnswerDao.class, InAnswerDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(InDataDao.class, InDataDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(InExamInfoDao.class, InExamInfoDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(InQuestionDao.class, InQuestionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public InAnswerDao answerDao() {
    if (_inAnswerDao != null) {
      return _inAnswerDao;
    } else {
      synchronized(this) {
        if(_inAnswerDao == null) {
          _inAnswerDao = new InAnswerDao_Impl(this);
        }
        return _inAnswerDao;
      }
    }
  }

  @Override
  public InDataDao dataDao() {
    if (_inDataDao != null) {
      return _inDataDao;
    } else {
      synchronized(this) {
        if(_inDataDao == null) {
          _inDataDao = new InDataDao_Impl(this);
        }
        return _inDataDao;
      }
    }
  }

  @Override
  public InExamInfoDao examInfoDao() {
    if (_inExamInfoDao != null) {
      return _inExamInfoDao;
    } else {
      synchronized(this) {
        if(_inExamInfoDao == null) {
          _inExamInfoDao = new InExamInfoDao_Impl(this);
        }
        return _inExamInfoDao;
      }
    }
  }

  @Override
  public InQuestionDao questionDao() {
    if (_inQuestionDao != null) {
      return _inQuestionDao;
    } else {
      synchronized(this) {
        if(_inQuestionDao == null) {
          _inQuestionDao = new InQuestionDao_Impl(this);
        }
        return _inQuestionDao;
      }
    }
  }
}
