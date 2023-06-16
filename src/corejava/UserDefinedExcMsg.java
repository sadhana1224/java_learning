package corejava;

public class UserDefinedExcMsg {

	public static void main(String[] args) {

		try {
		//	String str="123";
			String str="abc";
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception ex)
		{
			System.out.println("user defined Exception Message: -->number format exception");
			System.out.println(ex);
		}
	}

}
//why the output is number format exception, because we assigned a string="abc"
//try String str=123; // output will be 123