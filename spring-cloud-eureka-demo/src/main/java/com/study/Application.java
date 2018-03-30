package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.study
 * File Name:
 * Date:2018-03-02 下午 1:43
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */

@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
