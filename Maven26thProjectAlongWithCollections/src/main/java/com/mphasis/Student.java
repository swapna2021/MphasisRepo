package com.mphasis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student implements Comparable<Student> {
	
	private int sid;
	private String sname;
	private int age;
	private double marks;
	private String city;
//	@Override
//	public int compareTo(Student o) {
//		
//		return (int)(this.marks-o.marks);
//	}
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.sname.compareTo(o.sname);
	}
//	
	
//	@Override
//	public int compareTo(Student s) {
//		
//		return this.sid-s.sid;
//	}
	
	
	

}
