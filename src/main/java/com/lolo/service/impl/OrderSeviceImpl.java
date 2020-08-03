package com.lolo.service.impl;

import com.lolo.dao.entity.Order;
import com.lolo.dao.mapper.OrderMapper;
import com.lolo.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class OrderSeviceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public String setOrderById(Map<String,String> paraMa){
        //实现逻辑
        Order o = new Order();
        String  strOrder= paraMa.get("orderId");
        Integer orderId = Integer.parseInt(strOrder);
        o.setOrderid(orderId);
        o.setSide(paraMa.get("side"));
        o.setPrice(Double.valueOf(paraMa.get("price")));
        //存入数据库
        return orderMapper.insert(paraMa);
    }


}
