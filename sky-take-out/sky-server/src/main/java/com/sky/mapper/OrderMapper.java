package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Cavan
 * @date 2023-10-02
 * @qq 2069543852
 */
@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order:
     * @return void
     */
    void insert(Orders order);
}
