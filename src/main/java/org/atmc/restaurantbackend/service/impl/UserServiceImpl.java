package org.atmc.restaurantbackend.service.impl;

import org.atmc.restaurantbackend.io.entity.UserEntity;
import org.atmc.restaurantbackend.repository.UserRepository;
import org.atmc.restaurantbackend.service.UserService;
import org.atmc.restaurantbackend.shared.dto.UserDto;
import org.atmc.restaurantbackend.shared.utils.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	Utils utils;

	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setuId(utils.generateUserId(20));

		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

}
