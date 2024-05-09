package com.SpringBoot.Spring.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Spring.Security.entity.Teacher;

@Repository
public interface TearcherRepo extends JpaRepository<Teacher, Long> {

}
