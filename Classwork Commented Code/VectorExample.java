import java.util.*; // Import the library that has Scanner AND ArrayList

// Creating a class called VectorExample.
public class VectorExample
{

	Scanner userInp = new Scanner(System.in); // Creating instance of scanner.
	Vector <String> names; // Declaring an ArrayList of type String called names.

	// Creating an method called setVectVal.
	public void setVectVal()
	{
		// Assigning the size of 4 to the Vector names.
		names = new Vector<String>(4);

		// Printing a message.
		System.out.println("Enter the names of the people in your family");

		// The next for will stop when i equal to the size of the Vector names.
		for(int i = 0; i <names.capacity(); i++)
		{
			// Taking an input from the user as string and adding that value to the Vector names.
			names.addElement(userInp.nextLine());
		}
	} // Ending method.

	// Creating an method called printVectVal.
	public void printVectVal()
	{
		// Printing a message saying how many values are stored in the Vector names.
		System.out.println("You have: " +names.size()+ " Their names are: ");

		// This for loop will run until i equal to the size of names.
		for(int i = 0; i<names.size(); i++)
		{
			String name = names.elementAt(i); // Return the value at the position of names[i]
			System.out.println(name); // Printing the value of name.
		}
	}

	// Creating the main of this program.
	public static void main(String args[])
	{
		VectorExample ve = new VectorExample(); // Creating a object of type ArrayListExample.

		// Calling all the methods created.
		ve.setVectVal();
		ve.printVectVal();
	}


}
