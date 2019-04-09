// Creating a class called Course
public class Course
{

	String courseName;			// Declaring a String type varable
	Person schoolPeople [];		// Declaring Array of type Person called schoolPeople
	int numP;					// Declaring an integer variable

	// Constructor for the class that takes one String argument
	public Course(String n)
	{
		courseName = n;	// assigning the value of n to courseName

	}

	// Creating a method called setUpCourse that will setup few of the values in the array schoolPeople
	public void setUpCourse()
	{
	schoolPeople = new Person[3];	// Assigning a size to the array schoolPeople.
	schoolPeople[0] = new Professor("tc226","Kristen","abc123"); // initializing the index 0 of the array schoolPeople as a Professor.
	schoolPeople[1] = new Student(4.0,"Charlie","hunking09"); // initializing the index 1 of the array schoolPeople as a Student
	schoolPeople[0].printPersonInfo();	// Calling the method printPersonInfo for the schoolPeople[0].
	schoolPeople[1].printPersonInfo();  // Calling the method printPersonInfo for the schoolPeople[1].
	}

	// Creating the main of the program
	public static void main(String args [])
	{
		Course c1 = new Course("CS 1");	// Creating an object of instance Course.
		c1.setUpCourse();				// Calling the method setUpCourse for the object c1.
	}

}
