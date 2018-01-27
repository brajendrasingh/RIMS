package com.bksoft.soap.testing;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bksoft.soap.services.TeacherService;

public class ServiceClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:8000/soapsample/teacher?wsdl");
		QName qname = new QName("http://services.soap.bksoft.com/", "TeacherServiceService");

		Service service = Service.create(url, qname);

		TeacherService teacherService = service.getPort(TeacherService.class);

		

	}

}
