package com.fissionlabs.repository;

import org.springframework.data.repository.CrudRepository;

import com.fissionlabs.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	public User findByEmail(String email);


}
