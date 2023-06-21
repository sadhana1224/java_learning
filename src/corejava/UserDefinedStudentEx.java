package corejava;

public class UserDefinedStudentEx {
	int mark;
	static void validateMark(int mark)
	{
		try
		{
			if(mark<=40)
			{
			  throw new MarkValidation("mark must not be less than 40");
			}
			else
			{
				System.out.println("martk is greater than 40");
			}
		}
		catch(Exception ex)
		{
			System.out.println("inside catch block");
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		validateMark(35);
	}

}
class MarkValidation extends Exception
{
	MarkValidation()
	{
		System.out.println("Students marks should be greater than 40");
	}
	MarkValidation(String str)
	{
		System.out.println(str);
	}
}