package corejava;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		
		try
		{
			String s=null;
			System.out.println(s.charAt(3));
		}
	
		catch(NullPointerException ex)//string is null thats why nullpointexce used here
		{
			
			System.out.println("Inside Null pointer exception-->"+ ex.getMessage());
			//System.out.println(ex);
		}
		
		catch(Exception ex) // 
		{
			
			System.out.println(ex);
		}
		
		
		//String s=null;
		//System.out.println(s.charAt(3));
	}

}
