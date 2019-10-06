package org.futuristic.petclinic.service;

import java.util.Set;

import org.futuristic.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
