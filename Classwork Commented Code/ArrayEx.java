import java.util.*; // Import allows access to objects in this folder

public class ArrayEx // Open class declar
{
	// Creating a instance of type Scanner that is going to be used to take an input.
	Scanner userInp = new Scanner(System.in);
	// Declaring an array of type String.
	String [] names ;

	// Creating a method called setVal to store the values in the array names.
	public void setVal()
	{
		// Printing a message
		System.out.println("how many people in your family?");

		// Taking an integer input and storing the value in a variable called familySize.
		int familySize = userInp.nextInt();
		// Assigning the size of "familySize" to the array names.
		names = new String[familySize];

		// The next line is printing a message and the size of the array names.
		System.out.println("Enter the names of the people in your family" + " " + names.length);

		// This for loop will receive an input as String from the user and store it in a position of the array names.
		for(int i = 0; i <names.length; ++i)
		{
			// Storing the input from the user in names[i] as a string.
			names[i]=userInp.next();
		}
	}

	// Creating a method called printVal to printout all the values in the array names.
	public void printVal()
	{
		// Printing a message saying how many names are stored in the array names.
		System.out.println("You have: " +names.length+ " Their names are: ");

		// The next for loop is printing all the values stored in the array names.
		for(int i = 0; i<names.length; ++i)
		{
			// printing the the value of a and the values stored in names[i].
			System.out.println(i + " : " +names[i]);
		}
	}

	// Creating the main of the program.
	public static void main(String args[]) // Main method runs the program
	{
		// Creating an object of type ArrayEx.
		ArrayEx ve = new ArrayEx();

		// Calling all of the methods associate with the objests
		ve.setVal();
		ve.printVal();

	}// End of the main
}// End of the class
