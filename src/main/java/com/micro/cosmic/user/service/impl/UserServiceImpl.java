package com.micro.cosmic.user.service.impl;

import com.micro.cosmic.user.dao.UserDAO;
import com.micro.cosmic.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public String getUser(Integer userId) {
        rocketMQTemplate.send("user_topic:query", MessageBuilder.withPayload(new HashMap() {{
            put("id", 1);
            put("name", "cjc");
        }}).setHeader("KEYS", System.currentTimeMillis()).build());
        log.info(redisTemplate.opsForValue().get("name").toString());
        return userDAO.selectUserById(userId).toString();
    }
}
