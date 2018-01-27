package com.bksoft.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.bksoft.model.Student;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentService {

	@WebResult(name = "StudentInfo")
	@WebMethod(operationName = "GetStudentInfo")
	public String getStudentInfo() throws Exception;

}
