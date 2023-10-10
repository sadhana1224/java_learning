package SimpleprogramForInterview;
class Furn
{
	void display()
	{
		System.out.println("this 1");
	}
	void details()
	{
		this.display();
		System.out.println("this 2");
	}
}
public class ThisMethod {

	public static void main(String[] args) {
		Furn f=new Furn();
		f.details();

	}

}
