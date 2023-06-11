package oops;

/*
 * Syntax for creating an interface
 * 
interface interfaceName
{
	
}
*/

interface BikeDetails
{
	void gear();
	void acclerate();
}

public class InterfaceEx1 implements BikeDetails {
	
	@Override
	public void gear() {
			System.out.println("Changing the gear");			
	}
	

	@Override
	public void acclerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate the bike");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceEx1 obj= new InterfaceEx1();
		obj.gear();
		obj.acclerate();
	}

	

}
