package com.mphasis;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
	
	private int stdId;
	private String stdName;
	private double marks;
	
	 //static String collegeName="abc college";
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(marks, stdId, stdName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks) && stdId == other.stdId
				&& Objects.equals(stdName, other.stdName);
	}

	
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	 static class College{	
		private String colName;
		private String location;
		private long colCode;
		
		static void display() {
			System.out.println("from inner class static method");
		}
		
		void sayHello() {
			System.out.println("hello");
		}
		
	}
	
	
}
