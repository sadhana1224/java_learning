package assignment;

public class Grade {



	public void CheckPassorFail(int mark,String name)
	{
		if (mark>=40)
		{
			System.out.println("Student is pass");

		}
		else
		{
			System.out.println("Student is Fail");
		}
		System.out.println("Student name is : "+name + " and the Mark  :"+ mark);

	}
	public void CheckGrade(int mark)
	{
		if(mark>=85)
		{
			System.out.println("Grade A");
		}
		else if(mark>=70 && mark<85)
		{
			System.out.println("Grade B");
		}
		else if(mark>=50 && mark<70)
		{
			System.out.println("Grade C");
		}
		else if(mark<50 && mark>40)
		{
			System.out.println("Grade D");
		}
		else

		{
			System.out.println("Stuent has failed and hence grade is not given");
		}

	}


	public static void main(String[] args) {
		Grade s1=new Grade();
		s1.CheckPassorFail(85,"sadhana");
		s1.CheckGrade(85);

		Grade s2=new Grade();
		s2.CheckPassorFail(75,"anu");
		s2.CheckGrade(75);

		Grade s3=new Grade();
		s3.CheckPassorFail(52,"Raj");
		s3.CheckGrade(52);

		Grade s4=new Grade();
		s4.CheckPassorFail(43,"Logesh");
		s4.CheckGrade(43);

		Grade s5=new Grade();
		s5.CheckPassorFail(12,"suba");
		s5.CheckGrade(12);


	}



}


