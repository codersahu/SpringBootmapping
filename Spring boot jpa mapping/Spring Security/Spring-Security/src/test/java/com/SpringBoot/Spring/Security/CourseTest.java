package com.SpringBoot.Spring.Security;

import com.SpringBoot.Spring.Security.Repository.CourseRepository;
import com.SpringBoot.Spring.Security.entity.Course;
import com.SpringBoot.Spring.Security.entity.Student;
import com.SpringBoot.Spring.Security.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveCourseWithStudentAndTeacher(){
        Teacher teacher=new Teacher();
        teacher.setFirstName("Mohit");
        teacher.setLastName("Sahu");

        Student student=new Student();
        student.setFirstName("Moh");
        student.setLastName("Sahu");
        student.setEmail("mohsah@gmail.com");

        Course course=new Course();
        course.setTitle("Ai");
        course.setCredit(34);
        course.setTeacher(teacher);
        course.addStudents(student);
        courseRepository.save(course);


    }


}
