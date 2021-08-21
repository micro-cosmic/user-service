package com.micro.cosmic.user.service;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */
public interface UserService {
    /**
     * 通过uid获取用户信息
     *
     * @param userId
     * @return
     */
    String getUser(Integer userId);
}
