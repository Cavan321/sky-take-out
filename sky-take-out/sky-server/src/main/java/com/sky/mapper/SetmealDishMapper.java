package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Cavan
 * @date 2023-09-18
 * @qq 2069543852
 */
@Mapper
public interface SetmealDishMapper {


    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return List<Long>
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
