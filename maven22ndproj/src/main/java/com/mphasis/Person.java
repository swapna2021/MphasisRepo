package com.mphasis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	private String name;
	private int id;
	private int age;
	
	public void checkEligibility() throws AgeNOtSufficientException {
		if(this.age>18)
			System.out.println("person is eligible to cast vote");
		else
			throw new AgeNOtSufficientException("Person age is less than 18");
	}
}
