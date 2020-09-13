package com.lolo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lolo.dao.entity.User;
import com.lolo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by admin on 2020/8/2.
 */
@Controller
public class UserAct {

    @Autowired
    private UserService userService;

    /**
     * 通过用户ID查找用户
     * @param paramMap
     * @return
     */
    @RequestMapping(value= "/findUserByUID", method= RequestMethod.POST, produces="application/json;charset=utf-8")
    @ResponseBody
    public String findUserByUID(@RequestBody HashMap<String, Object> paramMap){

        Object obUid = paramMap.get("uid");
        String strUid = String .valueOf(obUid);
        Integer ingUid = Integer.valueOf(strUid);

        User user = userService.getUserById(ingUid);

        return user == null ? "user don't exist" : user.toString();
    }

    @RequestMapping(value= "/findUserByInvited", method= RequestMethod.POST, produces="application/json;charset=utf-8")
    @ResponseBody
    public String findUserByInvited(@RequestBody HashMap<String, Object> paramMap){

        Object obUid = paramMap.get("uid");
        String strUid = String .valueOf(obUid);

        Integer ingUid = Integer.valueOf(strUid);
        return JSONObject.toJSONString(userService.findUserExtByUid(ingUid));
    }


}
