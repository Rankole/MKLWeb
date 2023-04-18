package com.izejs.simple.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

public class Usercontrol implements Serializable {

    private static final long serialVersionUID = 1L;
//用户编号
    @TableId(type = IdType.AUTO)
    private Integer userId;
//用户名称
    private String userName;
//用户昵称
    private String userNc;
//用户部门
    private String userBm;
//手机号码
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNc() {
        return userNc;
    }

    public void setUserNc(String userNc) {
        this.userNc = userNc;
    }

    public String getUserBm() {
        return userBm;
    }

    public void setUserBm(String userBm) {
        this.userBm = userBm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "usercontrol{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", userNc=" + userNc +
                ", userBm=" + userBm +
                ", phone=" + phone +
                "}";
    }
}
