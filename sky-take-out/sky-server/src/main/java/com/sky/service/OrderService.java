package com.sky.service;

import com.sky.dto.OrdersPaymentDTO;
import com.sky.dto.OrdersSubmitDTO;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
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
}
