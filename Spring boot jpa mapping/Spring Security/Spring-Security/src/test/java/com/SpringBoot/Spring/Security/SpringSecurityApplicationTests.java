	package com.SpringBoot.Spring.Security;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringBoot.Spring.Security.Repository.CourseMaterialRepository;
import com.SpringBoot.Spring.Security.Repository.CourseRepository;
import com.SpringBoot.Spring.Security.Repository.StudentRepo;
import com.SpringBoot.Spring.Security.Repository.TearcherRepo;
import com.SpringBoot.Spring.Security.entity.Course;
import com.SpringBoot.Spring.Security.entity.CourseMaterial;
import com.SpringBoot.Spring.Security.entity.Guardian;
import com.SpringBoot.Spring.Security.entity.Student;
import com.SpringBoot.Spring.Security.entity.Teacher;

@SpringBootTest
class SpringSecurityApplicationTests {
	@Autowired
	StudentRepo studentRepo;
	
	
	
	@Autowired
	private TearcherRepo tearcherRepo;
	
	private CourseRepository courseRepository;

	//in this case student and guardian data will be in same entity but we created two entity in second task first is student and second is guardian but in guardian we didnt annotate with entity annotation cause we dont want to create two tables with the name of guardian and student but we want like our both data will store in a same table so for that we are using embedable.
	
	 /* @Test void contextLoads() { System.out.println("Hello world"); Student
	  student = new Student(); student.setFirstName("Raju");
	  student.setLastName("Sharma"); student.setEmail("Rajushrama@gmail.com");
	  
	  studentRepo.save(student); }
	  guardian.setGuardianName("Rajan");
		guardian.setGuardianEmail("Rajan@gmail.com");
		guardian.setGuardianMobile("2243434322");
		
		*/
	 

		/*
		 * @Test public void printAllStudent() { List<Student>
		 * studentList=studentRepo.findAll();
		 * System.out.println("Student List:"+studentList); }
		 */
	
/*	@Test
	public void saveStudentsWithGuardian() {
		
		Guardian guardian = new Guardian();
		guardian.setGuardianName("jatin");
		guardian.setGuardianEmail("jatim@gmail.com");
		guardian.setGuardianMobile("243434322");
		
		Student student=new Student();
		student.setFirstName("rahhi");
		student.setLastName("hsN");
		student.setEmail("rajugmail.com");
		student.setGuardian(guardian);
		
		studentRepo.save(student);
		}
		
		*/
		
	
	
	
	@Test
	public void SaveTeacher(){
		
		Course courseHana=new Course();
		courseHana.setTitle("hana");
		courseHana.setCredit(3);
		
		Course courseJava=new Course();
		courseJava.setTitle("java");
		courseJava.setCredit(6);
		
		Course courseAngular=new Course();
		courseAngular.setTitle("Angular");
		courseAngular.setCredit(8);
		
		Teacher teacher=new Teacher();
		teacher.setFirstName("Amandeep");
		teacher.setLastName("sinha");
		//teacher.setCourses(List.of(courseHana,courseAngular,courseJava));
		
		tearcherRepo.save(teacher);
		
			
		}
		
		/*
		 * @Test public void saveCourseWithTeacher() {
		 * 
		 * List<Course> courses=courseRepository.findAll();
		 * 
		 * Teacher teacher=new Teacher(); teacher.setFirstName("Rahul");
		 * teacher.setLastName("Sharma"); Course course = new Course();
		 * course.setTitle("Python"); course.setCredit(4); course.setTeacher(teacher);
		 * 
		 * courseRepository.save(course);
		 * 
		 * }
		 */
		 
	/* @Test
	    public void printStudentByFirstName() {
	        
	        List<Student> students =
	        		studentRepo.findByFirstName("shivam");

	        System.out.println("students = " + students);
	    }

	    @Test
	    public void printStudentByFirstNameContaining() {

	        List<Student> students =
	        		studentRepo.findByFirstNameContaining("sh");

	        System.out.println("students = " + students);
	    }
	    
	    @Test
	    public void printStudentBasedOnGuardianName(){
	        List<Student> students =
	        		studentRepo.findByGuardianName("Nikhil");
	        System.out.println("students = " + students);
	    }

	    @Test
	    public void printgetStudentByEmailAddress() {
	        Student student =
	        		studentRepo.getStudentByEmailAddress(
	                        "shabbir@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }

	    @Test
	    public void printgetStudentFirstNameByEmailAddress() {
	        String firstName =
	        		studentRepo.getStudentFirstNameByEmailAddress(
	                        "shivam@gmail.com"
	                );
	        System.out.println("firstName = " + firstName);
	    }
	    
	    @Test
	    public void printgetStudentByEmailAddressNative(){
	        Student student =
	        		studentRepo.getStudentByEmailAddressNative(
	                        "shivam@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }

	    @Test
	    public void printgetStudentByEmailAddressNativeNamedParam() {
	        Student student =
	        		studentRepo.getStudentByEmailAddressNativeNamedParam(
	                        "shivam@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }

	    @Test
	    public void updateStudentNameByEmailIdTest() {
	    	studentRepo.updateStudentNameByEmailId(
	                "shabbir dawoodi",
	                "shabbir@gmail.com");
	    }
*/
}
