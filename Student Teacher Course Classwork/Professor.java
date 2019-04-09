// Creating a class called Professor that extends from Person.
public class Professor extends Person
{
	String officeLoc;	// Creating a variable of type String.

	// Creating a constructor for the class Professor that takes 3 arguments
	public Professor(String officeLoc, String n, String i)
	{
		// Calling the constructor of the parent class using the variables n and i.
		super(n,i);

		// Assigning the value of officeLoc to the property officeLoc of the class.
		this.officeLoc = officeLoc;
	}

	// Method that will override the same method of the parent class
	public void printPersonInfo()
	{
		super.printPersonInfo();	// Calling the same method for the parent class.
		System.out.println(name + "'s office is located at " + officeLoc);	// Printing a message.
	}

	// Creating the main of the class.
	public static void main(String args[])
	{
		Professor s1 = new Professor("TC226", "Kristen","abc123");	// Creating a object of type Professor using the constructor that takes 3 arguments.
		s1.printPersonInfo();										// Calling the method printPersonInfo for the object s1.
	}//close main


}
