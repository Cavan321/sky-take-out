package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @author Cavan
 * @date 2023-10-01
 * @qq 2069543852
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO:
     * @return void
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @param :
     * @return List<ShoppingCart>
     */
    List<ShoppingCart> showShoppingCart();
}
