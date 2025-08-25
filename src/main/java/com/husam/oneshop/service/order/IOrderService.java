package com.husam.oneshop.service.order;

import java.util.List;

import com.husam.oneshop.dto.OrderDto;
import com.husam.oneshop.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}