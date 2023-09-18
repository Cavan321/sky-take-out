package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
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
}
