package com.SpringBoot.Spring.Security.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Teacher {

	@Id
	@SequenceGenerator(
			// we have randomly take this name teacher_sequence
			name = "teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
	private Long teacherId;
	private String firstName;
	private String lastName;

	/*
	 * ONE TO MANY RELATION SHIP
	 * 
	 * 
//	 * // When possible so we have to use many to one relationship not one to many many to one relationship defined in course class
	 * 
	 * 
	 * //when we creating one to many mapping on that time we want two primary keys
	 * so we are passing teacher reference inside join column so the column will be
	 * created inside course table
	 * 
	 * @OneToMany(cascade = CascadeType.ALL) Entity relationships often depend on
	 * the existence of another entity, for example the Person–Address relationship.
	 * Without the Person, the Address entity doesn’t have any meaning of its own.
	 * When we delete the Person entity, our Address entity should also get deleted.
	 * Cascading is the way to achieve this. When we perform some action on the
	 * target entity, the same action will be applied to the associated entity.
	 * 
	 * @JoinColumn(name = "teacher_id", //unidirectional mapping
	 * referencedColumnName = "teacherId")
	 */

	
	//private List<Course> courses;

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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

	/*
	 * public List<Course> getCourses() { return courses; }
	 * 
	 * public void setCourses(List<Course> courses) { this.courses = courses; }
	 */
	/*
	 * @Override public String toString() { return "Teacher [teacherId=" + teacherId
	 * + ", firstName=" + firstName + ", lastName=" + lastName + ", courses=" +
	 * courses + "]"; }
	 */

	public Teacher(Long teacherId, String firstName, String lastName, List<Course> courses) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.courses = courses;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
