
// Including all the necessary packages for the class
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

// Declaring a class called StringScramble_Uncommented
public class StringScramble_Uncommented
{
	// Declaring two strings type variables
	String originalWord, scrambledWord;

	// Declaring two vectors with a initial size of 5
	Vector <String> scrambledWords = new Vector<String>(5);
	Vector <String> unscrambledWords = new Vector<String>(5);

	// Declaring a variable of type scanner
	Scanner userInput = new Scanner(System.in);

	// This method will take a input from the user and save it in a txt file called myOutputfile.txt
	private void writeWordToFile() throws IOException
{
	FileOutputStream fileByteStream = null;
    PrintWriter outToFile = null;

	fileByteStream = new FileOutputStream("myOutputfile.txt");
    outToFile = new PrintWriter(fileByteStream);

	Scanner UserInput = new Scanner(System.in);

	System.out.println("Word to write to file");
	outToFile.println(UserInput.next());

	outToFile.flush();
	fileByteStream.close();
}

	// This method will read the first 5 words found in the myOutputfile.txt and store them as a string in the Vector unscrambledWords
	public void readWordFromFile() throws IOException
{
	FileInputStream fileByteStream = null;
    Scanner inputFromFile = null;

    fileByteStream = new FileInputStream("myOutputfile.txt");
    inputFromFile = new Scanner(fileByteStream);

	// The next for will add the next 5 words in the unscrambledWords Vector
	for (int i = 0; i < 5; i++)
	{
		unscrambledWords.addElement(inputFromFile.next());
	}
	// Closing the file
	fileByteStream.close();
}

	// This method will scramble all the words in unscrambledWords and store them in scrambledWords
	public void scrambleWords()
	{
		// This for loop will run until i is equal to the size of unscrambledWords
		for (int i = 0; i < unscrambledWords.size(); i++)
		{
			// storing the string in the position i of the Vector unscrambledWords in originalWord
			originalWord = unscrambledWords.elementAt(i);

			// Creating an array of chart called tempHold with the size of the originalWord
			char tempHold [] = new char[originalWord.length()];

			// Creating an array of int called tempHold with the size of the originalWord
			int confirmRan[] = new int[originalWord.length()];

			// This for loop will scramble the word giving random place to the letter of the original word
			for (int b = 0; b < originalWord.length(); b++)
			{
				int randomNum = 0;
				do
				{
					randomNum = (int)((Math.random()*originalWord.length()));
				}while (confirmRan[randomNum] > 0);
				confirmRan[randomNum] = 1;
				tempHold[b] = originalWord.charAt(randomNum);
			}

			scrambledWord = new String(tempHold);
			scrambledWords.addElement(scrambledWord);
		}
	}

	// This method called playGame will
	public int playGame()
	{
		// Creating a interger with a random number from 0 to the size of the scrambledWords
		int vectorIndexes = (int)((Math.random()*scrambledWords.size()));

		// Select the vectorIndexes position in the vectors
		scrambledWord = scrambledWords.elementAt(vectorIndexes);
		originalWord = unscrambledWords.elementAt(vectorIndexes);

		// Declaring two integer with a initial value of 0
		int userCorrect = 0;
		int userGivesUp = 0;

		// Will run untill userCorrect equal 1 or userGivesUp equals 1
		while (userCorrect < 1 && userGivesUp < 1)
		{
			System.out.println("The scrambled word is " + scrambledWord);
			System.out.println("Enter your word guess");
			Scanner userInput = new Scanner(System.in);
			String userGuess = userInput.next();


			if (userGuess.equals(originalWord))
			{
				System.out.println("That answer is correct!");
				userCorrect = 1;
			}
			else
			{
				System.out.println("That guess is incorrect."); //tells user the guess is incorrect
				System.out.println("Do you want to try again? (Type 1 for No)(Type any other number to continue)"); //gives menu option to continue
				if (userInput.next().equals("1")) //confirms if the string entered is "1", so integer 1 was entered
				{
					userGivesUp = 1; //the user gave up
				}
			}
		}
		// Returns the int value userCorrect
		return userCorrect;
	}
}
