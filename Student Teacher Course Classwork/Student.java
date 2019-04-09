// Creating a class called Student that extends from Person.
public class Student extends Person
{
	double gPA;	// Creating a variable of type double.

	// Creating a constructor for the class Student that takes 3 arguments
	public Student(double gAvg, String n, String i)
	{
		super(n,i); // Calling the constructor of the parent class using the variables n and i.
		gPA = gAvg;	// // Assigning the value of gAvg to the property gPA of the class.
	}

	// Creating a method called printPersonInfo that will call the same method for the parent class and then print a message.
	public void printPersonInfo()
	{
		super.printPersonInfo();
		System.out.println(name + "'s G.P.A: " + gPA);
	}

	// Main of the class Student
	public static void main(String args[])
	{
		Student s1 = new Student(3.7, "Kristen","abc123");	// Creating a object of type Student using the constructor that takes 3 arguments.
		s1.printPersonInfo(); 								// Calling the method printPersonInfo for the object s1.
	}//close main


}
