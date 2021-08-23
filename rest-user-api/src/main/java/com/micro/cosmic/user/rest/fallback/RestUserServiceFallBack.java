package com.micro.cosmic.user.rest.fallback;

import com.micro.cosmic.user.rest.RestUserService;
import org.springframework.stereotype.Service;

/**
 * @author caojiancheng
 * @date 2021/8/23
 * @description
 */
@Service
public class RestUserServiceFallBack implements RestUserService {
    @Override
    public String getUser(Integer userId) {
        return "降级";
    }
}
