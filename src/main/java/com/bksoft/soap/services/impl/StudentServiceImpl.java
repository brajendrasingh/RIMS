/**
 * 
 */
package com.bksoft.soap.services.impl;
import javax.jws.WebService;

import com.bksoft.soap.services.StudentService;

/**
 * @author BRAJENDRA SINGH
 *
 */
@WebService(endpointInterface = "com.bksoft.soap.services.StudentService")
public class StudentServiceImpl implements StudentService{

	public String getStudentInfo() throws Exception{
		return "this is new service for testing ";
	}
}
