package com.hengan.hst.common;

/**/
public class GoodsItem {
    private int image;  //大图
    private String title;  //标题
    private String point;  //要点
    private String minPrice;  //最小价格
    private String linePrice;  //划线价
    private int inventory;  //库存
    private int nowTime;  //服务器时间
    private int saleTime;  //开售时间
    private Boolean isDiscount;  //是否参与折扣
    private String activityPrice;  //活动价格
    private String discount;

    public GoodsItem(int image, String title, String point, String minPrice, String linePrice, int inventory, int nowTime, int saleTime, Boolean isDiscount, String activityPrice, String discount) {
        this.image = image;
        this.title = title;
        this.point = point;
        this.minPrice = minPrice;
        this.linePrice = linePrice;
        this.inventory = inventory;
        this.nowTime = nowTime;
        this.saleTime = saleTime;
        this.isDiscount = isDiscount;
        this.activityPrice = activityPrice;
        this.discount = discount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(String linePrice) {
        this.linePrice = linePrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getNowTime() {
        return nowTime;
    }

    public void setNowTime(int nowTime) {
        this.nowTime = nowTime;
    }

    public int getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(int saleTime) {
        this.saleTime = saleTime;
    }

    public Boolean getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Boolean discount) {
        isDiscount = discount;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
