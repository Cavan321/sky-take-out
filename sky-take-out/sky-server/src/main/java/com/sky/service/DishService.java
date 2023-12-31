package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

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

    /**
     * 根据id查询菜品和对应的口味数据
     * @param id
     * @return DishVO
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修改菜品基本信息和对应的口味信息
     * @param dishDTO
     * @return void
     */
    void updateWithFlavor(DishDTO dishDTO);

   /**
    * 菜品起售停售
    * @param status:
    * @param id:
    * @return void
    */
    void startOrStop(Integer status, Long id);

    /**
     * 条件查询菜品和口味
     * @param dish:
     * @return List<DishVO>
     */
    List<DishVO> listWithFlavor(Dish dish);

    /**
     * 根据分类id查询菜品
     * @param categoryId:
     * @return List<Dish>
     */
    List<Dish> list(Long categoryId);
}
