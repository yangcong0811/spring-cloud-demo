package com.study.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.study.controller
 * File Name:
 * Date:2018-03-02 下午 3:10
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("hello, host: " + instance.getHost() + ",serviceId: " + instance.getServiceId() + ", port: "+ instance.getPort());
        return "Hello Word";
    }
}
