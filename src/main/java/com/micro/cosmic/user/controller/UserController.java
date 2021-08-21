package com.micro.cosmic.user.controller;

import com.micro.cosmic.user.config.UserConfig;
import com.micro.cosmic.user.dao.UserDAO;
import com.micro.cosmic.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserConfig userConfig;
    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        return userService.getUser(userConfig.getUserId());
    }
}
