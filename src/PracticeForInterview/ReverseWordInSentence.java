package PracticeForInterview;

public class ReverseWordInSentence {

	public static void main(String[] args) {

		String str="my name is sadhana";
		String rev="";
		String[] sp=str.split(" ");
		
		for(int i=0;i<sp.length;i++)
		{
			System.out.print(sp[i]+" ");
		}
		System.out.println();
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.print(sp[i]+" ");
			//or 
			rev=rev+sp[i]+" ";
		}
		System.out.println();
		System.out.println(rev);
	}

}
