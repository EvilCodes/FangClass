package cn.ucai.blackfox.fangclass.model.domin;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class PropertiesBean {


    /**
     * id : 9527
     * goodsId : 0
     * colorId : 6
     * colorName : 草绿
     * colorCode : #a4a84e
     * colorImg :
     * colorUrl : https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.16.BIE9it&id=42133015382&skuId=70003486324&areaId=310100&cat_id=50036640&rn=f176f9e0341c5129ca78a9fff2d44c4e&user_id=1097014245&is_b=1
     * albums : [{"pid":7676,"imgId":28291,"imgUrl":"201509/goods_img/7676_P_1442390596177.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28292,"imgUrl":"201509/goods_img/7676_P_1442390596192.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28293,"imgUrl":"201509/goods_img/7676_P_1442390596687.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28294,"imgUrl":"201509/goods_img/7676_P_1442390596381.png","thumbUrl":"no_picture.gif"}]
     */

    private int id;
    private int goodsId;
    private int colorId;
    private String colorName;
    private String colorCode;
    private String colorImg;
    private String colorUrl;
    private AlbumsBean[] albums;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorImg() {
        return colorImg;
    }

    public void setColorImg(String colorImg) {
        this.colorImg = colorImg;
    }

    public String getColorUrl() {
        return colorUrl;
    }

    public void setColorUrl(String colorUrl) {
        this.colorUrl = colorUrl;
    }

    public AlbumsBean[] getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumsBean[] albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "PropertiesBean{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", colorId=" + colorId +
                ", colorName='" + colorName + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", colorImg='" + colorImg + '\'' +
                ", colorUrl='" + colorUrl + '\'' +
                ", albums=" + Arrays.toString(albums) +
                '}';
    }
}
