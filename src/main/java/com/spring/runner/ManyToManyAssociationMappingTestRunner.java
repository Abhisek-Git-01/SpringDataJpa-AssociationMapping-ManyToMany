package com.spring.runner;

import java.util.ArrayList;
import java.util.List;
import com.spring.service.CollegeMgmtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.entity.Faculty;
import com.spring.entity.Student;
import com.spring.service.CollegeMgmtService;

@Component
public class ManyToManyAssociationMappingTestRunner implements CommandLineRunner {

    private final CollegeMgmtServiceImpl collegeMgmtServiceImpl;

	
	@Autowired
	private CollegeMgmtService collegeService;

    ManyToManyAssociationMappingTestRunner(CollegeMgmtServiceImpl collegeMgmtServiceImpl) {
        this.collegeMgmtServiceImpl = collegeMgmtServiceImpl;
    }

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * try { Faculty fac1 = new Faculty("HariKrishna", "Hyd"); Faculty fac2 = new
		 * Faculty("Natraj", "Delhi");
		 * 
		 * Student studs1 = new Student("Abhi", "Odisha"); Student studs2 = new
		 * Student("Barsha","Lucknow"); Student studs3 = new Student("Vicky", "Mumbai");
		 * 
		 * fac1.getStuds().add(studs1); fac1.getStuds().add(studs2);
		 * fac2.getStuds().add(studs1);
		 * fac2.getStuds().add(studs2);fac2.getStuds().add(studs3);
		 * 
		 * studs1.getFaculties().add(fac1);studs1.getFaculties().add(fac2);
		 * studs2.getFaculties().add(fac1);studs2.getFaculties().add(fac2);
		 * studs3.getFaculties().add(fac2);
		 * 
		 * List<Faculty> faculties = new ArrayList<>();
		 * faculties.add(fac1);faculties.add(fac2);
		 * 
		 * String msg = collegeService.registerFacultyAndTheirStudents(faculties);
		 * System.out.println(msg); } catch(Exception e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { Faculty fac1 = new Faculty("Kishan", "UP"); Faculty fac2 = new
		 * Faculty("Rabi", "Maharastra");
		 * 
		 * Student studs1 = new Student("Tanu", "Bihar"); Student studs2 = new
		 * Student("Rani","Gujurat"); Student studs3 = new Student("Babun", "Kolkata");
		 * 
		 * fac1.getStuds().add(studs1); fac1.getStuds().add(studs2);
		 * fac2.getStuds().add(studs1);
		 * fac2.getStuds().add(studs2);fac2.getStuds().add(studs3);
		 * 
		 * studs1.getFaculties().add(fac1);studs1.getFaculties().add(fac2);
		 * studs2.getFaculties().add(fac1);studs2.getFaculties().add(fac2);
		 * studs3.getFaculties().add(fac2);
		 * 
		 * List<Student> studs = new ArrayList<>();
		 * studs.add(studs1);studs.add(studs2);studs.add(studs3);
		 * 
		 * String msg = collegeService.registerStudentsAndTheirFaculties(studs);
		 * System.out.println(msg); } catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * List<Faculty> faculties = collegeService.getFacultyAndTheirStudent();
		 * faculties.forEach(faculty->{ System.out.println("Faculty Data :: "+faculty);
		 * faculty.getStuds().forEach(data->{
		 * System.out.println("Student Data :: "+data); });
		 * System.out.println("--------------------------------------------------------"
		 * ); });
		 */
		
		try {
			String msg = collegeService.deleteFacultyAndTheirStudent(101);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
