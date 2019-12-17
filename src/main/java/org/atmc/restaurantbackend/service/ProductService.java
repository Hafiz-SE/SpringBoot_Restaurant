package org.atmc.restaurantbackend.service;

import java.util.List;

import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
	ProductDto CreateProduct(ProductDto productDto,MultipartFile imageFile) throws Exception;
	List<ProductDto> GetProductByCategory(int category);
}
