package basics;  //my example

public class ArrayExafordefaultValue {

	public static void main(String[] args) {


		/*int marks[]=new int[3];   //first way
		 marks[0]=12;
		 marks[1]=20;
		 //marks[2]=45;

		 System.out.println(marks[2]);


	int marks1[]= {10,20,30,40};

	int[] marks2= {25,65,87,34,90};


	System.out.println("size of an array : "+ marks.length);

	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i]);
	}
		 */

		//byte

		/*short mark[]=new short[3];
		mark[0]=1;
		mark[1]=2;

		System.out.println("byte "+mark[2]);  //find the default value for byte  ...Answer =0;

		for(int i=0;i<mark.length;i++)             
		{
			System.out.println(mark[i]);
		}
	//short default value...short answer=0;
		 * */


		//float

		/*	float mark[]=new float[3];
		mark[0]=12;
		mark[2]=11;

		System.out.println(mark[1]);      //float default value    ...ans=0.0
		for(int i=0;i<mark.length;i++)
		{
			System.out.println(mark[i]);
		}
		 */

		//double

		/*long mark[]=new long[3];    //double default value...Answer=0.0
		mark[0]=345;
		mark[1]=223;

		System.out.println(mark[2]);     
		for(int i=0;i<mark.length;i++)
		{
			System.out.println(mark[i]);
		}

		//long default value...Answer is =0

		 */
		char name[]=new char[3];
		name[0]='d';
		name[1]='c';

		System.out.println(name[2]);

		//character default value...Ans=special character some square

		String name1[]=new String[3];
		name1[0]="sadhu";
		name1[1]="suba";

		System.out.println(name1[2]);
		//string default value....Ans=null
	}
}

//default value
//  byte=0
// short=0
//int=0
//float=0.0
//double=0.0
//long=0
//char= some square box
//String=null
