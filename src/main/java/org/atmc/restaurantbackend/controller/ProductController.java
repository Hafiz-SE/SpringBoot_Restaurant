package org.atmc.restaurantbackend.controller;

import org.atmc.restaurantbackend.response.ProductResponse;
import org.atmc.restaurantbackend.service.ProductService;
import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.atmc.restaurantbackend.ui.requests.ProductCreateRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin()
@RestController
@RequestMapping("Products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	public ProductResponse createProduct(@RequestParam String pName, @RequestParam String pPrice, @RequestParam int pStock, @RequestParam int pCategory, @RequestPart(required = false) MultipartFile image) throws Exception {
		ProductCreateRequestModel productCreateRequestModel= new ProductCreateRequestModel(pName,pPrice,pStock,pCategory);
		ProductResponse productResponse = new ProductResponse();
		ProductDto productDto = new ProductDto();
		
		BeanUtils.copyProperties(productCreateRequestModel, productDto);
		
		ProductDto returnDto = productService.CreateProduct(productDto,image);
		BeanUtils.copyProperties(returnDto, productResponse);
		return productResponse;
		
	}
	
	
}
