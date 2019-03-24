/* Word Scramble Lab
-- OBJECTIVE --
Create a game where the player can guess scrambled words.

  Name: Jose Ramos
  Date: March 14, 2019
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.*;
import java.util.*;

//Creating a class called WordScramble_JoseRamos.
public class WordScramble_JoseRamos {

    // The next line create three variables of type String.
    String originalWord, scrambledWord, userWord;

    // Creating a object of type scanner.
    Scanner userInput = new Scanner(System.in);

    // creating a method named readWordsFromFile that is returning an ArrayList.
    public ArrayList <String> readWordsFromFile(ArrayList <String> myWords) throws IOException
    {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object

        fileByteStream = new FileInputStream("myWords.txt"); // Assigning the .txt file to the variable fileByteStream.
        inFS = new Scanner(fileByteStream); // inFS is a scanner in fileByteStream.

        // The next while loop will add all words in the myWords.txt to myWords ArrayList.
        while(inFS.hasNext() == true) // If inFS has a word after the previous one.
        {
            myWords.add(inFS.next()); //  add the next word in inFS into myWords ArrayList.
        }

        // Returs the ArrayList myWords.
        return myWords;
    }

    // Creting a method called scarmbleWord that returns a String and takes one ArrayList as and an interger as parameters.
    public String scarmbleWord(ArrayList <String> word , int arrayIndex) throws IOException
    {

        // The next line will assign the value of the string in the word's arrayIndex to originalWord.
        originalWord = word.get(arrayIndex);

        // Creating an array of char with a length of the String originalWord.
        char tempHold [] = new char[originalWord.length()];

        // Creating an ArrayList of interger called letterIndex.
        ArrayList <Integer> letterIndex;
        // Giving the size of the length of originalWord to letterIndex.
        letterIndex = new ArrayList<Integer>(originalWord.length());

        // The next for loop will run until i equals to the length of originalWord.
        for(int i = 0; i < originalWord.length(); i++)
        {
            // Adding the i to the ArrayList letterIndex.
            letterIndex.add(i);
        }

        // The next for loop will run until i equals to the length of originalWord.
        for(int i = 0; i < originalWord.length(); i++)
        {
            // The next line will add to the position i of the array tempHold a random letter from originalWord without repeating.
            tempHold[i] = originalWord.charAt(letterIndex.remove((int)((Math.random()*letterIndex.size()))));
        }

        // scrambledWord is equal to the array tempHold as a String.
        scrambledWord = new String(tempHold);

        // Returning scrambledWord.
        return scrambledWord;
    }

    // The next method will return a int.
    int playGame() throws IOException
    {
        // Creating an ArrayList of string called myWords.
        ArrayList <String> myWords = new ArrayList<String>();

        // Creating a varible if type int with a initial value of 0.
        int points = 0;

        // The next line will call the method readWordsFromFile to store all words in myWords.txt into the ArrayList myWords.
        myWords = readWordsFromFile(myWords);

        // Creaing an ArrayList called wordIndex and then giving it the size of myWords.
        ArrayList <Integer> wordIndex;
        wordIndex = new ArrayList<Integer>(myWords.size());

        // The next for loop will run until i equals to the size of myWords.
        for(int i = 0; i < myWords.size(); i++)
        {
            wordIndex.add(i); // Adds i to wordIndex.
        }

        // The next for loop will run until i equals to the size of myWords.
        for(int i = 0; i < myWords.size(); i++)
        {
            // creating an int variable called randomWordIndex and Assigning a random value from wordIndex without repeating.
            int randomWordIndex = wordIndex.remove((int)((Math.random()*wordIndex.size())));

            // Printing out a message and then a word in the position randomWordIndex of myWords.
            System.out.print("\nGuess the next word: ");
            System.out.println(scarmbleWord(myWords, randomWordIndex) + "\n");

            // Taking an input from the user and storing it into userWord as a string.
            userWord = userInput.next();

            // Will run if userWord is equal to the string in position randomWordIndex of the ArrayList myWords
            if(userWord.equals(myWords.get(randomWordIndex)))
            {
                // The next lines will print a message and add 1 to points.
                System.out.println("Correct!");
                points = points + 1;
            }
            else
            {
                // Will print this message if userWord is not equal.
                System.out.println("Incorrect :(");
            }
        }
        // Returns points.
        return points;
    }

    // This is the main of the program.
    public static void main(String agrs []) throws IOException
    {
        // Creating an object of type WordScramble_JoseRamos called wordInputOutputObject.
        WordScramble_JoseRamos wordInputOutputObject = new WordScramble_JoseRamos();

        // Creating an object of type Menu_JoseRamos called menu.
        Menu_JoseRamos menu = new Menu_JoseRamos();

        // Creating an object of type Player_JoseRamos called player.
        Player_JoseRamos player = new Player_JoseRamos();

        // Creating an object of type Scanner called userInput.
        Scanner userInput = new Scanner(System.in);

        // Creating an int variable with a initial value of 0.
        int menuUserInput = 0;

        // Thw next while loop will run until menuUserInput equals to 5.
        while(menuUserInput != 5)
        {
            // Calling the method printMenu of the class Menu_JoseRamos.
            menu.printMenu();

            // Taking an input from the user as a int and assigning that value to menuUserInput.
            menuUserInput = userInput.nextInt();

            // creating a switch that will select the case menuUserInput.
            switch(menuUserInput)
            {
                case 1:

                    // Calling the method setUpPlayer of the class Player_JoseRamos.
                    player.setUpPlayer();
                    break;

                case 2:

                    // Calling the method playGame and assigning the returning value to the property totalPoints of player.
                    player.totalPoints = wordInputOutputObject.playGame();

                    // The next if statement will update the bestScore variable.
                    if(player.totalPoints > player.bestScore)
                    {
                        player.bestScore = player.totalPoints;
                    }

                    // The next three lines are printing a message.
                    System.out.println("");
                    System.out.println("Total points: " + player.totalPoints);
                    System.out.println("Best score: " + player.bestScore);
                    break;

                case 3:

                    // Calling the method printScores for the object player.
                    player.printScores();
                    break;

                case 4:

                    // The next three lines will print the game instructions.
                    System.out.println("\n************* Game instructions *************\n");
                    System.out.println("The computer is going to throw a scrambled word and you will \nhave to guess it to gain a point for each correct word.");
                    System.out.println("\nNow let's play and good luck ;)");

                    break;

                case 5: // This case will end the while loop.

                    // Printing a message saying bye.
                    System.out.println("Bye ༼ つ ಥ_ಥ ༽つ");
                    break;

                default: // This case will be selected if the user enter a not spected input.
                    System.out.println("\n" + menuUserInput + " is not an option (ಠ_ಠ)");
            }// Ending switch.
        }// Ending while loop.
    }// Ending main.
}// Ending class.
