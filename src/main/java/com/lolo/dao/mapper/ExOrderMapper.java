package com.lolo.dao.mapper;


import com.lolo.dao.entity.ExOrder;
import com.lolo.dao.entity.ExOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 42064
*/
public interface ExOrderMapper {
    int countByExample(ExOrderExample example);

    int deleteByExample(ExOrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(ExOrder record);

    int insertSelective(ExOrder record);

    ExOrder selectOnlyOneByExample(ExOrderExample example);

    List<ExOrder> selectByExample(ExOrderExample example);

    ExOrder selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") ExOrder record, @Param("example") ExOrderExample example);

    int updateByExample(@Param("record") ExOrder record, @Param("example") ExOrderExample example);

    int updateByPrimaryKeySelective(ExOrder record);

    int updateByPrimaryKey(ExOrder record);
}