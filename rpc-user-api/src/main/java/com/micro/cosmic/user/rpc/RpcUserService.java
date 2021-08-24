package com.micro.cosmic.user.rpc;

import com.micro.cosmic.user.rpc.model.ResponseVO;

/**
 * @author caojiancheng
 * @date 2021/8/23
 * @description
 */
public interface RpcUserService {
    /**
     * 通过uid获取用户信息
     *
     * @param userId
     * @return
     */
    ResponseVO<String> getUser(Integer userId);
}
