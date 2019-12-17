package org.atmc.restaurantbackend.service;

import org.atmc.restaurantbackend.shared.dto.UserDto;

public interface UserService{
	UserDto createUser (UserDto user);
	UserDto getUser(String email);
}
