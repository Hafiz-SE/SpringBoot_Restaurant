package org.atmc.restaurantbackend.repository;

import org.atmc.restaurantbackend.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
