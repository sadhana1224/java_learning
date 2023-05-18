package basics;
//oops concepts
public class ObjMethEx {
	int num=10;

	public void addTwoNum(int a,int b)   //create a method and passing the arguments
	{
		int res=a+b;
		System.out.println("the result is "+ res);
	}

	public static void main(String[] args) {
		ObjMethEx obj1=new ObjMethEx();
		System.out.println(obj1.num);
		obj1.addTwoNum(10,12);      //call a method 

		ObjMethEx obj2=new ObjMethEx();
		System.out.println(obj2.num);   //create an another object and access the same variable
		obj2.addTwoNum(13,12);    //call a method ...this is the code reusability
	}

}
