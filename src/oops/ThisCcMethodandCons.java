package oops;  //my program

//current class method
class fruits
{
	void variety()
	{
		System.out.println("fruits varieties are apple ,mango");
	}
	void season()
	{
		this.variety();  //this.variety() and variety is print same o/p, bcoz, it is implicitly
		//variety();
		System.out.println("apple season is april to july and mango season is may");
	}
}
public class ThisCcMethodandCons {

	public static void main(String[] args) {
		fruits f=new fruits();
		f.season();
		//f.variety();

	}

}
/*
//current class constructor
class fruits
{
	fruits()
	{
		System.out.println("apple,mango,banana");
	}
	fruits(String variety)
	{
		this(); //it will call the current class method
		System.out.println("fruit variety is : "+ variety);
	}
}
public class ThisCcMethodandCons
{
public static void main(String[] args)
{
	fruits f=new fruits("orange");
	//f.fruits();
	
	 
}
}
*/