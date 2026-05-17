package com.example.teacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teacher.entities.TeacherEntity;
import com.example.teacher.exception.ResourceNotFoundException;
import com.example.teacher.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;
	
	public List<TeacherEntity> getAllTeachers()
	{
		return teacherRepository.findAll();
	}
	
	public TeacherEntity getTeacherById(int id)
	{
		return teacherRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Teacher Found with ID : "+id));
	}
	
	public List<TeacherEntity> getTeacherByName(String name)
	{
		List<TeacherEntity> listByName = teacherRepository.findByName(name);
		
		if(listByName.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found with Name : "+name);
		}
		
		return listByName;
	}
	
	public List<TeacherEntity> getTeacherAboveAge(int age)
	{
		List<TeacherEntity> listByAboveAge = teacherRepository.findByAgeGreaterThanEqual(age);
		
		if(listByAboveAge.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found Above "+age+" Age !!!");
		}
		
		return listByAboveAge;
	}
	
	public List<TeacherEntity> getTeacherBelowAge(int age)
	{
		List<TeacherEntity> listByBelowAge = teacherRepository.findByAgeLessThanEqual(age);
		
		if(listByBelowAge.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found Below "+age+" Age !!!");
		}
		
		return listByBelowAge;
	}
	
	public List<TeacherEntity> getTeacherByPosition(String position)
	{
		List<TeacherEntity> listByPosition = teacherRepository.findByPosition(position);
		
		if(listByPosition.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found with Position : "+position);
		}
		
		return listByPosition;
	}
	
	public List<TeacherEntity> getTeacherByGender(String gender)
	{
		List<TeacherEntity> listByGender = teacherRepository.findByGender(gender);
		
		if(listByGender.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found with Gender : "+gender);
		}
		
		return listByGender;
	}
	
	public List<TeacherEntity> getTeacherAboveEx(int experience)
	{
		List<TeacherEntity> listByAboveEx = teacherRepository.getTeacherAboveEx(experience);
		
		if(listByAboveEx.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found Above "+experience+" years of Experince !!!");
		}
		
		return listByAboveEx;
	}
	
	public List<TeacherEntity> getTeacherBelowEx(int experience)
	{
		List<TeacherEntity> listByBelowEx = teacherRepository.getTeacherBelowEx(experience);
		
		if(listByBelowEx.isEmpty())
		{
			throw new ResourceNotFoundException("No Teacher Found Below "+experience+" years of Experince !!!");
		}
		
		return listByBelowEx;
	}
	
	public List<String> getAllNames(String name)
	{
		List<String> listAllNames = teacherRepository.getAllNames(name);
		
		if(listAllNames.isEmpty())
		{
			throw new ResourceNotFoundException("Not a single teacher with name : "+name);
		}
		
		return listAllNames;
	}
	
	public List<String> getAllDepartments(String departments)
	{
		List<String> listAllDepartments = teacherRepository.getAllDepartments(departments);
		
		if(listAllDepartments.isEmpty())
		{
			throw new ResourceNotFoundException("Not a single teacher with department : "+departments);
		}
		
		return listAllDepartments;
	}
	
	public List<Float> getAllSalaries(float salary)
	{
		List<Float> listAllSalaries = teacherRepository.getAllSalaries(salary);
		
		if(listAllSalaries.isEmpty())
		{
			throw new ResourceNotFoundException("Not a single teacher with salary : "+salary);
		}
		
		return listAllSalaries;
	}
	
	public TeacherEntity addTeacher(TeacherEntity teacher)
	{
		return teacherRepository.save(teacher);
	}
	
	public TeacherEntity updateTeacher(int id, TeacherEntity teacher)
	{
		TeacherEntity teach = getTeacherById(id);
		teacher.setId(teach.getId());
		
		return teacherRepository.save(teacher);
	}
	
	public String deleteTeacherById(int id)
	{
		getTeacherById(id);
		teacherRepository.deleteById(id);
		return "Teacher Removed By ID : "+id;
	}

}
