package com.fissionlabs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fissionlabs.model.Owner;

public interface  OwnerRepository extends CrudRepository<Owner, Integer> {
	
	public List<Owner> findByEmail(String email);

}
