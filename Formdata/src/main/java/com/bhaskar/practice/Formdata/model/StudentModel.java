package com.bhaskar.practice.Formdata.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class StudentModel {
	

private	String name;

@Id

private	int rollid;
private	int age;
private	String Schoolname;

private	String email;
private	String password;

public StudentModel() {
	
}

public StudentModel(String name, int age, String schoolname, int rollid, String email, String password) {
	super();
	this.name = name;
	this.age = age;
	Schoolname = schoolname;
	this.rollid = rollid;
	this.email = email;
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSchoolname() {
	return Schoolname;
}

public void setSchoolname(String schoolname) {
	Schoolname = schoolname;
}

public int getRollid() {
	return rollid;
}

public void setRollid(int rollid) {
	this.rollid = rollid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public int hashCode() {
	return Objects.hash(Schoolname, age, email, name, password, rollid);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentModel other = (StudentModel) obj;
	return Objects.equals(Schoolname, other.Schoolname) && age == other.age && Objects.equals(email, other.email)
			&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
			&& Objects.equals(rollid, other.rollid);
}

@Override
public String toString() {
	return "StudentModel [name=" + name + ", age=" + age + ", Schoolname=" + Schoolname + ", rollid=" + rollid
			+ ", email=" + email + ", password=" + password + "]";
}
	
	
	
	
	
}
