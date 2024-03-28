package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int id;
  String name;
  public Student()
  {
	  super();
  }
  public Student(String name,int id)
  {
	  this.name=name;
	  this.id=id;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
  
}
