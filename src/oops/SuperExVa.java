package oops;   //my program
//accessing the parent class variables
class fruit  //parent or base or super class
{
	String variety="apple";
}
class mango extends fruit   //child class
{
	String variety="apple";
	
	void displayVariety()
	{
		System.out.println("displaying the child class variable : "+variety);
	System.out.println("displaying the super class variable : "+super.variety);
	
}
}
public class SuperExVa {

	public static void main(String[] args) {
		mango m=new mango();
		m.displayVariety();

	}

}
