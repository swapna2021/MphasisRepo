package com.mphasis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@Data
@ToString(exclude = "dept")
@Entity
@Table(name="emptable_inh")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	@ManyToOne
	@JoinColumn(name="did",referencedColumnName = "did")
	private Department dept;
	
	public Employee(String ename) {
		this.ename=ename;
	}

}
