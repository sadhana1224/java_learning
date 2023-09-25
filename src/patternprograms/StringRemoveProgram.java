package patternprograms;

public class StringRemoveProgram {

	public static void main(String[] args) {

		String str="DbjHsdkjjh hi hisadhu";
		String rem=str.replace("d", "");
		System.out.println(rem);
		
		String low=str.replaceAll("([a-z])", "");
		System.out.println(low);
		
		String sub=str.replaceAll("sadhu", "");
		System.out.println(sub);
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.deleteCharAt(sb.length()-1));
		
		
	}

}
