package oops;  //access modifiers
class color
{
	protected String clr="blue";
	
	void clrdisplay()        //within the same class we will access
	{
		System.out.println("the color is :" +clr);
	}
}

public class ProtectedEx {

	public static void main(String[] args) {
		color clrobj=new color();
		System.out.println(clrobj.clr);
		clrobj.clrdisplay();
		

	}

}
