package cn.ucai.blackfox.fangclass.model.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class DBOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String FANGCLASS_USER_TABLE_CREATE = "CREATE TABLE " + UserDao.USER_TABLE_NAME + "("
            + UserDao.USER_COLUMN_NAME + " TEXT PRIMARY KEY,"
            + UserDao.USER_COLUMN_NICK + " TEXT,"
            + UserDao.USER_COLUMN_AVATAR + " INTEGER,"
            + UserDao.USER_COLUMN_AVATAR_PATH + " TEXT,"
            + UserDao.USER_COLUMN_AVATAR_TYPE + " INTEGER,"
            + UserDao.USER_COLUMN_AVATAR_SUFFIX + " TEXT,"
            + UserDao.USER_COLUMN_AVATAR_UPDATE_TIME + " TEXT);";

    public static String getUserDataBaseName() {
        return "cn.ucai.blackfox.fangclass.db";
    }

    public DBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, getUserDataBaseName(), factory, version);
    }

    private static DBOpenHelper instance;

    public static DBOpenHelper getInstance(Context context) {

        if (instance == null) {
            synchronized (DBOpenHelper.class) {
                if (instance == null) {
                    instance = new DBOpenHelper(context, getUserDataBaseName(), null, DATABASE_VERSION);
                }

            }
        }
        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(FANGCLASS_USER_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
}
