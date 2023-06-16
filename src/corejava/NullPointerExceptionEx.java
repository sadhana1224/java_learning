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
			System.out.println(ex);
		}
		/*
		catch(Exception ex) //if i dont't know which exception i will throw like nullpointer ,arithmetic and all, so i use exception class 
		{
			System.out.println(ex);
		}
		*/
	}

}
