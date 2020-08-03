package com.lolo.service.impl;

import com.lolo.dao.entity.User;
import com.lolo.dao.mapper.UserMapper;
import com.lolo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2020/8/2.
 */
@Service
public class UserSeviceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer uid) {
        return userMapper.selectUserById(uid);
    }
}
