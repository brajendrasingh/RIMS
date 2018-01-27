package com.bksoft.soap.testing;

import javax.xml.ws.Endpoint;

import com.bksoft.soap.services.impl.StudentServiceImpl;
import com.bksoft.soap.services.impl.TeacherServiceImpl;

public class ServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/soapsample/teacher", new TeacherServiceImpl());
		Endpoint.publish("http://localhost:8000/soapsample/student", new StudentServiceImpl());

		System.out.println("Started Successfully ..........");
	}

}
