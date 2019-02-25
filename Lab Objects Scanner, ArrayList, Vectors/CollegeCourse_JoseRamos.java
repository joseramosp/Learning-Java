/* Lab Objects - Scanner - ArrayList - Vectors
-- OBJECTIVE --
Students to familiarize students with writing classes to create and use objects
they have written and from the Java API.

  Name: Jose Ramos
  Date: February 21, 2019
*/

// Import the library that has Scanner.
import java.util.*;

// Creating a class called CollegeCourse_JoseRamos.
public class CollegeCourse_JoseRamos
{
    // Creating a method called addStudents that takes an array of type Student_JoseRamos as atribute.
    public void addStudents(Student_JoseRamos s [])
    {
        // The next for loop will stop when i equal the size of the array s.
        for(int i = 0; i< s.length; i++)
        {
            // Initializing an object in the index i of the array s.
            s[i] = new Student_JoseRamos();
            // Calling the method setInfo for the index i of the array s.
            s[i].setInfo();
            // Calling the method printInfo for the index i of the array s.
            s[i].printInfo();
        }
    }
}
