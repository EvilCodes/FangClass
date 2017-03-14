package cn.ucai.blackfox.fangclass.model.domin;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class Result {


    /**
     * retCode : 0
     * retMsg : true
     * retData : {"muserName":"张大鹏","muserNick":"大鹏","mavatarId":870,"mavatarPath":"user_avatar","mavatarSuffix":null,"mavatarType":0,"mavatarLastUpdateTime":"1489467419781"}
     */

    private int retCode;
    private boolean retMsg;
    private User retData;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public boolean isRetMsg() {
        return retMsg;
    }

    public void setRetMsg(boolean retMsg) {
        this.retMsg = retMsg;
    }

    public User getRetData() {
        return retData;
    }

    public void setRetData(User retData) {
        this.retData = retData;
    }

    @Override
    public String toString() {
        return "Result{" +
                "retCode=" + retCode +
                ", retMsg=" + retMsg +
                ", retData=" + retData +
                '}';
    }
}
