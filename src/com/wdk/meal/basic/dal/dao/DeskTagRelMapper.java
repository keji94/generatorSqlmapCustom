package com.wdk.meal.basic.dal.dao;

import com.wdk.meal.basic.dal.dataobject.DeskTagRel;
import com.wdk.meal.basic.dal.dataobject.DeskTagRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskTagRelMapper {
    int countByExample(DeskTagRelExample example);

    int deleteByExample(DeskTagRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeskTagRel record);

    int insertSelective(DeskTagRel record);

    List<DeskTagRel> selectByExample(DeskTagRelExample example);

    DeskTagRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeskTagRel record, @Param("example") DeskTagRelExample example);

    int updateByExample(@Param("record") DeskTagRel record, @Param("example") DeskTagRelExample example);

    int updateByPrimaryKeySelective(DeskTagRel record);

    int updateByPrimaryKey(DeskTagRel record);
}