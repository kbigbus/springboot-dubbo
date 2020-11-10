package com.example.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component("ticketService")
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "一张票";
    }
}
