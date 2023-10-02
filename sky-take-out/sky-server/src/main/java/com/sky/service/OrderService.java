package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

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
}
