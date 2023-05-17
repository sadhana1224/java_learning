package assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f1=0, f2=1;
		/*int f3=f2+f1;
		int f4=f3+f2;
		int f5=f4+f3;
		int f6=f5+f4;
		int f7=f6+f5;
		System.out.println("The fibonacci series is :" + f1 + f2+ f3 +f4 + f5 +f6 + f7);*/
		System.out.println(f1 +" "+ f2);
		for(int i=2;i<=10;++i)
		{
			int f3=f2+f1;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
    
