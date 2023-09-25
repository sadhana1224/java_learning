package patternprograms;

public class CountnoOfWords {

	public static void main(String[] args) {

		String str="i am from farmer family";
		
		String[] sp=str.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		System.out.println(sp.length);
	}

}
