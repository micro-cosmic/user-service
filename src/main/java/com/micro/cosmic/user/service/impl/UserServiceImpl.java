package com.micro.cosmic.user.service.impl;

import com.micro.cosmic.user.dao.UserDAO;
import com.micro.cosmic.user.service.UserService;
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

    @Override
    public String getUser(Integer userId) {
        return userDAO.selectUserById(userId).toString();
    }
}
