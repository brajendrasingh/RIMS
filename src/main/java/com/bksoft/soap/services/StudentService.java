package com.bksoft.soap.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.bksoft.model.Student;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentService {

	@WebMethod
	public boolean addStudent(@WebParam(name = "student") Student student) throws Exception;

	//@WebMethod
	//public boolean addStudentList(@WebParam(name = "student") List<Student> studentList) throws Exception;

	@WebResult(name = "Student")
	@WebMethod
	public Student getStudentById(int id) throws Exception;

	@WebResult(name = "Student")
	@WebMethod(operationName = "GetStudentInfo")
	public Student getStudentByRollNo(String rollno) throws Exception;

	@WebResult(name = "Student")
	@WebMethod
	public Student getStudentByName(String name) throws Exception;
/*
	@WebResult(name = "Student")
	@WebMethod
	public List<Student> getStudentList() throws Exception;
*/
	@WebMethod
	public void updateStudent(Student student) throws Exception;

	@WebMethod
	public void deleteStudentById(String name) throws Exception;

}
