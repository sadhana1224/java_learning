package oops;  //my program--same as staticvarEx.java  //all in one program
/*
//Static variable example
class Vehicle1
{
	String vehicleName;  //non static or instance variable
	int price;             //non static or instance variable
	static String color;  //static variable  //value can't be changed

	void displayVehicleetails()
	{
		System.out.println("vehicle name : "+vehicleName +" "+price +" "+color);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		Vehicle1 obj=new Vehicle1();
		obj.vehicleName="kia";
		obj.price=1200000;
		//obj.color="black";

		Vehicle1 obj1=new Vehicle1();
		obj1.vehicleName="maruthi";
		obj1.price=1000000;
		//obj1.color="red";


		Vehicle1.color="Blue";  //it belongs to the class level  //access the static variable using classname.variablename

		obj.displayVehicleetails();
		obj1.displayVehicleetails();
	}

}

*/

//static method example
class Vehicle1
{
	String vehicleName;  //non static or instance variable
	int price;             //non static or instance variable
	static String color;  //static variable  //value can't be changed

	void displayVehicleetails()
	{
		System.out.println("vehicle name : "+vehicleName +" "+price +" "+color);
	}
	static void displayVehicleetails1(Vehicle1 obj2)  //inside the static method we can't access the instance variable 
	  //because compiler get confused whicj obj would get call
	
	{
		System.out.println("inside the static method");
		//System.out.println("vehicle name : "+vehicleName +" "+price +" "+color);
		
		System.out.println("vehicle name : "+obj2.vehicleName +" "+obj2.price +" "+color); //if i want to access instance variables 
		//we can pass the arguments -->obj of vehicle details class
		System.out.println(color);  //it is a static variabe
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		Vehicle1 obj=new Vehicle1();
		obj.vehicleName="kia";
		obj.price=1200000;
		//obj.color="black";

		Vehicle1 obj1=new Vehicle1();
		obj1.vehicleName="maruthi";
		obj1.price=1000000;
		//obj1.color="red";


		Vehicle1.color="Blue";  //it belongs to the class level

		obj.displayVehicleetails();
		obj1.displayVehicleetails();
		
		obj.displayVehicleetails1(obj1); //access the static method
	}

}