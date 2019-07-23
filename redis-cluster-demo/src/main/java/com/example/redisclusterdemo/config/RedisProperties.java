package com.example.redisclusterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/23 17:40
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.redis.cache")
public class RedisProperties {
    private int expireSeconds;
    private String clusterNodes;
    private int commandTimeout;
}
