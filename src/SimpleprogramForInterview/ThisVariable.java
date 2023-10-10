package SimpleprogramForInterview;
class Furniture
{
	String name;
	int price;
	Furniture(String name1,int price1)
	{
		/*
	this.name=name;
	this.price=price;
	*/
		name=name1;
		price=price1;
	}
	void details()
	{
		System.out.println(name+" "+price);
	}
}
public class ThisVariable {

	public static void main(String[] args) {
		Furniture f=new Furniture("gas",1500);
		f.details();
	}

}
