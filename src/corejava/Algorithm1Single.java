package corejava;  //right
import java.util.*;
public class Algorithm1Single {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
for(int i=0;i<ar.length;i++)
{
	boolean un=true;
	for(int j=0;j<ar.length;j++)
	{
		if(i!=j&&ar[i]==ar[j])
		{
			un=false;
			break;
		}
	}
	if(un)
	{
		System.out.println(ar[i]);
	}
}
	}

}
