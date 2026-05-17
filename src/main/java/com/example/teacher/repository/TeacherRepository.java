package com.example.teacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.teacher.entities.TeacherEntity;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer>{

	List<TeacherEntity> findByName(String name);

	List<TeacherEntity> findByAgeGreaterThanEqual(int age);

	List<TeacherEntity> findByAgeLessThanEqual(int age);

	List<TeacherEntity> findByPosition(String position);

	List<TeacherEntity> findByGender(String gender);
	
	@Query("select e from TeacherEntity e where e.experience > :experience")
	List<TeacherEntity> getTeacherAboveEx(int experience);
	
	@Query("select e from TeacherEntity e where e.experience < :experience")
	List<TeacherEntity> getTeacherBelowEx(int experience);
	
	@Query("select e.name from TeacherEntity e where e.name = :name")
	List<String> getAllNames(String name);
	
	@Query("select e.department from TeacherEntity e where e.department = :departments")
	List<String> getAllDepartments(String departments);
	
	@Query("select e.salary from TeacherEntity e where e.salary = :salary")
	List<Float> getAllSalaries(float salary);
	

}
