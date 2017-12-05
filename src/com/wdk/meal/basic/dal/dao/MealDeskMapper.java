package com.wdk.meal.basic.dal.dao;

import com.wdk.meal.basic.dal.dataobject.MealDesk;
import com.wdk.meal.basic.dal.dataobject.MealDeskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MealDeskMapper {
    int countByExample(MealDeskExample example);

    int deleteByExample(MealDeskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MealDesk record);

    int insertSelective(MealDesk record);

    List<MealDesk> selectByExample(MealDeskExample example);

    MealDesk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MealDesk record, @Param("example") MealDeskExample example);

    int updateByExample(@Param("record") MealDesk record, @Param("example") MealDeskExample example);

    int updateByPrimaryKeySelective(MealDesk record);

    int updateByPrimaryKey(MealDesk record);
}