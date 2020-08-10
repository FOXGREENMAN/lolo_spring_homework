package com.lolo.service;


import com.lolo.dao.entity.Trade;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.catalina.Store;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Map;

public interface ExOrderService {
       //创建订单
       String saveOrderById (Map<String,String> paraMa);
       //查询订单
       String getOrderById(Map<String,String> inquMap);



}
