package SimpleprogramForInterview;

public class Print1to100withoutUsingLoop {

	public static void main(String[] args) {
		printNum(1);
	}
	
	public static void printNum(int num)
	{
		if(num<=100) //1<=100-T
		{
			System.out.println(num); //1
			num++;
			printNum(num);
			
		}
	}

}
