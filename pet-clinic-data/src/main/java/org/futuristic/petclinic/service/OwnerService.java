package org.futuristic.petclinic.service;

import java.util.Set;

import org.futuristic.petclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	
	Owner save(Owner owner);
	
	Owner findById(Long id);
	
	Set<Owner> findAll();
}
