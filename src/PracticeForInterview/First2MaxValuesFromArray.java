package PracticeForInterview;

public class First2MaxValuesFromArray {

	public static void main(String[] args) {

		int[] ar= {34,12,55,64,43};
		
		int maxone=0;
		int maxtwo=0;
		
		for(int num:ar)
		{
			if(maxone<num) //0<34
			{
				maxtwo=maxone;
				maxone=num;
			}
			else if(maxtwo<num)
			{
				maxtwo=num;
			}
		}
		System.out.println(maxone);
		System.out.println(maxtwo);
	}

}
