package com.husam.oneshop.service.cart;

import com.husam.oneshop.model.CartItem;

public interface ICartItemService {
    void addCartItem(Long cartId, Long productId, Integer quantity);
    void removeCartItem(Long cartId, Long productId);
    void updateCartItem(Long cartId, Long productId, Integer quantity);
    CartItem getCartItem(Long cartId, Long productId);
}
