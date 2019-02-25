/* Lab Objects - Scanner - ArrayList - Vectors
-- OBJECTIVE --
Students to familiarize students with writing classes to create and use objects
they have written and from the Java API.

  Name: Jose Ramos
  Date: February 21, 2019
*/

// Import the library that has Scanner AND Vector.
import java.util.Scanner;

// Creating a class called Student_JoseRamos.
public class Student_JoseRamos
{//open class
	//declaring member variables to store info about student obj
	String name;
	double gpa;

    // Creating an instance of Scanner.
	Scanner userInput = new Scanner(System.in);

    // Creating a method called setInfo.
	public void setInfo()
	{
        // Printing a menssage.
		System.out.println("Enter name:");
        // Taking an input from the user as a String and storing the value in name.
        name = userInput.nextLine();
        System.out.println("Enter G.P.A:");
        // Taking an input from the user as a double and storing the value in gpa.
        gpa = userInput.nextDouble();
	}// Ending method setInfo.

    // Creating a method called getInfo that will return a String.
	public String getInfo()
	{
        // Declaring a variable of String type and storing a message with student name and GPA.
		String info = "Student Name: " + name + "\tGPA: " +gpa;
        // Returning info.
        return info;
	}// Ending method getInfo.

    // Creating a method called printInfo.
    public void printInfo()
	{
        // Calling the method getInfo to print the student info.
		System.out.println(getInfo());
	}// Ending method printInfo.

}//close class
