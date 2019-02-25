/* Lab Objects - Scanner - ArrayList - Vectors
-- OBJECTIVE --
Students to familiarize students with writing classes to create and use objects
they have written and from the Java API.

  Name: Jose Ramos
  Date: February 21, 2019
*/

// Import the library that has Scanner AND ArrayList.
import java.util.*;

// Creating a class called CollegeCourse_ArrayList.
public class CollegeCourse_ArrayList
{
    // Creating a method called addStudents that takes an ArrayList of type Student_JoseRamos as atribute.
    public void addStudents(ArrayList <Student_JoseRamos> s)
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
            // The next line will add an object of type Student_JoseRamos to the ArrayList s.
            s.add(new Student_JoseRamos());

            // The next line is calling the method setInfo for object in the position i of the ArrayList s.
            s.get(i).setInfo();
        }

        // The next for loop will stop when i equal studentsSize.
        for(int i = 0; i< studentsSize; i++)
        {
            // Calling the method printInfo for the object in the position i of the ArrayList s.
            s.get(i).printInfo();
        }
    }// Ending method addStudents.

    // Creating the main of this program.
    public static void main (String args[])
    {
        // Creating an ArrayList that collect objects of type Student_JoseRamos.
        ArrayList <Student_JoseRamos> studentArray;
        // Initializing the vector studentArray.
        studentArray = new ArrayList<Student_JoseRamos>();

        // The next line is creating and initializing an object of type CollegeCourse_Vector.
        CollegeCourse_ArrayList testObject = new CollegeCourse_ArrayList();
        // Calling the method addStudents.
        testObject.addStudents(studentArray);
    }// Ending main.
}// Ending the class.
