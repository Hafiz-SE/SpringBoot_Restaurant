package org.atmc.restaurantbackend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.atmc.restaurantbackend.io.entity.OrderEntity;
import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.atmc.restaurantbackend.repository.OrderRepository;
import org.atmc.restaurantbackend.response.OrderResponse;
import org.atmc.restaurantbackend.service.OrderService;
import org.atmc.restaurantbackend.shared.dto.OrderDto;
import org.atmc.restaurantbackend.shared.dto.ProductDto;
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

	@Override
	public List<OrderDto> getOrders() {
		List<OrderEntity> orders = orderRepository.findAll();
		List<OrderDto> orderdtos = new ArrayList<>();
		for(OrderEntity source: orders) {
			OrderDto target = new OrderDto();
			BeanUtils.copyProperties(source, target);
			orderdtos.add(target);
		}
		return orderdtos;
		
	}
	
}
