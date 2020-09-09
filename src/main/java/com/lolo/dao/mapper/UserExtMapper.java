package com.lolo.dao.mapper;

import com.lolo.dao.entity.UserExt;
import com.lolo.dao.entity.UserExtExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserExtMapper {
    int countByExample(UserExtExample example);

    int deleteByExample(UserExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserExt record);

    int insertSelective(UserExt record);

    UserExt selectOnlyOneByExample(UserExtExample example);

    List<UserExt> selectByExample(UserExtExample example);

    UserExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserExt record, @Param("example") UserExtExample example);

    int updateByExample(@Param("record") UserExt record, @Param("example") UserExtExample example);

    int updateByPrimaryKeySelective(UserExt record);

    int updateByPrimaryKey(UserExt record);
    /**
     * 获取用户、邀请码和被邀请码信息--邀请返还模式
     * @return
     */
	List<Map<String, Object>> getUserAndInviteCode(@Param("companyId") Integer companyId, @Param("uid") Integer uid,
                                                   @Param("limitStart") Integer limitStart, @Param("limitEnd") Integer limitEnd);
}