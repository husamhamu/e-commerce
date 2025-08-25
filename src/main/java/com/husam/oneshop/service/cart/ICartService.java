package com.husam.oneshop.service.cart;

import java.math.BigDecimal;

import com.husam.oneshop.model.Cart;
import com.husam.oneshop.model.User;

public interface ICartService {
    Cart initializeNewCart(User user);
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart getCartByUserId(Long userId);
}
