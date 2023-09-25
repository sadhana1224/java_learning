package patternprograms;

public class Fibanocci {

	public static void main(String[] args) {

		int f1=0,f2=1;
		System.out.println(f1+" "+f2);
		for(int i=2;i<=10;i++)
		{
			int f3=f1+f2;
			System.out.println(f3);
			
			f1=f2;
			f2=f3;
		}
	}

}
