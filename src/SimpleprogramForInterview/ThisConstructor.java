package SimpleprogramForInterview;
class Furnit
{
	Furnit()
	{
		System.out.println("deafult");
	}
	Furnit(String name)
	{
		this();
		System.out.println(name);
	}
}
public class ThisConstructor {

	public static void main(String[] args) {
		Furnit f=new Furnit("mixie");
		
	}

}
