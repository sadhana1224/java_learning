package corejava;

public class MultipleCatch {

	public static void main(String[] args) {

		
		try {
			String s=null;
			System.out.println(s.charAt(3));
		}
		catch(ArithmeticException e) //above try block is not a arithmetic exception 
		{
			System.out.println(e);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
