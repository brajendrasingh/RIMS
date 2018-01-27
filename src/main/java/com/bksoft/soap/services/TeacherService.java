package com.bksoft.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.bksoft.model.Student;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TeacherService {

	@WebMethod
	String getHelloWorldAsString(String name);

	@WebResult(name = "Student")
	@WebMethod
	Student getStudent(int id, @WebParam(name="sName", header = false) String name, String rollNo);

	@WebResult(name = "Student")
	@WebMethod
	Student getStudentList(@WebParam(name="student")Student student);

}