package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Cavan
 * @date 2023-10-02
 * @qq 2069543852
 */
@Mapper
public interface OrderDetailMapper {


    /**
     * 批量插入订单明细数据
     * @param orderDetails:
     * @return void
     */
    void insertBatch(List<OrderDetail> orderDetails);
}
