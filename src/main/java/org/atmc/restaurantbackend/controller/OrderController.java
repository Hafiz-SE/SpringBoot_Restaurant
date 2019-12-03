package org.atmc.restaurantbackend.controller;

import org.atmc.restaurantbackend.service.OrderService;
import org.atmc.restaurantbackend.shared.dto.OrderDto;
import org.atmc.restaurantbackend.ui.requests.OrderCreateRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping
	public String createOrder (@RequestBody OrderCreateRequestModel orderRequest) {
		OrderDto reqDto = new OrderDto();
		BeanUtils.copyProperties(orderRequest, reqDto);
		orderService.createOrder(reqDto);
		return ("Order Created");
	}
	
	
}
