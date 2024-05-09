package com.SpringBoot.Spring.Security;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringBoot.Spring.Security.Repository.CourseMaterialRepository;
import com.SpringBoot.Spring.Security.entity.Course;
import com.SpringBoot.Spring.Security.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Test
	public void SaveCourseMaterial() {
		CourseMaterial courseMaterial=new CourseMaterial();
		
		Course course=new Course();
		course.setCredit(5);
		course.setTitle("fs");
		courseMaterial.setUrl("www.google.com");
		courseMaterial.setCourse(course);
		
		courseMaterialRepository.save(courseMaterial);
	}
	
	@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterialsList = courseMaterialRepository.findAll();
		System.out.println("Course Material List" + courseMaterialsList);
	}
	 

}
