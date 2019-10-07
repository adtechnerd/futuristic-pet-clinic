package org.futuristic.petclinic.service;

import org.futuristic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
