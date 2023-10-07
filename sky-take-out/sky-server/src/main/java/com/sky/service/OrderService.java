package com.sky.service;

import com.sky.dto.*;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

/**
 * @author Cavan
 * @date 2023-10-02
 * @qq 2069543852
 */
public interface OrderService {
    /**
     * 用户下单
     * @param ordersSubmitDTO:
     * @return OrderSubmitVO
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     * @param ordersPaymentDTO:
     * @return OrderPaymentVO
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO);

    /**
     * 用户端订单分页查询
     * @param page:
     * @param pageSize:
     * @param status:
     * @return PageResult
     */
    PageResult pageQueryUser(int page, int pageSize, Integer status);

    /**
     * 查询订单详情
     * @param id:
     * @return OrderVO
     */
    OrderVO details(Long id);

    /**
     * 用户取消订单
     * @param id:
     * @return void
     */
    void userCancelById(Long id) throws Exception;

    /**
     * 根据订单号修改订单信息
     * @param orderNumber:
     * @return void
     */
    void paySuccess(String orderNumber);

    /**
     * 再来一单
     * @param id:
     * @return void
     */
    void repetition(Long id);

    /**
     * 条件搜索订单
     * @param ordersPageQueryDTO:
     * @return PageResult
     */
    PageResult conditionSearch(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 各个状态的订单数量统计
     * @param :
     * @return OrderStatisticsVO
     */
    OrderStatisticsVO statistics();

    /**
     * 接单
     * @param ordersConfirmDTO:
     * @return void
     */
    void confirm(OrdersConfirmDTO ordersConfirmDTO);

    /**
     * 拒单
     * @param ordersRejectionDTO:
     * @return void
     */
    void rejection(OrdersRejectionDTO ordersRejectionDTO) throws Exception;

    /**
     * 商家取消订单
     * @param ordersCancelDTO:  
     * @return void
     */
    void cancel(OrdersCancelDTO ordersCancelDTO) throws Exception;

    /**
     * 派送订单
     * @param id:
     * @return void
     */
    void delivery(Long id);

    /**
     * 完成订单
     * @param id:
     * @return void
     */
    void complete(Long id);

    /**
     * 用户催单
     * @param id:
     * @return void
     */
    void reminder(Long id);
}
