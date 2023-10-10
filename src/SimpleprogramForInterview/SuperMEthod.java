package SimpleprogramForInterview;
class Acces
{
	void dis()
	{
		System.out.println("parent class");
	}
	
}
class Body extends Acces
{
	void display()
	{
		super.dis();
		System.out.println("child class");
	}
}
public class SuperMEthod {

	public static void main(String[] args) {
		Body b=new Body();
		b.display();
		
	}

}
