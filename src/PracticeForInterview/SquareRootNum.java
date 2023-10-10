package PracticeForInterview;

public class SquareRootNum {

	public static void main(String[] args) {

		int num=25;
		double res=Math.sqrt(num);
		System.out.println(res);
		
		//2nd approach --w/o sqrt method
		
		int n=9;
		double temp;
		double sr=n/2;  //9/2=4
		
		do {
			temp=sr; //4 ,
			sr=(temp+(n/temp))/2; // (4+(9/4))/2=(4+2)/2=3
			
		}while((temp-sr)!=0); //4-3 !=0 (again go loop) ,,,,
		//if equals print the sr value
		System.out.println(sr);
		int a = 0 ,b=10;
		if(a>b)
		{
			if(a<10)
			{
				
			}
		}
		
	}

}
