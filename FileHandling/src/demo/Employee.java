package demo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int id,salary;
	String name,dept;
	
	public Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}

}
