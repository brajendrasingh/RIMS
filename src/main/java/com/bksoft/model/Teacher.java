package com.bksoft.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teacher", propOrder = { "dpt", "name", "id" })
@XmlRootElement(name = "Teacher")
public class Teacher {

	int id;

	@XmlElement(name = "studentName")
	String name;

	@XmlElement(name = "studentRollNo.")
	String dpt;

	public Teacher(int id, String name, String dpt) {
		this.name = name;
		this.dpt = dpt;
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

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public Teacher() {
	}

}
