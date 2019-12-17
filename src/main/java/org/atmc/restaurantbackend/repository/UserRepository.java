package org.atmc.restaurantbackend.repository;


import org.atmc.restaurantbackend.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByuEmail(String email);
	UserEntity findByuId(String uId);
}
