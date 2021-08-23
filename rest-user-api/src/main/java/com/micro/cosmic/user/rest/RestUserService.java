package com.micro.cosmic.user.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.micro.cosmic.user.rest.fallback.RestUserServiceFallBack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author caojiancheng
 * @date 2021/8/23
 * @description
 */
@RequestMapping("/user")
@FeignClient(value = "user-service", fallback = RestUserServiceFallBack.class)
public interface RestUserService {
    /**
     * 通过uid获取用户信息
     *
     * @param userId
     * @return
     */
    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);
}
