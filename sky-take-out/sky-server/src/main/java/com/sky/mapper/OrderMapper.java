package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.GoodsSalesDTO;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

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

    /**
     * 根据用户id和订单号更新订单
     * @param orders:
     * @return void
     */
    void updateByUserIdAndNumber(Orders orders);


    /**
     * 根据状态统计订单数量
     * @param status:
     * @return Integer
     */
    @Select("select count(id) from orders where status = #{status}")
    Integer countStatus(Integer status);

    /**
     * 根据订单状态和下单时间查询订单
     * @param status:
     * @param orderTime:
     * @return List<Orders>
     */
    @Select("select * from orders where status = #{status} and order_time < #{orderTime}")
    List<Orders> getByStatusAndOrderTimeLT(Integer status, LocalDateTime orderTime);

    /**
     * 根据动态条件统计营业额
     * @param map:
     * @return Double
     */
    Double sumByMap(Map map);

    /**
     * 根据动态条件统计订单数量
     * @param map:
     * @return Integer
     */
    Integer countByMap(Map map);

    /**
     * 查询商品销量排名
     * @param begin:
     * @param end:
     * @return List<GoodsSalesDTO>
     */
    List<GoodsSalesDTO> getSalesTop10(LocalDateTime begin, LocalDateTime end);
}
