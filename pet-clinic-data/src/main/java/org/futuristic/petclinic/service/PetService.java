package org.futuristic.petclinic.service;

import java.util.Set;

import org.futuristic.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
