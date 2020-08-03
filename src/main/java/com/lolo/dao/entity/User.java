package com.lolo.dao.entity;



import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;


    private String countryCode;

    private String mobileNumber;

    private String email;

    private String loginPword;

    private String capitalPword;

    private Byte authType;

    private Byte authLevel;

    private String nickname;

   
    private Byte loginStatus;

   
    private Date loginexpireTime;

   
    private Byte excStatus;

   
    private Date excexpireTime;

   
    private Byte withdrawStatus;

   
    private Date withdrawexpireTime;

   
    private Date lockexpireTime;

    private Byte excOtcStatus;//场外交易冻结状态，0解冻  1冻结   没有在数据库添加字段，只存储于redis中

   
    private Date ctime;

   
    private Date mtime;

   
    private Date realnameTime;

   
    private Date certificateTime;

   
    private Date lastLoginTime;
    
   
    private Byte googleAuthenticatorStatus;
    
   
    private Byte mobileAuthenticatorStatus;

    /**
     * 用户出金限制状态 0：限制，1：正常
     */
//    private Byte withdrawLimitStatus;

    private String googleAuthenticatorKey;

    //用于前端显示
    private String hideMobileNumber;
//    private String showNickName;//前端显示的昵称
    
    private Byte loginVerify;

    private Byte settingVerify;

    private Byte withdrawVerify;

    private Byte exchangeVerify;

    private Integer lasttimeExchangeVerify;
    private Byte authStatus;//身份认证状态0、未审核，1、通过，2、未通过

    private Integer register;//注册人数
    private Integer bindTel;//绑定手机人数
    private Integer bindEmail;//绑定邮箱人数
    private Integer capital;//设置资金密码人数
    private Integer deposit;//完成充值人数
    private String realName;//真实姓名
    private String familyName;
    private String name;
    private Date authRealnamemtime;//身份认证更新时间
    private String otcNickName ;
    
    private Byte userType;//用户类型  0：普通用户 1：公司用户 2：回购用户 3：机器人用户
    
    //非数据库字段  作显示作用
    private Integer agentUserId; // 经纪人id
    private Integer agentPid; // 经纪人父级id
    private Integer agentRoleId; // 经纪人角色id
    private Integer agentLevel; // 经纪人等级
    private Integer agentUserStatus; // 经纪人状态
    private Integer agentUserAuditStatus; // 经纪人认证状态
    private String agentUserRoleName;  // 经纪人角色名称
    private Integer agentSource;  // 经纪人注册来源  0.平台授权  1.受邀请
    private String description;  // 管理员操作用户状态说明
    /* 出生年月 */
    private Date birthDate;
    private Byte authPhoneStatus;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
    	if(countryCode==null || countryCode.isEmpty()) {
    		return countryCode;
    	}
    	
    	if(!countryCode.startsWith("+")) {
    		return "+"+ countryCode.trim();
    	}
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginPword() {
        return loginPword;
    }

    public void setLoginPword(String loginPword) {
        this.loginPword = loginPword ;
    }

    public String getCapitalPword() {
        return capitalPword;
    }

    public void setCapitalPword(String capitalPword) {
        this.capitalPword = capitalPword == null ? null : capitalPword.trim();
    }

    public Byte getAuthType() {
        return authType;
    }

    public void setAuthType(Byte authType) {
        this.authType = authType;
    }

    public Byte getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Byte authLevel) {
        this.authLevel = authLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getLoginexpireTime() {
        return loginexpireTime;
    }

    public void setLoginexpireTime(Date loginexpireTime) {
        this.loginexpireTime = loginexpireTime;
    }

    public Byte getExcStatus() {
        return excStatus;
    }

    public void setExcStatus(Byte excStatus) {
        this.excStatus = excStatus;
    }

    public Date getExcexpireTime() {
        return excexpireTime;
    }

    public void setExcexpireTime(Date excexpireTime) {
        this.excexpireTime = excexpireTime;
    }

    public Byte getWithdrawStatus() {
        return withdrawStatus;
    }

    public void setWithdrawStatus(Byte withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
    }

    public Byte getExcOtcStatus() {
        return excOtcStatus;
    }

    public void setExcOtcStatus(Byte excOtcStatus) {
        this.excOtcStatus = excOtcStatus;
    }


    public Date getWithdrawexpireTime() {
        return withdrawexpireTime;
    }

    public void setWithdrawexpireTime(Date withdrawexpireTime) {
        this.withdrawexpireTime = withdrawexpireTime;
    }

    public Date getLockexpireTime() {
        return lockexpireTime;
    }

    public void setLockexpireTime(Date lockexpireTime) {
        this.lockexpireTime = lockexpireTime;
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

    public Date getRealnameTime() {
        return realnameTime;
    }

    public void setRealnameTime(Date realnameTime) {
        this.realnameTime = realnameTime;
    }

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getHideMobileNumber() {
        return hideMobileNumber;
    }

    public void setHideMobileNumber(String hideMobileNumber) {
        this.hideMobileNumber = hideMobileNumber;
    }
    
    public Byte getMobileAuthenticatorStatus() {
        return mobileAuthenticatorStatus;
    }

    public void setMobileAuthenticatorStatus(Byte mobileAuthenticatorStatus) {
        this.mobileAuthenticatorStatus = mobileAuthenticatorStatus;
    }
    
    public Byte getGoogleAuthenticatorStatus() {
        return googleAuthenticatorStatus;
    }

    public void setGoogleAuthenticatorStatus(Byte googleAuthenticatorStatus) {
        this.googleAuthenticatorStatus = googleAuthenticatorStatus;
    }

    public String getGoogleAuthenticatorKey() {
        return googleAuthenticatorKey;
    }

    public void setGoogleAuthenticatorKey(String googleAuthenticatorKey) {
        this.googleAuthenticatorKey = googleAuthenticatorKey == null ? null : googleAuthenticatorKey.trim();
    }

    /*public String getShowNickName() {
    	if(this.nickname == null || this.nickname.isEmpty()) {//昵称不存在
    		if(this.mobileNumber==null || this.mobileNumber.isEmpty()) {//手机不存在取邮箱
    			if(StringUtils.isNotBlank(this.email)){
                    this.showNickName = StringUtil.formatEmail(this.email);
//    				String mail[] = this.email.split("@");
//        			if(mail[0].length() > 12) {
//        				this.showNickName = StringUtil.hideMobileNumber(mail[0]);
//        			}
//        			else {
//        				this.showNickName = mail[0];
//        			}
    			}
    			
    		}
    		else {//手机存在取手机号
    			this.showNickName = StringUtil.hideMobileNumber(this.mobileNumber);
    		}
    	}
    	else {
    		String buf="";
    		int len = 0;
    		for(int i=0;i<this.nickname.length();i++) {
    			String iString = this.nickname.substring(i, i+1);
    			if(iString.getBytes().length >= 2) {
    				len=len+2;
    			}
    			else {
    				len++;
    			}
    			
    			if(len > 24) {
    				break;
    			}
    			buf = buf+iString;
    		}
    		this.showNickName = buf;
    	}
		return this.showNickName;
	}*/

	/*public void setShowNickName(String showNickName) {
		this.showNickName = showNickName;
	}*/
	
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

	public Byte getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(Byte authStatus) {
		this.authStatus = authStatus;
	}

	public Integer getRegister() {
		return register;
	}

	public void setRegister(Integer register) {
		this.register = register;
	}

	public Integer getBindTel() {
		return bindTel;
	}

	public void setBindTel(Integer bindTel) {
		this.bindTel = bindTel;
	}

	public Integer getBindEmail() {
		return bindEmail;
	}

	public void setBindEmail(Integer bindEmail) {
		this.bindEmail = bindEmail;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAuthRealnamemtime() {
		return authRealnamemtime;
	}

	public void setAuthRealnamemtime(Date authRealnamemtime) {
		this.authRealnamemtime = authRealnamemtime;
	}

	public String getOtcNickName() {
		return otcNickName;
	}

	public void setOtcNickName(String otcNickName) {
		this.otcNickName = otcNickName;
	}

//    public Byte getWithdrawLimitStatus() {
//        return withdrawLimitStatus;
//    }
//
//    public void setWithdrawLimitStatus(Byte withdrawLimitStatus) {
//        this.withdrawLimitStatus = withdrawLimitStatus;
//    }
    public Integer getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(Integer agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getAgentUserRoleName() {
        return agentUserRoleName;
    }

    public void setAgentUserRoleName(String agentUserRoleName) {
        this.agentUserRoleName = agentUserRoleName;
    }

    public Integer getAgentUserStatus() {
        return agentUserStatus;
    }

    public void setAgentUserStatus(Integer agentUserStatus) {
        this.agentUserStatus = agentUserStatus;
    }

    public Integer getAgentUserAuditStatus() {
        return agentUserAuditStatus;
    }

    public void setAgentUserAuditStatus(Integer agentUserAuditStatus) {
        this.agentUserAuditStatus = agentUserAuditStatus;
    }

    public Integer getAgentSource() {
        return agentSource;
    }

    public void setAgentSource(Integer agentSource) {
        this.agentSource = agentSource;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    public Integer getAgentPid() {
        return agentPid;
    }

    public void setAgentPid(Integer agentPid) {
        this.agentPid = agentPid;
    }

    public Integer getAgentRoleId() {
        return agentRoleId;
    }

    public void setAgentRoleId(Integer agentRoleId) {
        this.agentRoleId = agentRoleId;
    }
	

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Byte getAuthPhoneStatus() {
        return authPhoneStatus;
    }

    public void setAuthPhoneStatus(Byte authPhoneStatus) {
        this.authPhoneStatus = authPhoneStatus;
    }

    public static class Builder {
        private User obj;

        public Builder() {
            this.obj = new User();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder countryCode(String countryCode) {
            obj.countryCode = countryCode;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            obj.mobileNumber = mobileNumber;
            return this;
        }

        public Builder email(String email) {
            obj.email = email;
            return this;
        }

        public Builder loginPword(String loginPword) {
            obj.loginPword = loginPword;
            return this;
        }

        public Builder capitalPword(String capitalPword) {
            obj.capitalPword = capitalPword;
            return this;
        }

        public Builder authType(Byte authType) {
            obj.authType = authType;
            return this;
        }

        public Builder authLevel(Byte authLevel) {
            obj.authLevel = authLevel;
            return this;
        }

        public Builder nickname(String nickname) {
            obj.nickname = nickname;
            return this;
        }

        public Builder loginStatus(Byte loginStatus) {
            obj.loginStatus = loginStatus;
            return this;
        }

        public Builder loginexpireTime(Date loginexpireTime) {
            obj.loginexpireTime = loginexpireTime;
            return this;
        }

        public Builder excStatus(Byte excStatus) {
            obj.excStatus = excStatus;
            return this;
        }

        public Builder excOtcStatus(Byte excOtcStatus) {
            obj.excOtcStatus = excOtcStatus;
            return this;
        }

        public Builder excexpireTime(Date excexpireTime) {
            obj.excexpireTime = excexpireTime;
            return this;
        }

        public Builder withdrawStatus(Byte withdrawStatus) {
            obj.withdrawStatus = withdrawStatus;
            return this;
        }

        public Builder withdrawexpireTime(Date withdrawexpireTime) {
            obj.withdrawexpireTime = withdrawexpireTime;
            return this;
        }

        public Builder lockexpireTime(Date lockexpireTime) {
            obj.lockexpireTime = lockexpireTime;
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

        public Builder realnameTime(Date realnameTime) {
            obj.realnameTime = realnameTime;
            return this;
        }

        public Builder certificateTime(Date certificateTime) {
            obj.certificateTime = certificateTime;
            return this;
        }

        public Builder lastLoginTime(Date lastLoginTime) {
            obj.lastLoginTime = lastLoginTime;
            return this;
        }
        
	   	public Builder googleAuthenticatorStatus(Byte googleAuthenticatorStatus) {
	        obj.googleAuthenticatorStatus = googleAuthenticatorStatus;
	        return this;
	    }
	   	
	   	public Builder mobileAuthenticatorStatus(Byte mobileAuthenticatorStatus) {
	        obj.mobileAuthenticatorStatus = mobileAuthenticatorStatus;
	        return this;
	    }
	
	    public Builder googleAuthenticatorKey(String googleAuthenticatorKey) {
	        obj.googleAuthenticatorKey = googleAuthenticatorKey;
	        return this;
	    }

	   	public Builder agentUserId(Integer agentUserId) {
	        obj.agentUserId = agentUserId;
	        return this;
	    }

	    public Builder agentUserRoleName(String agentUserRoleName) {
	        obj.agentUserRoleName = agentUserRoleName;
	        return this;
	    }
	    public Builder agentUserStatus(Integer agentUserStatus) {
	        obj.agentUserStatus = agentUserStatus;
	        return this;
	    }
	    public Builder agentUserAuditStatus(Integer agentUserAuditStatus) {
	        obj.agentUserAuditStatus = agentUserAuditStatus;
	        return this;
	    }
	    public Builder agentSource(Integer agentSource) {
	        obj.agentSource = agentSource;
	        return this;
	    }
	    public Builder description(String description) {
	        obj.description = description;
	        return this;
	    }
	    public Builder agentLevel(Integer agentLevel) {
	        obj.agentLevel = agentLevel;
	        return this;
	    }
	    public Builder userType(Byte userType) {
	    	obj.userType = userType;
	    	return this;
	    }

//        public Builder withdrawLimitStatus(Byte withdrawLimitStatus) {
//            obj.withdrawLimitStatus = withdrawLimitStatus;
//            return this;
//        }

        public User build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", loginPword='" + loginPword + '\'' +
                ", capitalPword='" + capitalPword + '\'' +
                ", authType=" + authType +
                ", authLevel=" + authLevel +
                ", nickname='" + nickname + '\'' +
                ", loginStatus=" + loginStatus +
                ", loginexpireTime=" + loginexpireTime +
                ", excStatus=" + excStatus +
                ", excexpireTime=" + excexpireTime +
                ", withdrawStatus=" + withdrawStatus +
                ", withdrawexpireTime=" + withdrawexpireTime +
                ", lockexpireTime=" + lockexpireTime +
                ", excOtcStatus=" + excOtcStatus +
                ", ctime=" + ctime +
                ", mtime=" + mtime +
                ", realnameTime=" + realnameTime +
                ", certificateTime=" + certificateTime +
                ", lastLoginTime=" + lastLoginTime +
                ", googleAuthenticatorStatus=" + googleAuthenticatorStatus +
                ", mobileAuthenticatorStatus=" + mobileAuthenticatorStatus +
                ", googleAuthenticatorKey='" + googleAuthenticatorKey + '\'' +
                ", hideMobileNumber='" + hideMobileNumber + '\'' +
                ", loginVerify=" + loginVerify +
                ", settingVerify=" + settingVerify +
                ", withdrawVerify=" + withdrawVerify +
                ", exchangeVerify=" + exchangeVerify +
                ", lasttimeExchangeVerify=" + lasttimeExchangeVerify +
                ", authStatus=" + authStatus +
                ", register=" + register +
                ", bindTel=" + bindTel +
                ", bindEmail=" + bindEmail +
                ", capital=" + capital +
                ", deposit=" + deposit +
                ", realName='" + realName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", authRealnamemtime=" + authRealnamemtime +
                ", otcNickName='" + otcNickName + '\'' +
                ", userType=" + userType +
                ", agentUserId=" + agentUserId +
                ", agentPid=" + agentPid +
                ", agentRoleId=" + agentRoleId +
                ", agentLevel=" + agentLevel +
                ", agentUserStatus=" + agentUserStatus +
                ", agentUserAuditStatus=" + agentUserAuditStatus +
                ", agentUserRoleName='" + agentUserRoleName + '\'' +
                ", agentSource=" + agentSource +
                ", description='" + description + '\'' +
                ", birthDate=" + birthDate +
                ", authPhoneStatus=" + authPhoneStatus +
                '}';
    }
}