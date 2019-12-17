package org.atmc.restaurantbackend.service.impl;

import java.util.ArrayList;

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
		//UserEntity storedUser = userRepository.findByUEmail(user.getuEmail());
		//if(storedUser !=null) throw new RuntimeException("EMAIL EXISTS!");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setuId(utils.generateUserId(20));

		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

	
	
	@Override
	public UserDto getUser(String email) {
		UserEntity storedUser = userRepository.findByuEmail(email);
		if(storedUser == null) {throw new RuntimeException("User is not in database");}
		
		UserDto returnVal = new UserDto();
		BeanUtils.copyProperties(storedUser, returnVal);
		return returnVal;
	}

	

}
