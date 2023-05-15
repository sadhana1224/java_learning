package basics;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=30, b=25, c=20;
		boolean val=false;
		System.out.println("the value is --> "+ !val);
		if((a>b)&&(b<c))
		{
			System.out.println("if block");
		}
		else if((a>b)||(b<c))
		{
			System.out.println("Else if block");
		}
		else
		{
			System.out.println("else block");
		}

	}

}
