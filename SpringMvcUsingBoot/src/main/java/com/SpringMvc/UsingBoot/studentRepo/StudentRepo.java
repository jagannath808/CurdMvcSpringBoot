package com.SpringMvc.UsingBoot.studentRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.SpringMvc.UsingBoot.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	List<Student> findStudentById(int id);
	

}
