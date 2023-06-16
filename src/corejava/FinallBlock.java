package corejava;

public class FinallBlock {

	public static void main(String[] args) {
		try {
				String str="123";
				//String str="abc";
				System.out.println(Integer.parseInt(str));
			}
			catch(Exception ex)
			{
				System.out.println("user defined Exception Message: -->number format exception");
				System.out.println(ex);
			}
		finally { //finally is not mandatory
			System.out.println("Inside Finally Block-> this would be executed whether exception is thrown or not");
		}
	}

}
