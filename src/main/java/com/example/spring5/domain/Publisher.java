package com.example.spring5.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Publisher {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ids;
	
	private String name;
	
	private String addressLine1;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	@OneToMany
	@JoinColumn(name="publisher_id")
	private Set<Book> books=new HashSet();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(ids, other.ids);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ids);
	}

	public Publisher() {
		super();
	}

	public Publisher(Long ids, String name, String addressLine1, String city, String state, String zipcode) {
		super();
		this.ids = ids;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.books=books;
	}


	
	
}
