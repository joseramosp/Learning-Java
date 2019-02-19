/* Guess What Number Lab
-- OBJECTIVE --
To use a decision constructs and loop constructs to play a simple guessing game.

  Name: Jose Ramos
  Date: February 17, 2019
*/

import java.util.Scanner; //PACKAGE TO USE USER INPUT

// Here I am declraring my class GuessWhatNumberLab_JoseRamos.
public class GuessWhatNumberLab_JoseRamos
{
    // The next two lines are declaring two variables.
    int answer; // This variable will have the correct answer of the game.
    boolean UserWon = false; // This boolean will tell if the user have won the game or not.

    // The next method will assign a random int value to answer.
    public void generateAnswer()
    {
        // Giving a random number to answer from 1 to 10.
        answer = (int)((Math.random()*10)+1);
    }

    // The next method will test if the input is the same as the answer.
    public void testAnswer(int input)
    {
        //If answer is equal input, the variable UserWon will be true otherwise will be false
        if(answer == input)
        {
            UserWon = true;
        }
        else
        {
            UserWon = false;
        }
    }

    // The next method will print the menu of the game
    public void printMenu()
    {
        // Printing the menu
        System.out.println("Press 1 to get help \nPress 2 to play \nPress 3 to exit the game\n");
    }

    // This is the main of the program where an object called game will be used to create the game.
    public static void main(String arg[])
    {
        // Creating an varible type Scanner to store the user input.
        Scanner userInput = new Scanner(System.in);

        // Creating the object game of type GuessWhatNumberLab_JoseRamos.
        GuessWhatNumberLab_JoseRamos game = new GuessWhatNumberLab_JoseRamos();

        //Printing the menu of the game
        game.printMenu();

        // Declaring the user input for the menu and for the answer of the game.
        int menuUserInput = 0;
        int answerUserInput;

        // The next while will run when the variable menuUserInput is not equal 3.
        while(menuUserInput != 3)
        {
            // Taking an input from the user and storing the value in the variable menuUserInput.
            menuUserInput = userInput.nextInt();

            // The next switch will run the case depending on the user input value.
            switch(menuUserInput)
            {
                // This case will print the instructions of the game.
                case 1:
                    System.out.println("\nYou have to enter an number between 1 to 10. \nIf your number is the same as the computer number, you won the game :)\n");
                    game.printMenu();
                    break;

                // This case will run the game of guessing what number.
                case 2:

                    // Assigning a false value to game.UserWon. This will prevent an error when playing again.
                    game.UserWon = false;
                    // Generating an random answer for the game
                    game.generateAnswer();

                    // The next for loop will runs until user won or tried to get the answer 10 times.
                    for(int i = 0; i<10 && !(game.UserWon); i++)
                    {
                        System.out.println("\nEnter an number from 1 to 10:");

                        // Getting a value from the user and storing that value in answerUserInput.
                        answerUserInput = userInput.nextInt();

                        // Testing if the user got the right answer.
                        game.testAnswer(answerUserInput);

                        // The next if statement will print a message if the user got the right answer or not
                        if(game.UserWon)
                        {
                            System.out.println("Your answer is correct! \n");
                        }
                        else
                        {
                            System.out.println("Wrong answer ");
                        }
                    } // Ending for loop.

                    // The next if statement is printing a message about if the user won or not.
                    if(game.UserWon)
                    {
                        System.out.println("You are a computer memory reader!! \\ (•◡•) / \n");
                    }
                    else
                    {
                        System.out.println("\nYou lost ¯\\_(ツ)_/¯ \n");
                    }
                    //Printing game menu.
                    game.printMenu();
                    break;

                // The next case is printing a message if the user decided to quit.
                case 3:
                    System.out.println("Bye ༼ つ ಥ_ಥ ༽つ");
                    break;

                // Printing a message if the user enter an input that is not valid.
                default:
                    System.out.println(menuUserInput + " is not an option (ಠ_ಠ)");
            } // Ending switch
        } // Ending While loop
    } // Ending main of the class
} // Ending class
