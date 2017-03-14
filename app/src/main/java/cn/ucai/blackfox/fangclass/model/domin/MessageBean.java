package cn.ucai.blackfox.fangclass.model.domin;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class MessageBean {

    /**
     * success : true
     * msg : 1
     */

    private boolean success;
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}


