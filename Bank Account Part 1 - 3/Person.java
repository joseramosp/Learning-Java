// Calling the package that is going to be needed.
import java.util.Scanner;

// Creating a class called
public class Person
{
	// Declaring the variables name and iD of type String
	String fName, lName;
	int id;

	// This method will set a value for the properties in the class.
	public void setInfo(String fN, String lN, int i)
	{
		fName = fN;
		lName = lN;
		id = i;
	}

	// This method will return the properties of the class in a string.
	public String getInfo()
	{
		String info = "Name: " + fName + " " + lName +  " ID: " + id;
		return info;
	}

	// This method will call the method getInfo and print what is returns.
	public void printInfo()
	{
		System.out.println(getInfo());
	}
}
