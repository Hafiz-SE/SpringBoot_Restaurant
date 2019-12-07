package org.atmc.restaurantbackend.service;

import org.atmc.restaurantbackend.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	UserDto createUser (UserDto user);
}
