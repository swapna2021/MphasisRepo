package com.mphasis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="stud_tab")

@NamedQueries({@NamedQuery(name="Student.findAll",query = "From Student"),
@NamedQuery(name="Student.findByCourse",query="From Student where course=:course"),
@NamedQuery(name="Student.count",query = "select count(*) from Student"),
@NamedQuery(name="Student.groupByCourse",query="select course,count(course) from Student group by course")
})
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String course;
	

}
