package assignment;
class Method{
	void multi(int x,int y) //same method name(2 arguments)
	{
		int res=x*y;
		System.out.println(res);
	}
	void multi(int x,int y,int z)//same method name(3 arguments)
	{
		int res=x*y*z;
		System.out.println(res);
	}
	void multi(double x,double y) { //same method name(different data type)
		double res=x*y;
		System.out.println(res);
	}
}

public class MethodOver {

	public static void main(String[] args) {
		Method m=new Method();
		m.multi(2, 3);
		m.multi(2, 4, 5);
		m.multi(12.2, 13.3);
	}

}
