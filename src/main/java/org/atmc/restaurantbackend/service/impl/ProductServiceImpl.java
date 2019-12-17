package org.atmc.restaurantbackend.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.atmc.restaurantbackend.repository.ProductRepository;
import org.atmc.restaurantbackend.service.ProductService;
import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public ProductDto CreateProduct(ProductDto productDto, MultipartFile imageFile) throws Exception {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(productDto, productEntity);
		String folder = "/photos/";
		byte[] bytes = imageFile.getBytes();
		Path path = Paths.get(folder+imageFile.getOriginalFilename());
		Files.write(path, bytes);
		
		productEntity.setpImg(folder+imageFile.getOriginalFilename());
		
		ProductEntity storedProductDetails = productRepository.save(productEntity);
		
		ProductDto returnDto = new ProductDto();
		BeanUtils.copyProperties(storedProductDetails, returnDto);
		return returnDto;
	}

	@Override
	public List<ProductDto> GetProductByCategory(int category) {
		
		List<ProductEntity> products=productRepository.findBypCategory(category);

		List<ProductDto> productdtos = new ArrayList<ProductDto> ();
		
		for (ProductEntity source: products ) {
	        ProductDto target= new ProductDto();
	        BeanUtils.copyProperties(source , target);
	        productdtos.add(target);
	     }
		return productdtos;
	}
	
	
	




	
	
}
