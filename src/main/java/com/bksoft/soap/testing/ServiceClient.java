package com.bksoft.soap.testing;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bksoft.model.Student;
import com.bksoft.soap.services.StudentService;
import com.bksoft.soap.services.TeacherService;

public class ServiceClient {

	public static void main(String[] args) throws Exception {

		// new ServiceClient().teacher();
		new ServiceClient().student();

	}

	public void teacher() throws MalformedURLException {
		URL url = new URL("http://localhost:8000/soapsample/teacher?wsdl");
		QName qname = new QName("http://impl.services.soap.bksoft.com/", "TeacherServiceImplService");

		Service service = Service.create(url, qname);

		TeacherService teacherService = service.getPort(TeacherService.class);

		System.out.println(teacherService.getTeachersDepartment(""));

	}

	public void student() throws Exception {
		URL url = new URL("http://localhost:8000/soapsample/student?wsdl");
		QName qname = new QName("http://impl.services.soap.bksoft.com/", "StudentServiceImplService");

		Service service = Service.create(url, qname);

		StudentService studentService = service.getPort(StudentService.class);

		Student s = studentService.getStudentById(112122);
		System.out.println(s.toString());

	}
}
