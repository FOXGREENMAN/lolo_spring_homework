package com.lolo.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @author 42064
*/
public class Order implements Serializable {
    /**
     * 订单ID
     */
    private Integer orderid;

    /**
     * 价格
     */
    private Double price;

    /**
     * 数量
     */
    private Double volume;

    /**
     * 买卖单方向, "SELL"为买单, "BUY"为卖单
     */
    private String side;

    /**
     * 订单状态 0 初始订单, 1 新订单, 2 完全成交订单, 6 异常单;
     */
    private Byte ostatus;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public Byte getOstatus() {
        return ostatus;
    }

    public void setOstatus(Byte ostatus) {
        this.ostatus = ostatus;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public static class Builder {
        private Order obj;

        public Builder() {
            this.obj = new Order();
        }

        public Builder orderid(Integer orderid) {
            obj.orderid = orderid;
            return this;
        }

        public Builder price(Double price) {
            obj.price = price;
            return this;
        }

        public Builder volume(Double volume) {
            obj.volume = volume;
            return this;
        }

        public Builder side(String side) {
            obj.side = side;
            return this;
        }

        public Builder ostatus(Byte ostatus) {
            obj.ostatus = ostatus;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Order build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", price=" + price +
                ", volume=" + volume +
                ", side='" + side + '\'' +
                ", ostatus=" + ostatus +
                ", ctime=" + ctime +
                ", mtime=" + mtime +
                '}';
    }
}