package oops;  //my program
// accessing the parent class method
class fruit1  //super class
{
	String variety="banana";
	void displayvariety()
	{
		System.out.println("superclass is " +variety);
	}
}
class orange extends fruit1  //child class
{
	String variety="apple";
	void displayvariety()
	{
		System.out.println("childclass is " +variety);
	}
	void getAllData()
	{
		displayvariety();
		super.displayvariety();  //accessing the super class method
	}
}

public class SuperExMethod {

	public static void main(String[] args) {
		orange o=new orange();
		o.getAllData();
		
	}

}
