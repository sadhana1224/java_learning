package PracticeForInterview;

public class SwitchCaseEX {

	public static void main(String[] args) {


		int w=1;
		String week="";
		switch(w)
		{
		case 0:
			week="sunday";
			break;
		case 1:
			week="monday";
			break;
		case 2:
			week="tuesday";
			break;
		case 3:
			week="wednesday";
			break;
		case 4:
			week="thursday";
			break;
		case 5:
			week="Friday";
			break;
		case 6:
			week="Saturday";
			break;
			
		default:
			System.out.println("this is not a day");
			
		}
		System.out.println(week);
	}

}
