package assignment;

public class ArithmeticOperation {
		public int Addition(int x , int y)
	{

		int res=x+y;
		return res;
	}
	public int Subtraction(int x,int y)
	{
		int res=x-y;
		return res;
	}
	public float Multiplication(float x,float y) 
	{
		float res=x*y;
		return res;
	}
	public double Division(double x,double y)
	{
		return x/y;
	}
	public int Modulo(int x,int y)
	{
		return x%y;
	}
	public static void main(String[] args) {
		ArithmeticOperation obj1=new ArithmeticOperation();
		int result1=obj1.Addition(12,2);
		System.out.println("Addition of two number is :"+result1);

		ArithmeticOperation obj2=new ArithmeticOperation();
		int result2=obj2.Subtraction(10, 5);
		System.out.println("Subtraction of two number is :"+result2);

		ArithmeticOperation obj3=new ArithmeticOperation();
		float result3=obj3.Multiplication(12, 12);
		System.out.println("Multiplication of two number is :"+result3);

		ArithmeticOperation obj4=new ArithmeticOperation();
		double result4=obj4.Division(101.0,2.0);
		System.out.println("Divison of two number is :"+result4);;


		ArithmeticOperation obj5=new ArithmeticOperation();
		int result5=obj5.Modulo(25,3);
		System.out.println("Modulo of two number is :"+result5);

	}

}
