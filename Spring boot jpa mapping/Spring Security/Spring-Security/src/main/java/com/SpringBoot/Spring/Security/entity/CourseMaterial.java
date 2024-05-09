package com.SpringBoot.Spring.Security.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CourseMaterial {
	@Id
	@SequenceGenerator(
			name="course_material_sequence",
			sequenceName="course_material_sequence",
	        allocationSize=1
	        )
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	                generator = "course_material_sequence")
	private Long courseMaterialId;
	private String url;
	
	
	//if we are creating one to one mapping so on that time where we creating one to one  and join column and inside join column we have passed the another entity reference so in this situation the column will create inside the course material table 
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch=FetchType.LAZY,
	        //if we define fetch type is lazy so it will not fetch the course data until we dont fetch it with course material one error will also come when we are used toString in our class so toString will call the course also so for that lazy fetch type will not work so we need to remove the toString for course
			//fetch = FetchType.EAGER
			// fetch type is using here to fetch the data and print it, if we define fetch type as eager so it will also fetch course data when we want only course material data
	         optional = false
	         //optional is using for those cases which we want like it is not impacted our code like its optional, here optional is using for course material like if we add the course then course material is the mandatory field to be add.
	         )
	@JoinColumn(name="course_id",
	            referencedColumnName = "CourseId") // its a unidirectional mapping
	private Course course;
	
	
	public CourseMaterial(Long courseMaterialId, String url, Course course) {
		super();
		this.courseMaterialId = courseMaterialId;
		this.url = url;
		this.course = course;
	}
	@Override
	public String toString() {
		return "CourseMaterial [courseMaterialId=" + courseMaterialId + ", url=" + url + "]";
	}
	public Long getCourseMaterialId() {
		return courseMaterialId;
	}
	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public CourseMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
