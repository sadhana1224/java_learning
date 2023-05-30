package assignment; //convert string to string array

public class StringArray {
	public static void main(String[] args) {
		//first method
	/*	String name="sadhana suba"; //intialize the string
		//int namelength=name.length();
		
		String[] splitS=name.split(" "); //the resulting words are stored in 'splitS' array, which is then printed using for loop
		System.out.println("Split length is : "+splitS.length);
	    for(int i=0;i<splitS.length;i++)  //The loop iterates over the array indexes from 0 to 'splitS.length'
	    {
	    	//i=0  0<2  -->sadhana(0th index)
	    	//i=1  1<2  -->suba
	    	//i=2   2<2  -->loop will stop
	    	System.out.println("split words are : "+splitS[i]); 
	    	
	    	
	    }
		
	    System.out.println(splitS[1]);
	}
	
}*/
		//2nd method
	 String str="sadhanaVengadashalam";
	 String[] splitS1=str.split("");
	 System.out.println("split length is : "+splitS1.length);
	 for(int i=0;i<splitS1.length;i++)
	 {
		 System.out.println(splitS1[i]); 
	 }
	 System.out.println(splitS1[6]); 
}
}