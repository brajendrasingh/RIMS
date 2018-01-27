package com.bksoft.dao;

import java.util.ArrayList;
import java.util.List;

import com.bksoft.model.Student;

public class StudentDao {

	public boolean addStudent(Student student) throws Exception {
		return false;
	}

	public boolean addStudentList(List<Student> studentList) throws Exception {
		return false;
	}

	public Student getStudentById(int id) throws Exception {
		return new Student(id, "name", "rollNo");
	}

	public Student getStudentByRollNo(String rollno) throws Exception {
		return new Student(12, "name", rollno);
	}

	public Student getStudentByName(String name) throws Exception {
		return new Student(15, name, "rollNo");
	}

	public List<Student> getStudentList() throws Exception {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(78, "name", "rollNo"));
		studentList.add(new Student(78, "name", "rollNo"));
		studentList.add(new Student(78, "name", "rollNo"));

		return studentList;
	}

	public void updateStudent(Student student) throws Exception {

	}

	public void deleteStudentById(String name) throws Exception {

	}

}
