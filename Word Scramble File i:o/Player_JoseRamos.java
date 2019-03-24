/* Word Scramble Lab
-- OBJECTIVE --
Create a game where the player can guess scrambled words.

  Name: Jose Ramos
  Date: March 14, 2019
*/

import java.util.*;

// Creating a class called Player_JoseRamos that extends from Person_JoseRamos.
public class Player_JoseRamos extends Person_JoseRamos
{
    // creating an object of type Scanner.
    Scanner userInput = new Scanner(System.in);

    // Creating two int varibles with an initial value of 0.
    int totalPoints = 0;
    int bestScore = 0;

    // Creating a method called addPoint.
    void addPoint()
    {
        totalPoints++; //Adding 1 to the value of totalPoints.
    }

    // Crating a method called setUpPlayer.
    void setUpPlayer()
    {
        // The next lines will print a messaage and assign an input from the user to the variable name as a string.
        System.out.println("Enter your name: ");
        name = userInput.next();
    }

    // Creatinf a method called printScores.
    void printScores()
    {
        // The next if runs if name is not null
        if(name != null)
        {
            // Printing a message giving all user scores.
            System.out.println("\n" + name +" best score: " + bestScore);
            System.out.println(name +" last score: " + totalPoints);
        }
        else {
            // Printing a message giving all user scores.
            System.out.println("\nPlayer best score: " + bestScore);
            System.out.println("Player last score: " + totalPoints);
        }
    }
}
