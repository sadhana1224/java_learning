package PracticeForInterview;

public class GetRidOfMultipleSpaces {

	public static void main(String[] args) {

		String str="string   with   multiple spaces     i want     to remove from  ";
		
		String res=str.replaceAll("\\s+", " ");
		
		System.out.println(res);
	}

}
