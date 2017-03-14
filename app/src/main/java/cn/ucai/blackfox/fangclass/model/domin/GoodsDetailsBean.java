package cn.ucai.blackfox.fangclass.model.domin;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class GoodsDetailsBean {


    /**
     * id : 279
     * goodsId : 7676
     * catId : 291
     * goodsName : 学生餐具餐盒便当盒饭盒
     * goodsEnglishName : Monbento
     * goodsBrief : 放心给宝宝使用的便当盒，可以DIY卡片，放入盒盖顶端，增加宝宝的动手能力和创造力。上下两层，简单分隔食物。
     * shopPrice : ￥198
     * currencyPrice : ￥238
     * promotePrice : ￥168
     * rankPrice : ￥208
     * isPromote : true
     * goodsThumb : 201509/thumb_img/7676_thumb_G_1442390596247.png
     * goodsImg : 201509/thumb_img/7676_thumb_G_1442390596247.png
     * addTime : 1476766404598
     * shareUrl : http://m.fulishe.com/item/7676
     * properties : [{"id":9527,"goodsId":0,"colorId":6,"colorName":"草绿","colorCode":"#a4a84e","colorImg":"","colorUrl":"https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.16.BIE9it&id=42133015382&skuId=70003486324&areaId=310100&cat_id=50036640&rn=f176f9e0341c5129ca78a9fff2d44c4e&user_id=1097014245&is_b=1","albums":[{"pid":7676,"imgId":28291,"imgUrl":"201509/goods_img/7676_P_1442390596177.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28292,"imgUrl":"201509/goods_img/7676_P_1442390596192.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28293,"imgUrl":"201509/goods_img/7676_P_1442390596687.png","thumbUrl":"no_picture.gif"},{"pid":7676,"imgId":28294,"imgUrl":"201509/goods_img/7676_P_1442390596381.png","thumbUrl":"no_picture.gif"}]}]
     * promote : true
     */

    private int id;
    private int goodsId;
    private int catId;
    private String goodsName;
    private String goodsEnglishName;
    private String goodsBrief;
    private String shopPrice;
    private String currencyPrice;
    private String promotePrice;
    private String rankPrice;
    private boolean isPromote;
    private String goodsThumb;
    private String goodsImg;
    private long addTime;
    private String shareUrl;
    private boolean promote;
    private PropertiesBean[] properties;

    public PropertiesBean[] getProperties() {
        return properties;
    }

    public void setProperties(PropertiesBean[] properties) {
        this.properties = properties;
    }

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

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsEnglishName() {
        return goodsEnglishName;
    }

    public void setGoodsEnglishName(String goodsEnglishName) {
        this.goodsEnglishName = goodsEnglishName;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getCurrencyPrice() {
        return currencyPrice;
    }

    public void setCurrencyPrice(String currencyPrice) {
        this.currencyPrice = currencyPrice;
    }

    public String getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(String promotePrice) {
        this.promotePrice = promotePrice;
    }

    public String getRankPrice() {
        return rankPrice;
    }

    public void setRankPrice(String rankPrice) {
        this.rankPrice = rankPrice;
    }

    public boolean isIsPromote() {
        return isPromote;
    }

    public void setIsPromote(boolean isPromote) {
        this.isPromote = isPromote;
    }

    public String getGoodsThumb() {
        return goodsThumb;
    }

    public void setGoodsThumb(String goodsThumb) {
        this.goodsThumb = goodsThumb;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public boolean isPromote() {
        return promote;
    }

    public void setPromote(boolean promote) {
        this.promote = promote;
    }

    @Override
    public String toString() {
        return "GoodsDetailsBean{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", catId=" + catId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsEnglishName='" + goodsEnglishName + '\'' +
                ", goodsBrief='" + goodsBrief + '\'' +
                ", shopPrice='" + shopPrice + '\'' +
                ", currencyPrice='" + currencyPrice + '\'' +
                ", promotePrice='" + promotePrice + '\'' +
                ", rankPrice='" + rankPrice + '\'' +
                ", isPromote=" + isPromote +
                ", goodsThumb='" + goodsThumb + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", addTime=" + addTime +
                ", shareUrl='" + shareUrl + '\'' +
                ", promote=" + promote +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}
