package org.atmc.restaurantbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.atmc.restaurantbackend.repository.ProductRepository;
import org.atmc.restaurantbackend.response.OrderResponse;
import org.atmc.restaurantbackend.response.ProductResponse;
import org.atmc.restaurantbackend.service.OrderService;
import org.atmc.restaurantbackend.shared.dto.OrderDto;
import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.atmc.restaurantbackend.ui.requests.OrderCreateRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@Autowired 
	ProductRepository productRepository;
	
	@PostMapping
	public String createOrder (@RequestBody OrderCreateRequestModel orderRequest) {
		OrderDto reqDto = new OrderDto();
		BeanUtils.copyProperties(orderRequest, reqDto);
		orderService.createOrder(reqDto);
		return ("Order Created");
	}
	
	@GetMapping 
	public List<OrderResponse> getOrders (){
		ProductEntity productEntity = new ProductEntity();
		int i;
		
		List <OrderDto> orderdtos = orderService.getOrders();
		List<OrderResponse> ordresponses = new ArrayList<>();
		for (OrderDto source : orderdtos) {
			OrderResponse target = new OrderResponse();
			BeanUtils.copyProperties(source, target);
			ordresponses.add(target);
		}
		System.out.println(ordresponses.size());

		
		for (i = 0 ; i < ordresponses.size() ; i++) {
			productEntity = productRepository.findById(Integer.valueOf(orderdtos.get(i).getoProductId()));
			if(productEntity != null) {		
				ordresponses.get(i).setoProductId(productEntity.getpName());
			}
			else  {
				System.out.println("Product Entity Null");

			}

		}
		return ordresponses;
	}
	
	
}
