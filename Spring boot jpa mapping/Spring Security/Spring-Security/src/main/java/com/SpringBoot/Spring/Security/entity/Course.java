package com.SpringBoot.Spring.Security.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
	@Id
	@SequenceGenerator(
			name="course_sequence",
			sequenceName="course_sequence",
			allocationSize=1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	                           generator = "course_sequence"
	)
	private Long CourseId;
	private String title;
	private Integer credit;
	
	
	//ONE TO ONE
	// doing bydirectional mapping means course will also call course material using mapped by and coursematerial will call course by adding reference column name in coursematerial
	@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;
	
	// MANY TO ONE
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName ="teacherId" )
	private Teacher teacher;

	// MANY TO MANY
	//inside the many to many mapping when we create it so one extra table will be created, inside the table there will be a mapping between two class.
	@ManyToMany(cascade = CascadeType.ALL
	)
	@JoinTable(
			name = "student_course_map",
			joinColumns = @JoinColumn(
					name="course_id",
					referencedColumnName = "CourseId"  //CourseId is available in this course class which we are using here
			),
			inverseJoinColumns = @JoinColumn(
					name = "student_id",
					referencedColumnName = "studentId"  //if we go to the student table then there available student id will be our referenced column
			)
	)
	private List<Student> students;

	public Course() {

	}

	public void addStudents(Student student){
		if(students==null) students=new ArrayList<>();  //one more method to store the students data
		students.add(student);
	}

	public Long getCourseId() {
		return CourseId;
	}

	public void setCourseId(Long courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course{" +
				"CourseId=" + CourseId +
				", title='" + title + '\'' +
				", credit=" + credit +
				", courseMaterial=" + courseMaterial +
				", teacher=" + teacher +
				", students=" + students +
				'}';
	}

	public Course(Long courseId, String title, Integer credit, CourseMaterial courseMaterial, Teacher teacher, List<Student> students) {
		CourseId = courseId;
		this.title = title;
		this.credit = credit;
		this.courseMaterial = courseMaterial;
		this.teacher = teacher;
		this.students = students;
	}

}
