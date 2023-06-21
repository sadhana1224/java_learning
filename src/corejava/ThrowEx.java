package corejava;

public class ThrowEx {

	public static void main(String[] args) {
		ThrowException.ThrowExe(17);
	}

	class ThrowException
	{
		int age;
		static void ThrowExe(int age) {
			if(age<=18) {
				throw new ArithmeticException("age must be greater than 18");
			}
			else
			{
				System.out.println("age is greater than 18");
			}
		}
	}

}
