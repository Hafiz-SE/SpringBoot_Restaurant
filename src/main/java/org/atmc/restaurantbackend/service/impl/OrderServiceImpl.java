package org.atmc.restaurantbackend.service.impl;

import org.atmc.restaurantbackend.io.entity.OrderEntity;
import org.atmc.restaurantbackend.repository.OrderRepository;
import org.atmc.restaurantbackend.service.OrderService;
import org.atmc.restaurantbackend.shared.dto.OrderDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public void createOrder(OrderDto orderdto) {
		OrderEntity orderentity = new OrderEntity();
		BeanUtils.copyProperties(orderdto, orderentity);
		orderRepository.save(orderentity);
	}

}
