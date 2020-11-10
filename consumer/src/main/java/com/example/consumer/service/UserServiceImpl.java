package com.example.consumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import com.example.provider.service.TicketService;

@Component("userService")
public class UserServiceImpl {
    //这个注解是dubbo下的，这里的ticketService是在zookeeper注册中心取到的
    @Reference
    TicketService ticketService;

    @Reference
    com.example.provider.service.ProductService productService;

    public void getTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }

    public String getProductName(Integer id){
        return productService.getProductName(id);
    }


}