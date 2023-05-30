package basics;  //my program
import oops.ProtectedEx2;  //access within the outside package  check--'ProtectedEx2.java'
public class ProtectedEx4OtherPackage extends ProtectedEx2 {

	public static void main(String[] args) {
		
		ProtectedEx4OtherPackage ob1=new ProtectedEx4OtherPackage();
		ob1.displayValue();
	}

}
