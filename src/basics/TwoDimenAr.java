package basics;  //my example

public class TwoDimenAr {

	public static void main(String[] args) {

		char marks[][]=new char[3][3];

		marks[0][0]='a';
		marks[0][1]='b';
		//marks[0][2]=15;

		marks[1][0]='v';
		marks[1][1]='d';
		marks[1][2]='w';

		marks[2][0]='g';
		marks[2][1]='q';
		marks[2][2]='z';
		System.out.println(marks[0][2]);
		for(int i=0;i<marks.length;i++)
		   {
			   for(int j=0;j<marks.length;j++)
			   {
				   System.out.println("first array :  "+marks[i][j]);
			   }
		   }
		
		int marks1[][]= { {1,2,3},{2,6,8},{7,8,4}};

   for(int i=0;i<marks1.length;i++)
   {
	   for(int j=0;j<marks1.length;j++)
	   {
		   System.out.println("second array : "+marks1[i][j]);
	   }
   }
   
   
	}

}
//default value
//int=0
//byte=0
//short=0
//float=0.0
//double=0.0
//long=0
//char=square box
//String=null