package org.atmc.restaurantbackend.repository;

import org.atmc.restaurantbackend.io.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
