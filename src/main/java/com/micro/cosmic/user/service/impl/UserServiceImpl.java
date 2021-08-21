package com.micro.cosmic.user.service.impl;

import com.micro.cosmic.user.dao.UserDAO;
import com.micro.cosmic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String getUser(Integer userId) {
        System.out.println(redisTemplate.opsForValue().get("name"));
        return userDAO.selectUserById(userId).toString();
    }
}
