package com.bite.order.service;

import com.bite.order.mapper.OrderMapper;
import com.bite.order.model.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public OrderInfo selectOrderById(Integer orderId) {
        return orderMapper.selectOrderById(orderId);
    }
}
