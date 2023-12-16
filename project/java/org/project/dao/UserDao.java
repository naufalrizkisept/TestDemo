package org.project.dao;

import java.util.List;

import org.project.entity.UserEntity;

public interface UserDao {

	List<UserEntity> findAll();
	UserEntity findById(Long id);
	UserEntity save(UserEntity user);
	UserEntity update(Long id, UserEntity user);
	void delete(Long id);
}
