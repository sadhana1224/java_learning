package oops;  //access modifiers

public class ProtectedEx1 {  //diiferent class in same package

	public static void main(String[] args) {
		
		color clrobj=new color();
		System.out.println(clrobj.clr);   //within the same package we will access the 'ProtectedEx.java' file
		clrobj.clrdisplay();

	}

}
