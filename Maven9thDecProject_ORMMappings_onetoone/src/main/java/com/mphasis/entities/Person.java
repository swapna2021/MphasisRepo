package com.mphasis.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
@Entity
@ToString
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min=3,message="Person name must be min of 3 chars")
	@NotNull
	private String name;
	@Pattern(regexp = "[6789][0-9]{9}" ,message="Please enter valid mobile number,"
			+ "Mobile number must start with either "
			+ "6,7,8,or 9 with exact length of 10 digits")
	private String mobile;
	@Email
	private String email;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
	private Passport passport;
	
	public Person(String name,String mobile,String email) {
		this.name=name;
		this.mobile=mobile;
		this.email=email;
		
	}
	
	public void setPassport(Passport passport) {
		this.passport=passport;
		passport.setPerson(this);
	}
	
	
}
