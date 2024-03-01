package com.sgm.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public class Trainee {
private int id;
private String name;
private String technology;
@Autowired
private Project project;
public Trainee()
{
	System.out.println("Trainee object created");
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
public String getTechnollogy() {
	return technology;
}
public void setTechnollogy(String technollogy) {
	this.technology = technology;
}
public void display()
{
	System.out.println("Trainee object display method called");
	project.currentproject();
}

}
