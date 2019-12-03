package org.atmc.restaurantbackend.service;

import org.atmc.restaurantbackend.shared.dto.ProductDto;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
	ProductDto CreateProduct(ProductDto productDto,MultipartFile imageFile) throws Exception;
}
