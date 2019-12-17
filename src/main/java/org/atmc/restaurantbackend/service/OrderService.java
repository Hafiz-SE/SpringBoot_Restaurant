package org.atmc.restaurantbackend.service;

import java.util.List;

import org.atmc.restaurantbackend.shared.dto.OrderDto;

public interface OrderService {
	void createOrder(OrderDto order);
	List<OrderDto> getOrders ();
}
