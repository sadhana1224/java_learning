package oops;   //my program
public class ProtectedEx2 {  //access with in the same package
protected int num=14;
protected void displayValue()
{
	System.out.println(num);
}


	public static void main(String[] args) {
		ProtectedEx2 ob=new ProtectedEx2();
		ob.displayValue();
	}

}
