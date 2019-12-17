package org.atmc.restaurantbackend.controller;

import org.atmc.restaurantbackend.response.UserResponse;
import org.atmc.restaurantbackend.service.UserService;
import org.atmc.restaurantbackend.shared.dto.UserDto;
import org.atmc.restaurantbackend.ui.requests.UserCreateRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	UserResponse createUser(@RequestBody UserCreateRequestModel userCreateRequestModel) {
		
		UserResponse returnValue = new UserResponse();
		UserDto userdto = new UserDto();
		BeanUtils.copyProperties(userCreateRequestModel, userdto);
		
		UserDto createdUser = userService.createUser(userdto);
		BeanUtils.copyProperties(createdUser, returnValue);
		return returnValue;
	}
	
	

}
