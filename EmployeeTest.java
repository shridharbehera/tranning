package com.techment.Test1;
class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName= " + firstName + ", lastName= " + lastName + "]";
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("shridhar", "behera");
		System.out.println(employee1);
			}

}
