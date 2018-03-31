package com.bksoft.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = { "rollNo", "name", "id" })
@XmlRootElement(name = "Student")
public class Student {

	int id;

	@XmlElement(name = "studentName")
	String name;

	@XmlElement(name = "studentRollNo.")
	String rollNo;

	public Student() {
	}

	public Student(int id, String name, String rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNumber) {
		this.rollNo = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
}
