package PracticeForInterview;
//find the maximum and minimum element in an array
public class MaxAndMinElementArray {

	public static void main(String[] args) {

		int a[]= {80,50,30,75,90,14};
		int max=a[0];//80
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)  //50>80-F  //30>80->F  //75>80->F  //90>80->T
			{
				max=a[i];  //max=90
			}
		}
		System.out.println("Maximum element in an array-->"+max);
		
		int min=a[0];//80
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)   //50<80->T  //30<50-->T //75<30->F  //90<30->F  //14<30->T
			{
				min=a[i];  //14
			}
		}
		System.out.println("Minimum element in an array-->"+min);
	}

}
