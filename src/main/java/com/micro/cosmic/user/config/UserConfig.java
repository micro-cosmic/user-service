package com.micro.cosmic.user.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author caojiancheng
 * @date 2021/8/21
 * @description
 */
@Data
@Service
@RefreshScope
public class UserConfig {
    @Value("${user.id}")
    private Integer userId;
}
