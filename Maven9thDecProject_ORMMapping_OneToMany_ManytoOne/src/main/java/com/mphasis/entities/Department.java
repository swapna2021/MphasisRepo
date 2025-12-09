package com.mphasis.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="dept_inh")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String dname;
	@OneToMany(mappedBy = "dept",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			orphanRemoval = false
			)
	private List<Employee> empList=new ArrayList<Employee>();
	
	public Department(String dname) {
		this.dname=dname;
	}
	
	public void addEmployee(Employee e) {
		empList.add(e);
		e.setDept(this);
	}
	
//	public void removeEmployee(Employee e) {
//		empList.remove(e);
//		e.setDept(null);
//	}

}
