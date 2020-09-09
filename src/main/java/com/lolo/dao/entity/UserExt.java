package com.lolo.dao.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author 鲫鱼哥
*/
public class UserExt implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * UID
     */
    private Integer uid;

    /**
     * 登录验证策略：目前只有1
     */
    private Byte loginVerify;

    /**
     * 修改设置验证策略：目前只有1
     */
    private Byte settingVerify;

    /**
     * 提现验证策略：目前只有1
     */
    private Byte withdrawVerify;

    /**
     * 交易验证：1：不验证资金密码，2：每两小时验证一次资金密码，3： 每次都验证资金密码
     */
    private Byte exchangeVerify;

    /**
     * 上次验证资金密码时间戳
     */
    private Integer lasttimeExchangeVerify;

    /**
     * 用户勾选交易对，最多6对，逗号分割
     */
    private String symbols;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 被邀请码
     */
    private String invitedCode;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 使用平台币作为交易手续费的开关，0使用，1停用
     */
    private Byte useFeeCoinOpen;

    /**
     * 平台币作为手续费时费率
     */
    private BigDecimal feeCoinRate;

    /**
     * 用户语言环境
     */
    private String language;

    /**
     * 手势密码
     */
    private String handpwd;

    /**
     * 商户id，0表示SAAS总平台
     */
    private Integer companyId;

    /**
     * 国家数字编码
     */
    private String numberCode;

    /**
     * 防篡改指纹
     */
    private String fingerprint;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getLoginVerify() {
        return loginVerify;
    }

    public void setLoginVerify(Byte loginVerify) {
        this.loginVerify = loginVerify;
    }

    public Byte getSettingVerify() {
        return settingVerify;
    }

    public void setSettingVerify(Byte settingVerify) {
        this.settingVerify = settingVerify;
    }

    public Byte getWithdrawVerify() {
        return withdrawVerify;
    }

    public void setWithdrawVerify(Byte withdrawVerify) {
        this.withdrawVerify = withdrawVerify;
    }

    public Byte getExchangeVerify() {
        return exchangeVerify;
    }

    public void setExchangeVerify(Byte exchangeVerify) {
        this.exchangeVerify = exchangeVerify;
    }

    public Integer getLasttimeExchangeVerify() {
        return lasttimeExchangeVerify;
    }

    public void setLasttimeExchangeVerify(Integer lasttimeExchangeVerify) {
        this.lasttimeExchangeVerify = lasttimeExchangeVerify;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols == null ? null : symbols.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getInvitedCode() {
        return invitedCode;
    }

    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode == null ? null : invitedCode.trim();
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

    public Byte getUseFeeCoinOpen() {
        return useFeeCoinOpen;
    }

    public void setUseFeeCoinOpen(Byte useFeeCoinOpen) {
        this.useFeeCoinOpen = useFeeCoinOpen;
    }

    public BigDecimal getFeeCoinRate() {
        return feeCoinRate;
    }

    public void setFeeCoinRate(BigDecimal feeCoinRate) {
        this.feeCoinRate = feeCoinRate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getHandpwd() {
        return handpwd;
    }

    public void setHandpwd(String handpwd) {
        this.handpwd = handpwd == null ? null : handpwd.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode == null ? null : numberCode.trim();
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint == null ? null : fingerprint.trim();
    }

    public static class Builder {
        private UserExt obj;

        public Builder() {
            this.obj = new UserExt();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder loginVerify(Byte loginVerify) {
            obj.loginVerify = loginVerify;
            return this;
        }

        public Builder settingVerify(Byte settingVerify) {
            obj.settingVerify = settingVerify;
            return this;
        }

        public Builder withdrawVerify(Byte withdrawVerify) {
            obj.withdrawVerify = withdrawVerify;
            return this;
        }

        public Builder exchangeVerify(Byte exchangeVerify) {
            obj.exchangeVerify = exchangeVerify;
            return this;
        }

        public Builder lasttimeExchangeVerify(Integer lasttimeExchangeVerify) {
            obj.lasttimeExchangeVerify = lasttimeExchangeVerify;
            return this;
        }

        public Builder symbols(String symbols) {
            obj.symbols = symbols;
            return this;
        }

        public Builder inviteCode(String inviteCode) {
            obj.inviteCode = inviteCode;
            return this;
        }

        public Builder invitedCode(String invitedCode) {
            obj.invitedCode = invitedCode;
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

        public Builder useFeeCoinOpen(Byte useFeeCoinOpen) {
            obj.useFeeCoinOpen = useFeeCoinOpen;
            return this;
        }

        public Builder feeCoinRate(BigDecimal feeCoinRate) {
            obj.feeCoinRate = feeCoinRate;
            return this;
        }

        public Builder language(String language) {
            obj.language = language;
            return this;
        }

        public Builder handpwd(String handpwd) {
            obj.handpwd = handpwd;
            return this;
        }

        public Builder companyId(Integer companyId) {
            obj.companyId = companyId;
            return this;
        }

        public Builder numberCode(String numberCode) {
            obj.numberCode = numberCode;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            obj.fingerprint = fingerprint;
            return this;
        }

        public UserExt build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "UserExt{" +
                "id=" + id +
                ", uid=" + uid +
                ", loginVerify=" + loginVerify +
                ", settingVerify=" + settingVerify +
                ", withdrawVerify=" + withdrawVerify +
                ", exchangeVerify=" + exchangeVerify +
                ", lasttimeExchangeVerify=" + lasttimeExchangeVerify +
                ", symbols='" + symbols + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", invitedCode='" + invitedCode + '\'' +
                ", ctime=" + ctime +
                ", mtime=" + mtime +
                ", useFeeCoinOpen=" + useFeeCoinOpen +
                ", feeCoinRate=" + feeCoinRate +
                ", language='" + language + '\'' +
                ", handpwd='" + handpwd + '\'' +
                ", numberCode='" + numberCode + '\'' +
                ", companyId=" + companyId +
                ", fingerprint='" + fingerprint + '\'' +
                '}';
    }
}