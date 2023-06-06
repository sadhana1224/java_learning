package oops;   //my program

/*
 * class Vehicle   //first example
{
	//instanc evariable
	String color;
	String model;
	int price;

  Vehicle(String color, String model,int price)  //local variables
  {
	  color=color;   // if local & instance variables are same then the o/p will be null value  ..the reason is compiler get confused
	  model=model;
	  price=price;
  }
  void displayCarData()
  {
	  System.out.println("vehicle color is :"+ color +" "+"model and price is : "+ model+" "+price);
  }
}
public class ThisKeyword {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle("black","kia",1200000);  //obj is instance object
		obj.displayCarData();
		

	}

}
*/
/*
class Vehicle  //second example  without using this keyword
{
	//instanc evariable
	String color;
	String model;
	int price;

  Vehicle(String colors, String models,int price1)  //local variables
  {
	  color=colors;   //use other variable names then o/p will printed
	  model=models;
	  price=price1;
  }
  void displayCarData()
  {
	  System.out.println("vehicle color is :"+ color +" "+"model and price is : "+  model +" "+price);
  }
}
public class ThisKeyword {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle("black","kia",1200000);  //obj is instance object
		obj.displayCarData();
		

	}

}
*/

class Vehicle   //third example using this keyword
{
	//instanc evariable
	String color;
	String model;
	int price;

  Vehicle(String color, String model,int price)  //local variables
  {
	  this.color=color;
	  this.model=model;
	  this.price=price;
  }
  void displayCarData()
  {
	  System.out.println("vehicle color is :"+ color +" "+" & model and price is : "+ model+" "+price);
  }
}
public class ThisKeyword {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle("black","kia",1200000);  //obj is instance object
		obj.displayCarData();
		

	}

}
 
 
