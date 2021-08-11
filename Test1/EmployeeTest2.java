package com.techment.Test1;

class Employee1{
	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}


class SmallException extends Exception{
	
	String msg;

	public SmallException(String msg) {
		super();
		this.msg = msg;
	}
}

public class EmployeeTest2  {

	public static void main(String[] args)
			
			throws SmallException {
		
		Employee1 e1=new Employee1("shridhar","behera");
		Employee1 e2=new Employee1("sonu","behera");
		
		
		if(e1.getFirstName()==null||e1.getLastName()==null)
		{
			throw new NullPointerException("Entry Missing");
		}
		
		if(e1.getFirstName().length()<3||e2.getFirstName().length()<3)
		{
			throw new SmallException("name should be minimum 3 character");
		}
		

	}

}
