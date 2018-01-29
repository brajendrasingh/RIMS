/**
 * 
 */
package com.bksoft.soap.services.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bksoft.dao.StudentDao;
import com.bksoft.model.Student;
import com.bksoft.soap.services.StudentService;

/**
 * @author BRAJENDRA SINGH
 *
 */
@WebService(endpointInterface = "com.bksoft.soap.services.StudentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao = new StudentDao();

	@Override
	public boolean addStudent(Student student) throws Exception {
		return dao.addStudent(student);
	}

	/// @Override
	public boolean addStudentList(List<Student> studentList) throws Exception {
		return dao.addStudentList(studentList);
	}

	@Override
	public Student getStudentById(int id) throws Exception {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public Student getStudentByRollNo(String rollno) throws Exception {
		return dao.getStudentByRollNo(rollno);
	}

	@Override
	public Student getStudentByName(String name) throws Exception {
		return dao.getStudentByName(name);
	}

	//@Override
	public List<Student> getStudentList() throws Exception {
		return dao.getStudentList();
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		dao.updateStudent(student);
	}

	@Override
	public void deleteStudentById(String name) throws Exception {
		dao.deleteStudentById(name);
	}

}
