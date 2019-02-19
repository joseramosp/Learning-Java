import java.util.*; // Import the library that has Scanner AND ArrayList

public class ArrayListExample
{
	Scanner userInp = new Scanner(System.in); // Creating instance of scanner
	ArrayList <String> names;

	public void setVectVal()
	{	System.out.println("how many people in your family?");
		int familySize = userInp.nextInt();
		names = new ArrayList<String>(familySize);

		System.out.println("Enter the names of the people in your family");
		for(int i = 0; i < familySize; i++)
		{
			names.add(userInp.nextLine());
		}
	}

	public void printVectVal()
	{
		System.out.println("You have: " +names.size()+ " Their names are: ");
		for(int i = 0; i<names.size(); i++)
		{
			String name = names.get(i); // return the value at the position of names[i]
			System.out.println(name);
		}
	}
	public static void main(String args[])
	{
		ArrayListExample ve = new ArrayListExample();
		ve.setVectVal();
		ve.printVectVal();
	}


}
