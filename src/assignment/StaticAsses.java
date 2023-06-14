package assignment;

class A2{
	static String name="sadhana";
	int rollno=163;
	
	void display() {
		System.out.println(name+" "+ rollno);
		
	}
	static void display1(A2 obj) {
		System.out.println(name+" "+ obj.rollno);
	}


		
}		

public class StaticAsses {

	public static void main(String[] args) {
		A2 obj1=new A2();
		A2.name="logesh";
		obj1.display();
		
		obj1.display1(obj1);
	}

}
