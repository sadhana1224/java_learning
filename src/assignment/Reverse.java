package assignment;
public class Reverse{
	public void reversingString(String str)
	{
		String str1=str;
		String rever=""; //empty string
		int length=str.length();
		System.out.println("length of the string : "+ length);
		
		for(int i=length-1;i>=0;i--)
		{
			// i=7-1=6  ; 6>=0;i--  true 
			//i=6-1=5   ;5>=0;i-- true
			rever=rever+str1.charAt(i);
			//rever=""+6(a)
			//rever=a+5(n)
			
		}
		System.out.println("reverse a string : "+rever);
	}

public static void main(String[] args)
{
	Reverse obj=new Reverse();
	obj.reversingString("sadhana");
	
	Reverse obj1=new Reverse();
	obj1.reversingString("guvi");
}
}


