package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.study
 * File Name:
 * Date:2018-03-02 下午 1:43
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
