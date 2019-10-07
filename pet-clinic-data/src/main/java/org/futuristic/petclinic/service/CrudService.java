/**
 * 
 */
package org.futuristic.petclinic.service;

import java.util.Set;

/**
 * @author Aditya Ajmera
 *
 */
public interface CrudService<T, ID> {
	Set<T> findAll();

	T findById(Long id);

	T save(T obj);
	
	void delete(T obj);
	
	void deleteById(Long id);
}
