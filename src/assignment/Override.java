package assignment;
class Student1{
	void display() {
		System.out.println("parent class");
	}

}
public class Override extends Student1{
	void display() //same method name as in the parent class 
	{  
		System.out.println("child class");
	}



	public static void main(String[] args) {
		Override o=new Override();  //if i'm executing the program, child class will be executed, if i'm not defining any method inside the child class then only parent class will be executed
		o.display();
	}


}
