/**
 * 
 */
package org.futuristic.petclinic.model;

/**
 * @author Aditya Ajmera
 *
 */
public class PetType extends BaseEntity {

	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = -4611092675060681932L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
