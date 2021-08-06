package com.techment.day5.oops;

class Car
{
	String name;
	String model;
	Engine engine;
	
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}

	void displayCarInfo()
	{
		System.out.println("name:"+name);
		System.out.println("model:"+model);
		System.out.println("engineid:"+engine.engineid);
		System.out.println("enginetype:"+engine.enginetype);
	}
	
}
class Engine
{
	int engineid;
	String enginetype;
	public Engine(int engineid, String enginetype) {
		super();
		this.engineid = engineid;
		this.enginetype = enginetype;
	}
	
}
public class HasRelationship2 {

	public static void main(String[] args) {
		
		Engine eng=new Engine(101,"2 stock");
		Car car=new Car("suzia","baleno",eng);
		car.displayCarInfo();


	}

}
