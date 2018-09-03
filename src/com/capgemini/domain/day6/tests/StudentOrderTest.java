package com.capgemini.domain.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.day6.client.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.TreeSet;


class StudentOrderTest {
	@Test
	void testStudentOrderTest() {
		TreeSet<Student> student=new TreeSet<>();
		student.add(new Student("Malyka",1233,"IT"));
		student.add(new Student("Madhav",1234,"CSE"));
		student.add(new Student("Srikanth",1235,"ECE"));
		student.add(new Student("Varuni",1237,"ECE"));
		student.add(new Student("Mandy",1237,"ECE"));


		 for(Student s : student) {
			 System.out.println(s);
		 }
	}
}
	