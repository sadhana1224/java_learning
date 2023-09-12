package PracticeForInterview;

public class FibonacciSeries {

	public static void main(String[] args) {

		int f1=0,f2=1;
		System.out.print(f1+" "+f2);
		
		for(int i=2;i<=10;i++)
		{
		int	f3=f1+f2;
			System.out.print(" "+f3); //f3=0+1=1......1+1=2....1+2=3
			f1=f2; //f1=1  //f1=1
			f2=f3;//f2=1  //f2=2
		}
	}

}
