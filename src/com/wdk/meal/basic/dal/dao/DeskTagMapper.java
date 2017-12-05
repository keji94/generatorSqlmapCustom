package com.wdk.meal.basic.dal.dao;

import com.wdk.meal.basic.dal.dataobject.DeskTag;
import com.wdk.meal.basic.dal.dataobject.DeskTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskTagMapper {
    int countByExample(DeskTagExample example);

    int deleteByExample(DeskTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeskTag record);

    int insertSelective(DeskTag record);

    List<DeskTag> selectByExample(DeskTagExample example);

    DeskTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeskTag record, @Param("example") DeskTagExample example);

    int updateByExample(@Param("record") DeskTag record, @Param("example") DeskTagExample example);

    int updateByPrimaryKeySelective(DeskTag record);

    int updateByPrimaryKey(DeskTag record);
}