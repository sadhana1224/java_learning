package assignment;

public class RemoveChar {
	
	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		sb.append("java program");      //insert the string
		sb.deleteCharAt(0);      //delete the character at specified position
		System.out.println(sb);
	}

}
