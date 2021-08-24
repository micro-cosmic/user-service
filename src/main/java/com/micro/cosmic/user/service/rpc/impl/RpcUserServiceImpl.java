package com.micro.cosmic.user.service.rpc.impl;

import com.micro.cosmic.user.rpc.RpcUserService;
import com.micro.cosmic.user.rpc.model.ResponseVO;
import com.micro.cosmic.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author caojiancheng
 * @date 2021/8/24
 * @description
 */
@Service(timeout = 15000)
public class RpcUserServiceImpl implements RpcUserService {

    @Autowired
    private UserService userService;

    @Override
    public ResponseVO<String> getUser(Integer userId) {
        return ResponseVO.success(userService.getUser(userId));
    }
}
