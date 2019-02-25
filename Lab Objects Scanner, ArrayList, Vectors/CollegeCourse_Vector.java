/* Lab Objects - Scanner - ArrayList - Vectors
-- OBJECTIVE --
Students to familiarize students with writing classes to create and use objects
they have written and from the Java API.

  Name: Jose Ramos
  Date: February 21, 2019
*/

// Import the library that has Scanner AND Vector.
import java.util.*;

// Creating a class called CollegeCourse_Vector.
public class CollegeCourse_Vector
{
    // Creating a method called addStudents that takes a vector of type Student_JoseRamos as atribute.
    public void addStudents(Vector <Student_JoseRamos> s)
    {
        // Creating an instance of Scanner.
        Scanner userInput = new Scanner(System.in);

        // Printing a messsage.
        System.out.println("How many students do you want to add?");

        // Taking an input from the user as an integer and storing the value in studentsSize.
        int studentsSize = userInput.nextInt();

        // The next for loop will stop when i equal studentsSize.
        for(int i = 0; i< studentsSize; i++)
        {
            // The next line will add an object of type Student_JoseRamos to the vector s.
            s.add(new Student_JoseRamos());

            // The next line is calling the method setInfo for object in the position i of the verctor s.
            s.get(i).setInfo();
        }

        // The next for loop will stop when i equal studentsSize.
        for(int i = 0; i< studentsSize; i++)
        {
            // Calling the method printInfo for the object in the position i of the vector s.
            s.get(i).printInfo();
        }
    }// Ending method addStudents.

    // Creating the main of this program.
    public static void main (String args[])
    {
        // Creating a vector that collect objects of type Student_JoseRamos.
        Vector <Student_JoseRamos> studentArray;
        // Initializing the vector studentArray.
        studentArray = new Vector<Student_JoseRamos>();

        // The next line is creating and initializing an object of type CollegeCourse_Vector
        CollegeCourse_Vector testObject = new CollegeCourse_Vector();
        // Calling the method addStudents.
        testObject.addStudents(studentArray);
    }// Ending main.
}// Ending the class.
