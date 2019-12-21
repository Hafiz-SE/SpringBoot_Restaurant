package org.atmc.restaurantbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.atmc.restaurantbackend.response.ProductResponse;
import org.atmc.restaurantbackend.service.ProductService;
import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.atmc.restaurantbackend.ui.requests.ProductCreateRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{category}")
	public List<ProductResponse> getProductsByCategory(@PathVariable("category") int cat){
		List<ProductDto> productdtos =  productService.GetProductByCategory(cat);
		List<ProductResponse> proresponses = new ArrayList<ProductResponse>();
		for (ProductDto source: productdtos ) {
	        ProductResponse target= new ProductResponse();
	        BeanUtils.copyProperties(source , target);
	        proresponses.add(target);
	     }
		return proresponses;
	}
	


	@PostMapping
	public ProductResponse createProduct(@RequestParam String pName,@RequestParam String pDescription, @RequestParam String pPrice, @RequestParam int pStock, @RequestParam int pCategory, @RequestPart(required = false) MultipartFile image ) throws Exception {
		ProductCreateRequestModel productCreateRequestModel= new ProductCreateRequestModel(pName,pDescription,pPrice,pStock,pCategory);
		ProductResponse productResponse = new ProductResponse();
		ProductDto productDto = new ProductDto();
		
		BeanUtils.copyProperties(productCreateRequestModel, productDto);
		
		ProductDto returnDto = productService.CreateProduct(productDto,image);
		BeanUtils.copyProperties(returnDto, productResponse);
		return productResponse;
		
	}
	

	
	
}
