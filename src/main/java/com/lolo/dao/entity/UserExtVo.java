package com.lolo.dao.entity;

import lombok.Builder;

@Builder
public class UserExtVo {

    private  Integer uid;
    private Integer invitedUid;
    private String inviteCode;
    private  String invitedCode;

    public UserExtVo(){}

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getInvitedUid() {
        return invitedUid;
    }

    public void setInvitedUid(Integer invitedUid) {
        this.invitedUid = invitedUid;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getInvitedCode() {
        return invitedCode;
    }

    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode;
    }
}
