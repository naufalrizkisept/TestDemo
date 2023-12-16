package org.project.service;

import java.util.List;

import org.project.dto.UserDto;

public interface UserSvc {
	List<UserDto> getAllUsers();
	UserDto getUserById(Long id);
	UserDto saveUser(UserDto user);
	UserDto updateUser(Long id, UserDto user);
	void deleteUser(Long id);
}
