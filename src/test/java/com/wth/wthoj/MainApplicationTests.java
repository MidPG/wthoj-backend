package com.wth.wthoj;

import javax.annotation.Resource;

import com.rabbitmq.client.ConnectionFactory;
import com.wth.wthoj.mq.MessageConsumer;
import com.wth.wthoj.mq.MessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 主类测试
 *
 */
@SpringBootTest
class MainApplicationTests {

    @Resource
    private MessageProducer messageProducer;

    @Resource
    private MessageConsumer messageConsumer;







}

















