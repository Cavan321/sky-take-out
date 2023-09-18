package com.sky.service;

import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

/**
 * @author Cavan
 * @date 2023-09-18
 * @qq 2069543852
 */
public interface DishService {
    /**
     * 菜品分页查询
     * @param dishPageQueryDTO:
     * @return PageResult
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
