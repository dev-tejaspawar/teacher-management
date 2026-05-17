package com.example.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher.entities.TeacherEntity;
import com.example.teacher.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/getAll")
	public List<TeacherEntity> getAllTeachers()
	{
		return teacherService.getAllTeachers();
	}
	
	@GetMapping("/getById/{id}")
	public TeacherEntity getTeacherById(@PathVariable int id)
	{
		return teacherService.getTeacherById(id);
	}
	
	@GetMapping("/getByName/{name}")
	public List<TeacherEntity> getTeacherByName(@PathVariable String name)
	{
		return teacherService.getTeacherByName(name);
	}
	
	@GetMapping("/getAboveAge/{age}")
	public List<TeacherEntity> getTeacherAboveAge(@PathVariable int age)
	{
		return teacherService.getTeacherAboveAge(age);
	}
	
	@GetMapping("/getBelowAge/{age}")
	public List<TeacherEntity> getTeacherBelowAge(@PathVariable int age)
	{
		return teacherService.getTeacherBelowAge(age);
	}
	
	@GetMapping("/getByPosition/{position}")
	public List<TeacherEntity> getTeacherByPosition(@PathVariable String position)
	{
		return teacherService.getTeacherByPosition(position);
	}
	
	@GetMapping("/getByGender/{gender}")
	public List<TeacherEntity> getTeacherByGender(@PathVariable String gender)
	{
		return teacherService.getTeacherByGender(gender);
	}
	
	@GetMapping("/getAboveEx/{experince}")
	public List<TeacherEntity> getTeacherAboveEx(@PathVariable int experince)
	{
		return teacherService.getTeacherAboveEx(experince);
	}
	
	@GetMapping("/getBelowEx/{experince}")
	public List<TeacherEntity> getTeacherBelowEx(@PathVariable int experince)
	{
		return teacherService.getTeacherBelowEx(experince);
	}
	
	@GetMapping("/getName/{name}")
	public List<String> getAllNames(@PathVariable String name)
	{
		return teacherService.getAllNames(name);
	}
	
	@GetMapping("/getDepartment/{department}")
	public List<String> getAllDepartments(@PathVariable String department)
	{
		return teacherService.getAllDepartments(department);
	}
	
	@GetMapping("/getSalary/{salary}")
	public List<Float> getAllSalaries(@PathVariable float salary)
	{
		return teacherService.getAllSalaries(salary);
	}
	
	@PostMapping("/add")
	public TeacherEntity addTeacher(@RequestBody TeacherEntity teacher)
	{
		return teacherService.addTeacher(teacher);
	}
	
	@PutMapping("/update/{id}")
	public TeacherEntity updateTeacher(@PathVariable int id, @RequestBody TeacherEntity teacher)
	{
		return teacherService.updateTeacher(id, teacher);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTeacherById(@PathVariable int id)
	{
		return teacherService.deleteTeacherById(id);
	}

}
