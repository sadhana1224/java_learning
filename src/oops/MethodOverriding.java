package oops;  //same method name
//Method overriding or Run time polymorphism
//If a child class has a same method name as in parent class without change in method signature, then it is called as Method overriding
/*
* Usage of Java Method Overriding
Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an super and child class relationship (inheritance).
*/
class Bike
{
	void run()  // parent and clild class have same method name
	{
		System.out.println("parent class");
	}
}
public class MethodOverriding extends Bike {
	void run()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {

		MethodOverriding ob=new MethodOverriding();
		ob.run(); //it will execute child class
		 //if there is no method in child class then only parent class will be executed
	}

}
