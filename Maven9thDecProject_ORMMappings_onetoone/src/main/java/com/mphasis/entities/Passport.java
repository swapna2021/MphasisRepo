package com.mphasis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "person")
@Entity

public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min=8,message="min of 8 length")
	private String passportNumber;
	@OneToOne
	@JoinColumn(name="person_id",referencedColumnName = "id")
	private Person person;
	public Passport( @Size(min = 8, message = "min of 8 length") String passportNumber) {
		super();
		
		this.passportNumber = passportNumber;
	}
	
	

	
	

}
