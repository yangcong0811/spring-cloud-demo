package com.ycong.rabbitmq.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.ycong.rabbitmq.util.ConnectionUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.ycong.rabbitmq.simple
 * File Name:
 * Date:2018-03-07 下午 2:28
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */
public class ProducerMq {
    private static final String QUEUE_NAME="test_simple_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 获取一个连接
        Connection connection = ConnectionUtil.getConnection();

        // 从连接中获取一个通道
        Channel channel = connection.createChannel();

        // 创建队列声明
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        String msg = "hello simple...";

        channel.basicPublish("",QUEUE_NAME,null,msg.getBytes());

        System.out.println("发送消息：" + msg);

        channel.close();
        connection.close();
    }
}
