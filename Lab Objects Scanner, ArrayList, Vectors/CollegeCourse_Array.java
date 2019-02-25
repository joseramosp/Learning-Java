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
public class CollegeCourse_Array
{
    // Creating a method called addStudents that takes an array of type Student_JoseRamos as atribute.
    public void addStudents(Student_JoseRamos s [])
    {
        // The next for loop will stop when i equal the size of s.
        for(int i = 0; i< s.length; i++)
        {
            // Initializing an object in the index i of the array s.
            s[i] = new Student_JoseRamos();
            // Calling the method setInfo for the index i of the array s.
            s[i].setInfo();
        }

        // The next for loop will stop when i equal the size of s.
        for(int i = 0; i<s.length; i++)
        {
            // Calling the method printInfo for the index i of the array s.
            s[i].printInfo();
        }
    }// Ending the method addStudents.

    // Creating the main of the program.
    public static void main (String args[])
    {
        // Declraing and initializing the array studentArray with a size of 3.
        Student_JoseRamos studentArray[] = new Student_JoseRamos[3];
        // Creating an object of type CollegeCourse_Array called testObject.
        CollegeCourse_Array testObject = new CollegeCourse_Array();

        // Calling the method addStudents.
        testObject.addStudents(studentArray);
    }// Ending the main.
}// Ending the class.
