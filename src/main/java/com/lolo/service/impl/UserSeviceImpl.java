package com.lolo.service.impl;

import com.lolo.dao.entity.User;
import com.lolo.dao.entity.UserExt;
import com.lolo.dao.entity.UserExtExample;
import com.lolo.dao.mapper.UserExtMapper;
import com.lolo.dao.mapper.UserMapper;
import com.lolo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2020/8/2.
 */
@Service
public class UserSeviceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserExtMapper userExtMapper;

    @Override
    public User getUserById(Integer uid) {
        return userMapper.selectUserById(uid);
    }

    @Override
    public Map<String, UserExt> findUserExtByUid(Integer uid) {

        UserExtExample userExtExample = new UserExtExample();
        UserExtExample.Criteria criteria = userExtExample.createCriteria();
        criteria.andUidEqualTo(uid);

        List<UserExt> list = userExtMapper.selectByExample(userExtExample);

        return  getFiveUserExt(list.get(0));
    }

    public Map<String, UserExt> getFiveUserExt(UserExt foxUserExt){

        String invCode = "";
        Map<String, UserExt> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {

            if(i == 0){
                // 初始用户, 最子级
                invCode = foxUserExt.getInvitedCode();
                map.put("user",foxUserExt);
            }
            UserExt tempExt = getUserExtByInvitedCode(invCode);

            if(tempExt == null){
                System.out.println("当前邀请码无法获取到上一级; invitedCode:"+invCode);
                break;
            }
            map.put("level"+(i+1),tempExt);
            invCode = tempExt.getInvitedCode();

        }
        return map;
    }

    private UserExt getUserExtByInvitedCode(String invitedCode){

        UserExtExample userExtExample = new UserExtExample();
        UserExtExample.Criteria criteria = userExtExample.createCriteria();

        criteria.andInviteCodeEqualTo(invitedCode);

        List<UserExt> list = userExtMapper.selectByExample(userExtExample);

        return list.size() > 0 ? list.get(0) : null;
    }
}
