package SimpleprogramForInterview;

class God
{
	String s="sadhana";
	God()
	{
		System.out.println("super class");
	}
}
class Muruga extends God
{
	Muruga()
	{
		super();
		System.out.println("child class");
		System.out.println(super.s);
		
	}
}
public class SuperConstructor {

	public static void main(String[] args) {

		Muruga m=new Muruga();
		
	}

}
