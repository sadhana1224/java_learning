package oops;  //access modifiers

public class PublicEx1 { //access within the same package

	public static void main(String[] args) // we access 'PublicEx.java' file  -->check
	{
		PublicEx ranobj=new PublicEx();
		System.out.println(ranobj.range);
		ranobj.rangeDisplay();

	}

}
