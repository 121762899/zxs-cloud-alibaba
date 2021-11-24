package com.zxs.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 这里排除了DruidDataSourceAutoConfigure ，是因为用了动态数据源，如果不配置，会报错,或者用
// 配置文件中的 spring.autoconfigure.exclude
@EnableDiscoveryClient
@SpringBootApplication/*(exclude = {DruidDataSourceAutoConfigure.class})*/
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class);
    }
}
