package com.bksoft.soap.services.impl;

import javax.jws.WebService;

import com.bksoft.model.Student;
import com.bksoft.model.Teacher;
import com.bksoft.soap.services.TeacherService;

@WebService(endpointInterface = "com.bksoft.soap.services.TeacherService")
public class TeacherServiceImpl implements TeacherService {

	@Override
	public String getTeachersDepartment(String name) {
		return "Hello " + name;
	}

	@Override
	public Teacher getTeacher(int id, String name, String rollNo) {
		return new Teacher(id, name, rollNo);
	}

	@Override
	public Teacher getTeacherList(Teacher student) {
		return new Teacher(student.getId(), student.getName(), student.getDpt());
	}
}