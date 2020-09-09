package com.lolo.service;

import com.lolo.dao.entity.User;
import com.lolo.dao.entity.UserExt;

import java.util.Map;

/**
 * Created by admin on 2020/8/2.
 */
public interface UserService {

    User getUserById (Integer uid);

    Map<String,UserExt> findUserExtByUid (Integer uid);
}
