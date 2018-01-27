package com.bksoft.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.bksoft.model.Student;
import com.bksoft.model.Teacher;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TeacherService {

	@WebMethod
	String getTeachersDepartment(String name);

	@WebResult(name = "Teacher")
	@WebMethod
	Teacher getTeacher(int id, @WebParam(name="tName", header = false) String name, String dpt);

	@WebResult(name = "Teacher")
	@WebMethod
	Teacher getTeacherList(@WebParam(name="teacher")Teacher student);

}