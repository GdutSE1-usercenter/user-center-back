package com.magicb.usercenter.service;

import com.magicb.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author MagicB
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-07-26 13:52:02
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 用户确认密码
     * @return 新用户 id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);

    /**
     *
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @return 登录
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
}
