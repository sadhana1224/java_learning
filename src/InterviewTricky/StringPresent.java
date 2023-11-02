package InterviewTricky;

public class StringPresent {

	public static void main(String[] args) {

		String str="i enjoy doing codekata codekata enjoy";
		
		String check="enjoy";
		int count=0;
		String[] sp=str.split(" ");
		
		
			if(str.contains(check))
			{
				count++;
				System.out.println(count);
			}
			else
			{
				System.out.println("-1");
			}
		
		
	}

}
