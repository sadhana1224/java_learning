package oops;  //my example
 class Animals
 {
	 String animalName="snake";
	 
	 void eat()
	 {
		 System.out.println("Animal is eating");
	 }
 }
 class Snake extends Animal
 {
	 void sound()
	 {
		 System.out.println("shh shh");
	 }
 }


public class SingleInheritance {

	public static void main(String[] args) {
		Snake s=new Snake();
		s.eat();
		s.sound();
		System.out.println(s.animalName);

	}

}
