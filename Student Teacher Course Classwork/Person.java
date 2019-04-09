public class Person
{
	// Declaring the variables name and iD of type String
	String name;
	String iD;

	// Creating a contructor that takes 2 arguments
	public Person(String n, String i)
	{
		name = n;
		iD = i;
	}

	// Modifying the default constructor to print a message when is used.
	public Person()
	{
		//default constructor
		System.out.println("no args constructor");
	}

	// Creating a method called printPersonInfo that will print a message using the property of the class.
	public void printPersonInfo()
	{
		System.out.println("Name: " + name + " ID: " + iD);
	}

	//adding main method for testing purpose
	public static void main(String args[])
	{
		// Creating an object using the empty constructor of the class.
		Person p1 = new Person();
		// Calling method printPersonInfo for object p1.
		p1.printPersonInfo();

		// Creating an object using the contructor that takes two arguments.
		Person p2 = new Person("Linda", "123Bob");
		p2.printPersonInfo();
	}//end main
}//end class
