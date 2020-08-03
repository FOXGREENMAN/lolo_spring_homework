package com.lolo.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @author 42064
*/
public class Trade implements Serializable {
    /**
     * 成交记录ID
     */
    private Integer tradeid;

    /**
     * 价格
     */
    private Double price;

    /**
     * 数量
     */
    private Double volume;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getTradeid() {
        return tradeid;
    }

    public void setTradeid(Integer tradeid) {
        this.tradeid = tradeid;
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
        private Trade obj;

        public Builder() {
            this.obj = new Trade();
        }

        public Builder tradeid(Integer tradeid) {
            obj.tradeid = tradeid;
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

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Trade build() {
            return this.obj;
        }
    }
}