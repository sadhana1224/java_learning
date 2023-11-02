package InterviewTricky;

public class SwapEvenandODDchars {

	public static void main(String[] args) {

		String str="codekata";
		
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length-1;i+=2)
		{
			char temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
			System.out.print(c[i]+""+c[i+1]);
		}
		
		
	}

}
