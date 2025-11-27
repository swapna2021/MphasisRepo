package com.mphasis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private String desg;
	private String dept;

}
