package com.spring.service;

import java.util.List;

import com.spring.entity.Faculty;
import com.spring.entity.Student;

public interface CollegeMgmtService {

	public String registerFacultyAndTheirStudents(List<Faculty> fac);
	public String registerStudentsAndTheirFaculties(List<Student> stud);
	public List<Faculty> getFacultyAndTheirStudent();
	public String deleteFacultyAndTheirStudent(int id);
}
