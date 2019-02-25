import java.util.*; // Import the library that has Scanner AND ArrayList

// Creating a class called ArrayListExample.
public class ArrayListExample
{
	Scanner userInp = new Scanner(System.in); // Creating instance of scanner.
	ArrayList <String> names; // Declaring an ArrayList of type String called names.

	// Creating an method called setVectVal
	public void setVectVal()
	{
		// The next line is printing a message
		System.out.println("how many people in your family?");

		// Taking an integer input and storing the value in a variable called familySize.
		int familySize = userInp.nextInt();

		// Assigning a size to the ArrayList names.
		names = new ArrayList<String>(familySize);

		// Printing a message
		System.out.println("Enter the names of the people in your family");

		// The next for loop will stop running when i = familySize.
		for(int i = 0; i < familySize; i++)
		{
			// The next line will take an input as a string and add that value to the ArrayList names.
			names.add(userInp.next()); // Changed .nextLine for .next
		}
	}// Ending method.

	// Creating an method called setVectVal
	public void printVectVal()
	{
		// Printing a message saying how many values are stored in the ArrayList names.
		System.out.println("You have: " +names.size()+ " Their names are: ");

		// This for loop will run until i equal to the size of names.
		for(int i = 0; i<names.size(); i++)
		{
			String name = names.get(i); // Return the value at the position of names[i]
			System.out.println(name); // Printing the value of name.
		}
	}

	// Creating the main of this program.
	public static void main(String args[])
	{
		// Creating a object of type ArrayListExample.
		ArrayListExample ve = new ArrayListExample();

		// Calling all the methods created.
		ve.setVectVal();
		ve.printVectVal();
	}


}
