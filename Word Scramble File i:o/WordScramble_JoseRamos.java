/* Guess What Number Lab
-- OBJECTIVE --
Create a game where the player can guess scrambled words.

  Name: Jose Ramos
  Date: March 14, 2019
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.*;
import java.util.*;

public class WordScramble_JoseRamos {      //(int wordIndex)

    String originalWord, scrambledWord, userWord;
    Scanner userInput = new Scanner(System.in);

    public ArrayList <String> readWordsFromFile(ArrayList <String> myWords) throws IOException
    {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object

        fileByteStream = new FileInputStream("myWords.txt");
        inFS = new Scanner(fileByteStream);

        while(inFS.hasNext() == true)
        {
            myWords.add(inFS.next());
        }

        return myWords;
    }

    public String scarmbleWord(ArrayList <String> word , int arrayIndex) throws IOException
    {

        originalWord = word.get(arrayIndex);
        char tempHold [] = new char[originalWord.length()];

        ArrayList <Integer> letterIndex;
        letterIndex = new ArrayList<Integer>(originalWord.length());

        for(int i = 0; i < originalWord.length(); i++)
        {
            letterIndex.add(i);
        }

        for(int i = 0; i < originalWord.length(); i++)
        {
            tempHold[i] = originalWord.charAt(letterIndex.remove((int)((Math.random()*letterIndex.size()))));
        }

        scrambledWord = new String(tempHold);

        return scrambledWord;
    }

    int playGame() throws IOException
    {
        ArrayList <String> myWords = new ArrayList<String>();

        int points = 0;

        myWords = readWordsFromFile(myWords);

        for(int i=0; i<myWords.size(); i++)
        {
            System.out.print("Guess the next word: ");
            System.out.println(scarmbleWord(myWords, i) + "\n");

            userWord = userInput.next();

            if(userWord.equals(myWords.get(i)))
            {
                System.out.println("Correct!");
                points = points + 1;
            }
            else
            {
                System.out.println("Incorrect :(");
            }
            System.out.println("");
        }
        return points;
    }

    public static void main(String agrs []) throws IOException
    {
        WordScramble_JoseRamos wordInputOutputObject = new WordScramble_JoseRamos();
        Menu_JoseRamos menu = new Menu_JoseRamos();

        Scanner userInput = new Scanner(System.in);

        int menuUserInput = 0;

        while(menuUserInput != 4)
        {
            menu.printMenu();
            menuUserInput = userInput.nextInt();
            switch(menuUserInput)
            {
                case 1:


                    break;

                case 2:
                    //System.out.flush();
                    System.out.println("");
                    System.out.println("Total points: " + wordInputOutputObject.playGame());
                    break;

                case 3:

                    System.out.println("Printing game instructions");
                    break;

                case 4:

                    System.out.println("Bye ༼ つ ಥ_ಥ ༽つ");
                    break;

                default:
                    System.out.println("\n" + menuUserInput + " is not an option (ಠ_ಠ)");
            }
        }
        //System.out.println(wordInputOutputObject.playGame());
    }
}
