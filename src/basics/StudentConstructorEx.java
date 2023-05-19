package basics;

public class StudentConstructorEx {
	int id;
	String name;            //it is a global variables and it is access throughout the program
	
	StudentConstructorEx(int i,String n)          //constructor name is similar to class name ..i don't mention any access modifier.
	                                //it is a default constructor..if i am using public ..there is no problem it will run
	{                            //without mentioning any parameters or empty constructor it will run
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println("student id is "+id+" and the name is "+name);
	}
	public static void main(String[] args) {
		StudentConstructorEx s1=new StudentConstructorEx(10,"sadhana");  //adding parameters for constructor
		s1.display();
		
		StudentConstructorEx s2=new StudentConstructorEx(11,"komal");
		s2.display();

	}

}
