package com.wdk.meal.basic.dal.dao;

import com.wdk.meal.basic.dal.dataobject.DeskSpecSkuRel;
import com.wdk.meal.basic.dal.dataobject.DeskSpecSkuRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskSpecSkuRelMapper {
    int countByExample(DeskSpecSkuRelExample example);

    int deleteByExample(DeskSpecSkuRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeskSpecSkuRel record);

    int insertSelective(DeskSpecSkuRel record);

    List<DeskSpecSkuRel> selectByExample(DeskSpecSkuRelExample example);

    DeskSpecSkuRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeskSpecSkuRel record, @Param("example") DeskSpecSkuRelExample example);

    int updateByExample(@Param("record") DeskSpecSkuRel record, @Param("example") DeskSpecSkuRelExample example);

    int updateByPrimaryKeySelective(DeskSpecSkuRel record);

    int updateByPrimaryKey(DeskSpecSkuRel record);
}