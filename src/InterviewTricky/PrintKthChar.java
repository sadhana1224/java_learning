package InterviewTricky;

public class PrintKthChar {

	public static void main(String[] args) {

		String str="String";
		int k=3;
		int l=str.length();
		for(int i=k-1;i<l;i+=k)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}

}
