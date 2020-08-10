package com.lolo.controller;


import com.lolo.dao.entity.User;

import com.lolo.service.ExOrderService;
import com.lolo.utils.CheckParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.KotlinDetector;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Hashtable;
import java.util.Map;

/**
 * Controller层
 *
 * 和前端交互接口定义在这里
 *
 * Created by admin on 2020/7/30.
 */
@Controller
public class OrderAct {
    @Autowired
    private ExOrderService exOrderService;
    /**
     * 创建订单接口
     * @param paraMap 创建订单数据
     * @return
     */
    @RequestMapping(value= "/yanOrderId", method= RequestMethod.POST, produces="application/json;charset=utf-8")
    @ResponseBody
    public String createOrder(@RequestBody Map<String,String> paraMap){

//        Thread thread = new Thread();
//        String pice = paraMap.get("price");
//        Map<String,String> map = new Hashtable<String, String>();
//        for (String value : paraMap.values()) {
//            System.out.println("Key = " + value);
//        }

        paraMap.get("price");
        //校验参数
        if (CheckParam.check(paraMap.get("price"))){
            System.out.println("通过");

        }if (CheckParam.checkPrice(paraMap.get("price"))){
            System.out.println("通过");

        }else {
            return  null;
        }



        //传给Service
        String isSucc = exOrderService.setOrderById(paraMap);

        return isSucc;
    }

    /**
     * 查询订单接口
     * @param inquMap 查询订单数据
     * @return
     */
    @RequestMapping(value= "/chaxOrderId", method= RequestMethod.POST, produces="application/json;charset=utf-8")
    @ResponseBody
    public String inquireOrder(@RequestBody Map<String,String> inquMap){





        return
    }
}
