package com.sp.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class TicketServiceImpl implements TicketService{

    @Override
    public String getTicket() {
        return "疯狂动物城";
    }
}
