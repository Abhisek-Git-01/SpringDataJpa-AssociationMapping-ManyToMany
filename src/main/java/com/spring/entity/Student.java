package com.spring.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MTM_STUDENTS")
@RequiredArgsConstructor
@Setter
@Getter
public class Student {

	@Id
	@SequenceGenerator(name="gen1",sequenceName="STUDENT_SEQ",allocationSize=1,initialValue=1001)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer sId;
	@NonNull
	@Column(length=30)
	private String sName;
	@NonNull
	@Column(length=30)
	private String sAdd;
	
	@ManyToMany(targetEntity=Faculty.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy = "studs")
	private Set<Faculty> faculties = new LinkedHashSet<>();

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAdd=" + sAdd + "]";
	}
	
	public Student() {
		System.out.println("Student 0-param constructor");
	}
	
}
