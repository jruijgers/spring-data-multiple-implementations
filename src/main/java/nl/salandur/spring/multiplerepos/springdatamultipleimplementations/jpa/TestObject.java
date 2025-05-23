package nl.salandur.spring.multiplerepos.springdatamultipleimplementations.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestObject {
	@Id
	public Long id;
	public String name;
}
