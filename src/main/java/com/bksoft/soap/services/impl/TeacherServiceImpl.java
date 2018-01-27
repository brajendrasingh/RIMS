package com.bksoft.soap.services.impl;

import javax.jws.WebService;

import com.bksoft.model.Student;
import com.bksoft.soap.services.TeacherService;

@WebService(endpointInterface = "com.bksoft.soap.services.TeacherService")
public class TeacherServiceImpl implements TeacherService {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello " + name;
	}

	@Override
	public Student getStudent(int id, String name, String rollNo) {
		return new Student(id, name, rollNo);
	}

	@Override
	public Student getStudentList(Student student) {
		return new Student(student.getId(), student.getName(), student.getRollNo());
	}
}