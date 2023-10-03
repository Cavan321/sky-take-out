package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 分页条件查询并按下单时间排序
     * @param ordersPageQueryDTO:
     * @return Page<Orders>
     */
    Page<Orders> pageQuery(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 根据id查询订单信息
     * @param id:
     * @return Orders
     */
    @Select("select * from orders where id = #{id}")
    Orders getById(Long id);

    /**
     * 修改订单信息
     * @param orders:  
     * @return void
     */
    void update(Orders orders);

    void updateByUserIdAndNumber(Orders orders);


}
