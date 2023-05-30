package oops;  //Access modifiers

class Private
{
	private int a1=12;
	
	private void display()
	{
		System.out.println("displaying the number :"+a1);
	}
}
public class PrivateEx {

	public static void main(String[] args) {
		Private obj=new Private();
		
		/* //compile time error
		System.out.println(obj.a1);
		obj.display();
*/
		
		//accessing a default method and variable form other program 'DefaultEx.java'
		//within the same package default will work
		Default obj1=new Default();
		System.out.println(obj1.a);
		obj1.display();
		
	}

}
