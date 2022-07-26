package com.magicb.usercenter.model.domain.request;

import java.io.Serializable;

import lombok.Data;
/**
 * 用户注册请求体
 *
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 5548150670644897098L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}
