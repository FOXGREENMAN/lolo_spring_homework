package com.lolo.controller;

import com.lolo.dao.entity.Order;
import com.lolo.dao.entity.User;
import com.lolo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.KotlinDetector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

/**
 * Controller层
 *
 * 和前端交互接口定义在这里
 *
 * Created by admin on 2020/7/30.
 */
public class OrderAct {
    @Autowired
    private OrderService orderService;
    /**
     * 创建订单接口
     * @param paraMap 创建订单数据
     * @return
     */
    @RequestMapping(value= "/yanOrderId", method= RequestMethod.POST, produces="application/json;charset=utf-8")
    @ResponseBody
    public String createOrder(Map<String,String> paraMap){
            //传给Service
            String isSucc = orderService.setOrderById(paraMap);

        return isSucc;
    }

}
