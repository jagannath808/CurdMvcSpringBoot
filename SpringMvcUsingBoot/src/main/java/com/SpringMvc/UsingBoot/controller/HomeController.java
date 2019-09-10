package com.SpringMvc.UsingBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringMvc.UsingBoot.model.Student;
import com.SpringMvc.UsingBoot.studentRepo.StudentRepo;

@Controller()

public class HomeController {
	@Autowired
	StudentRepo studentRepo;		//Create object student repo
	
	//Controller Constructor for checking the cntroller is working or not
	public HomeController() {
		System.out.println("controller is working...");

	}

		//Controller for index
	//@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping(value="/index")
	public String index(Model model) {

		String message = " ......";

		model.addAttribute("message", message);

		return "index";
	}
	
	//controller for get All Student

	//@RequestMapping(value = "/studentList", method = RequestMethod.GET)
	@GetMapping(value = "/studentList")
	public String getAllStudent(Model model) {
		
		List<Student> student=studentRepo.findAll();
		model.addAttribute("student",student );

		return "personList";
	}
	
	//Controller for get student by id
	
	//@RequestMapping(value= {"/getStudentById/{id}"})
	@GetMapping(value= {"/getStudentById/{id}"})
	public String getStudentById(@PathVariable int id,Model model) {
		
		List<Student> student=studentRepo.findStudentById(id);
		model.addAttribute("student", student);
		return "updateStudentList";
	}
	
	//Controller for update student
	//@RequestMapping(value= {"/updateAndSave"})
	@GetMapping(value= {"/updateAndSave"})
	public String saveAndUpdate(@ModelAttribute("student") Student student) {
		
					studentRepo.save(student);
		
		return "redirect:/studentList";
	}
	
	//Controller for delete student
	//@RequestMapping(value= {"/deleteStudent/{id}"})
	@GetMapping(value= {"/deleteStudent/{id}"})
	public String deleteStudent(@PathVariable int id) {
		
		studentRepo.deleteById(id);
		System.out.println("delete successfull...."+id);
		return "redirect:/studentList";
	}
}
