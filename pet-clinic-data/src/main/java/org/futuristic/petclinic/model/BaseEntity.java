/**
 * 
 */
package org.futuristic.petclinic.model;

import java.io.Serializable;

/**
 * @author 609734641
 *
 */
public class BaseEntity implements Serializable {

	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = -8851100787640061164L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
