package PracticeForInterview;

public class Swapt2numWousingTemp {

	public static void main(String[] args) {

		int a=10, b=15;
		
		a=a+b;
		b=a-b; //25-15=10
		a=a-b; //25-10=15
		
		System.out.println(a+" "+b);
	}

}
