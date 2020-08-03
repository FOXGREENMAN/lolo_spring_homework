package com.lolo.dao.mapper;

import com.chainup.common.dao.SqlMapper;
import com.chainup.config.entity.Trade;
import com.chainup.config.entity.TradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 42064
*/
public interface TradeMapper extends SqlMapper {
    int countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Integer tradeid);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectOnlyOneByExample(TradeExample example);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Integer tradeid);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}