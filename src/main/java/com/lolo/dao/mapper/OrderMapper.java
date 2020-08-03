package com.lolo.dao.mapper;

import com.lolo.dao.entity.Order;
import com.lolo.dao.entity.OrderExample;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author 42064
*/
public interface OrderMapper  {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    String insert(Map<String,String> paraMa);

    int insertSelective(Order record);

    Order selectOnlyOneByExample(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}