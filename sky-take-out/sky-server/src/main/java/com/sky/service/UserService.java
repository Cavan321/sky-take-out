package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @author Cavan
 * @date 2023-09-29
 * @qq 2069543852
 */
public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO:
     * @return User
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
