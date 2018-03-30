package com.ycong.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.ycong.rabbitmq.util
 * File Name:
 * Date:2018-03-07 下午 2:21
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */
public class ConnectionUtil {

    public static Connection getConnection() throws IOException, TimeoutException {
        // 定义一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();

        // 设置服务地址
        factory.setHost("127.0.0.1");

        // 设置端口号
        factory.setPort(5672);

        // 设置vhost
        factory.setVirtualHost("/virtual_ycong");

        // 设置用户名
        factory.setUsername("ycong");

        // 设置密码
        factory.setPassword("ycong");

        return factory.newConnection();
    }
}
