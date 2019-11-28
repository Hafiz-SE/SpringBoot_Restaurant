package org.atmc.restaurantbackend.service;

import org.atmc.restaurantbackend.shared.dto.OrderDto;

public interface OrderService {
	void createOrder(OrderDto order);
}
