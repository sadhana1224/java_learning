package oops;  //Access Modifiers

class Default
{
	int a=12;
	
	void display()
	{
		System.out.println(a);
	}
}
public class DefaultEx {

	public static void main(String[] args) {
		
		Default obj1=new Default();
		//within the same class ...it will work  and within the same package it will sork--check PrivateEx.java program
		System.out.println(obj1.a);
		obj1.display();
	}

}
