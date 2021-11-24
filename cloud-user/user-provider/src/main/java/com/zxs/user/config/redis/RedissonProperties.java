package com.zxs.user.config.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.redisson", ignoreUnknownFields = false)
@Data
public class RedissonProperties {

    private String address;

    private int database;

    private int timeout;

    private String password;

    private RedissonPoolProperties pool;

    @Data
    public static class RedissonPoolProperties{
        private int maxIdle;

        private int minIdle;

        private int maxActive;

        private int maxWait;
    }
}
