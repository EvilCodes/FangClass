package cn.ucai.blackfox.fangclass.model.domin;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class AlbumsBean {


    /**
     * pid : 7676
     * imgId : 28291
     * imgUrl : 201509/goods_img/7676_P_1442390596177.png
     * thumbUrl : no_picture.gif
     */

    private int pid;
    private int imgId;
    private String imgUrl;
    private String thumbUrl;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    @Override
    public String toString() {
        return "AlbumsBean{" +
                "pid=" + pid +
                ", imgId=" + imgId +
                ", imgUrl='" + imgUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                '}';
    }
}
