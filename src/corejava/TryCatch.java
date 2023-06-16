package corejava;

public class TryCatch {

	public static void main(String[] args) {
		/*
		 * try
		 * {
		 *		code which will throw exception
		 * }
		 * catch(Exception ex)
		 * {	
		 * 	thrown exception would be caught here
		 * 
		 * }
		 */
		int a=5, b=0, c;
		
		try {
		 c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("outside of try and catch block");
	}

}
