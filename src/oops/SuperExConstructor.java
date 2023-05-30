package oops; //my program
//accessing the super class constructor
class fruit2
{
	
	fruit2()
	{
		System.out.println("parent class constructor");
	}
}
class banana extends fruit2
{
	banana()
	{
		super(); //it will be first    //without using super() it will work and output is same
		System.out.println("child class constructor");
	}
}

public class SuperExConstructor {

	public static void main(String[] args) {
		banana b=new banana();
		
	}

}
