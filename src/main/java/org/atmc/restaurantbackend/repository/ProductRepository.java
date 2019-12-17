package org.atmc.restaurantbackend.repository;

import java.util.List;

import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
	List<ProductEntity> findBypCategory(int category);
	
	ProductEntity findById(long id);
}
