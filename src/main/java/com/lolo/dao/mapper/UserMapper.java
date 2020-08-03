package com.lolo.dao.mapper;

import com.lolo.dao.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2020/8/2.
 */
@Repository
public interface UserMapper {

    User selectUserById (@Param("uid") Integer uid);
    User selectUserByIda (@Param("uid") Integer uid);
}
