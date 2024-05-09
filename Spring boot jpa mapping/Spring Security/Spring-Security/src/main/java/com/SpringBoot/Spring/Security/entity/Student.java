package com.SpringBoot.Spring.Security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="tbl_student",
uniqueConstraints = @UniqueConstraint(
		 name ="emailid_unique",
		 columnNames="email_address"))

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name="email_address",
			nullable=false)
	private String email;
	@Embedded  // we are using embeddable cause we dont want to create another table for guardian, but we want like this table will be merged with our students table so for that we are using embeddable
	private Guardian guardian;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	} 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Guardian getGuardian() {
		return guardian;
	}
	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", guardian=" + guardian + "]";
	}
	public Student(Long studentId, String firstName, String lastName, String email, Guardian guardian) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.guardian = guardian;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
