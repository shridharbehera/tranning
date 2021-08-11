package com.techment.Test1;

abstract class Animal{
	
	abstract void shout();
	
}

class Dog extends Animal{

	@Override
	void shout() {
		System.out.println("a");
	}
	
	
}

class Horse extends Animal{

	@Override
	void shout() {
		System.out.println("b");
	}
	
	
}


class Cat extends Animal{
	
	@Override
	void shout() {
		System.out.println("c");
	}
}


public class AminalTest {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.shout();
	}

}
