package com.lolo.service;


import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.catalina.Store;

import java.rmi.MarshalledObject;
import java.util.Map;

public interface ExOrderService {
       //创建订单
       String setOrderById (Map<String,String> paraMa);
       //查询订单
       String getOrderById(Map<String,String> inquMap);



}
