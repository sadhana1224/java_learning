package basics;

public class ForEachEx {

	public static void main(String[] args) {
  
		int[] marks= {10,20,30,40,50};
		
	/*	//for loop
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		*/
		
		//syntax for for each loop
		//for(datatype var: collection (or array))
		
		for(int eachMark:marks)
		{
		System.out.println(eachMark);
		}
			
	}

}
