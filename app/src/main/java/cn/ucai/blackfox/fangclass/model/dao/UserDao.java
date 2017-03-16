package cn.ucai.blackfox.fangclass.model.dao;

import cn.ucai.blackfox.fangclass.application.FangClassApplication;
import cn.ucai.blackfox.fangclass.model.domin.User;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class UserDao {
    /**
     * 数据库操作用到的表名以及属性名
     */
    public static final String USER_TABLE_NAME = "t_fangclass_user";
    public static final String USER_COLUMN_NAME = "m_user_name";
    public static final String USER_COLUMN_NICK = "m_user_nick";
    public static final String USER_COLUMN_AVATAR = "m_user_avatar_id";
    public static final String USER_COLUMN_AVATAR_PATH = "m_user_avatar_path";
    public static final String USER_COLUMN_AVATAR_SUFFIX = "m_user_avatar_suffix";
    public static final String USER_COLUMN_AVATAR_TYPE = "m_user_avatar_type";
    public static final String USER_COLUMN_AVATAR_UPDATE_TIME = "m_user_update_time";

    private static UserDao instance;

    public UserDao() {
        DBManager.createDbOpenHelper(FangClassApplication.getInstance().getApplicationContext());

    }
    public static UserDao getInstance() {
        if (instance == null) {
            synchronized (UserDao.class) {
                if (instance == null) {
                    instance = new UserDao();
                }
            }
        }
        return instance;
    }


    public static boolean saveUser(User user) {
        return DBManager.getInstance().saveUser(user);

    }

    public static User getUser(String username) {
        return DBManager.getInstance().getUser(username);
    }


}
