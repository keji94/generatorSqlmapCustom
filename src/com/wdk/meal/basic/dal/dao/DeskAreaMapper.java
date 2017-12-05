package com.wdk.meal.basic.dal.dao;

import com.wdk.meal.basic.dal.dataobject.DeskArea;
import com.wdk.meal.basic.dal.dataobject.DeskAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskAreaMapper {
    int countByExample(DeskAreaExample example);

    int deleteByExample(DeskAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeskArea record);

    int insertSelective(DeskArea record);

    List<DeskArea> selectByExample(DeskAreaExample example);

    DeskArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeskArea record, @Param("example") DeskAreaExample example);

    int updateByExample(@Param("record") DeskArea record, @Param("example") DeskAreaExample example);

    int updateByPrimaryKeySelective(DeskArea record);

    int updateByPrimaryKey(DeskArea record);
}