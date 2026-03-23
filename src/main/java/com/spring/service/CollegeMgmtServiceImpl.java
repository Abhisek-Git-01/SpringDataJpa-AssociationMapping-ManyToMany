package com.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Faculty;
import com.spring.entity.Student;
import com.spring.repository.FacultyRepository;
import com.spring.repository.StudentRepository;
@Service
public class CollegeMgmtServiceImpl implements CollegeMgmtService {
	
	@Autowired
	private FacultyRepository facRepo;
	
	@Autowired
	private StudentRepository studRepo;

	@Override
	public String registerFacultyAndTheirStudents(List<Faculty> fac) {
		List<Faculty> lists =  facRepo.saveAll(fac);
		List<Integer> ids = lists.stream()
				                                   .map(faculty->faculty.getFId())
				                                   .collect(Collectors.toList());
		return "Faculty And their Students Registered Successfully having ids :: "+ids;
	}

	@Override
	public String registerStudentsAndTheirFaculties(List<Student> stud) {
		List<Student> lists =  studRepo.saveAll(stud);
		List<Integer> ids = lists.stream()
				                                   .map(student->student.getSId())
				                                   .collect(Collectors.toList());
		return "Students And their Faculties Registered Successfully having ids :: "+ids;
	}

	@Override
	public List<Faculty> getFacultyAndTheirStudent() {
		
		return facRepo.findAll();
	}

	@Override
	public String deleteFacultyAndTheirStudent(int id) {
		facRepo.deleteById(id);
		return "Faculty and their student deleted having id : "+id;
	}

}
