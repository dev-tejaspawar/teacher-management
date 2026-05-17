package com.example.teacher.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teacher")
public class TeacherEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String position;
	private int age;
	private String gender;
	private String department;
	private float salary;
	private int experience;
	
	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherEntity(Integer id, String name, String position, int age, String gender, String department,
			float salary, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.experience = experience;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "TeacherController [id=" + id + ", name=" + name + ", position=" + position + ", age=" + age
				+ ", gender=" + gender + ", department=" + department + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	
}
