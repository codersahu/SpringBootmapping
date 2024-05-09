package com.SpringBoot.Spring.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Spring.Security.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
