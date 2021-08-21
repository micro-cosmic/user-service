package com.micro.cosmic.user.dao;

import java.util.Map;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */

public interface UserDAO {
    /**
     * 通过uid查询用户信息
     *
     * @param userId
     * @return
     */
    Map selectUserById(Integer userId);
}
