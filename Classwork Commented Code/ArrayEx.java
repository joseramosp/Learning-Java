import java.util.*; // Import allows access to objects in this folder

public class ArrayEx // Open class declar
{
	Scanner userInp = new Scanner(System.in);
	String [] names ;

	public void setVal()
	{	System.out.println("how many people in your family?");
		int familySize = userInp.nextInt();
		names = new String[familySize];

		System.out.println("Enter the names of the people in your family" + " " + names.length);
		for(int i = 0; i <names.length; ++i)
		{
			names[i]=userInp.next();
		}
	}

	public void printVal()
	{
		System.out.println("You have: " +names.length+ " Their names are: ");
		for(int i = 0; i<names.length; ++i)
		{

			System.out.println(i + " : " +names[i]);
		}
	}
	public static void main(String args[]) // Main method runs the program
	{
		ArrayEx ve = new ArrayEx();
		ve.setVal();	// Calling all of the methods associate with the objests
		ve.printVal();
	}


}
