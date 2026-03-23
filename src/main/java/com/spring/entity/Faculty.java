package com.spring.entity;

import java.util.LinkedHashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MTM_FACULTY")
@RequiredArgsConstructor
@Setter
@Getter
public class Faculty {

	@Id
	@SequenceGenerator(
			name="gen1",sequenceName="FACULTY_SEQ",allocationSize=1,initialValue=101
			)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer fId;
	@NonNull
	@Column(length=30)
	private String fName;
	@NonNull
	@Column(length=30)
	private String fAdd;
	
	@ManyToMany(targetEntity=Student.class)
	@JoinTable(name="JPA_MTM_FACULTY_STUDENT",joinColumns=@JoinColumn(name="FACULTY_ID",referencedColumnName="fId"),
	inverseJoinColumns=@JoinColumn(name="STUDENT_ID",referencedColumnName="sId"))
	private Set<Student> studs = new LinkedHashSet<>();

	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + ", fAdd=" + fAdd + "]";
	}
	public Faculty() {
		System.out.println("Faculty :: 0-param constructor");
	}
	
	
}
