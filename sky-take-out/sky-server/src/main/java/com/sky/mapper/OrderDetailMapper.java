package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 根据订单id查询订单明细
     * @param orderId:
     * @return List<OrderDetail>
     */
    @Select("select * from order_detail where order_id = #{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);
}
