package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

/**
 * @author Cavan
 * @date 2023-09-18
 * @qq 2069543852
 */
public interface DishService {
    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return PageResult
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 新增菜品
     * @param dishDTO
     * @return void
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 批量删除菜品
     * @param ids
     * @return void
     */
    void deleteBatch(List<Long> ids);
}
