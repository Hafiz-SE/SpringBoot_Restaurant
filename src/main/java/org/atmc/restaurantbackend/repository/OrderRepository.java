package org.atmc.restaurantbackend.repository;

import org.atmc.restaurantbackend.io.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

}
