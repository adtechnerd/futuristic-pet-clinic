/**
 * 
 */
package org.futuristic.petclinic.model;

/**
 * @author Aditya Ajmera
 *
 */
public class Person extends BaseEntity{
	
	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = 336753935118600817L;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
