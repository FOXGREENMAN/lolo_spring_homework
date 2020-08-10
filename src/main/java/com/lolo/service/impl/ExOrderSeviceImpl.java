package com.lolo.service.impl;

import com.lolo.dao.entity.ExOrder;
import com.lolo.dao.entity.ExOrderExample;
import com.lolo.dao.entity.Trade;
import com.lolo.dao.entity.TradeExample;
import com.lolo.dao.mapper.ExOrderMapper;
import com.lolo.dao.mapper.TradeMapper;
import com.lolo.service.ExOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class ExOrderSeviceImpl implements ExOrderService {

    @Autowired
    private ExOrderMapper exorderMapper;

    @Autowired
    private TradeMapper tradeMapper;

    @Override
    public String saveOrderById(Map<String,String> paraMa){
        //实现逻辑
        ExOrder o = new ExOrder();
//        String  strOrder= paraMa.get("orderId");
//        Integer orderId = Integer.parseInt(strOrder);
//        o.setOrderid(orderId);
//        o.setSide(paraMa.get("side"));
//        o.setPrice(Double.valueOf(paraMa.get("price")));
        //存入数据库

        Trade trade = new Trade();
        trade.setPrice(Double.valueOf(paraMa.get("price")));


        String result ;
        int i= tradeMapper.insert(trade);
        if (i > 0){
            result="succ";
            System.out.println("succ");
        }else {
            result="fall";
            System.out.println("fall");
        }
        return result;
    }

    @Override
    public String getOrderById(Map<String,String> inquMap){
        ExOrderExample exOrderExample = new ExOrderExample();
        exorderMapper.selectByExample(exOrderExample).toString();


        return exorderMapper.selectByExample(exOrderExample).toString();
    }

    }



