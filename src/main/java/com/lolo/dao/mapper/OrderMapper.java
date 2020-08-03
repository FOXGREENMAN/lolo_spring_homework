package com.lolo.dao.mapper;

import com.chainup.common.dao.SqlMapper;
import com.chainup.config.entity.Order;
import com.chainup.config.entity.OrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 42064
*/
public interface OrderMapper extends SqlMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectOnlyOneByExample(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}