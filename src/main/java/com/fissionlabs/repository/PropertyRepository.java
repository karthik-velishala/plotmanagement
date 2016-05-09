package com.fissionlabs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fissionlabs.model.Owner;
import com.fissionlabs.model.Property;

public interface PropertyRepository extends CrudRepository<Property,Integer> {
	public List<Property> findByCity(String city);
	public List<Property> findByOwner(Owner owner);
}
