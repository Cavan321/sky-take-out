package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Cavan
 * @date 2023-09-18
 * @qq 2069543852
 */
@Mapper
public interface DishFlavorMapper {


    /**
     * 批量插入口味数据
     * @param flavors
     * @return void
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除对应的口味数据
     * @param dishId
     * @return void
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}
