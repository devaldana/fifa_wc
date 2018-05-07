package co.edu.unbosque.progii.fifa.persistence.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

	private Integer id;
	

	public  void setId(Integer id) {
		this.id = id;
	}

	public  Integer getId() {
		return id;
	}

	public  boolean isNew() {
		return (this.id == null);
	}

}