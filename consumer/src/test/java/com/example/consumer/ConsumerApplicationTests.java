package com.example.consumer;

import com.example.consumer.service.UserServiceImpl;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

    @Autowired
    private UserServiceImpl userService;


    @Test
    void contextLoads() {

        userService.getTicket();
        userService.getProductName(23);
    }

}
