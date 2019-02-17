/* Guess What Number Lab
-- OBJECTIVE --
To use a decision constructs and loop constructs to play a simple guessing game.

  Name: Jose Ramos
  Date: February 17, 2019
*/

import java.util.Scanner; //PACKAGE TO USE BRING IN USER INPUT

//
public class GuessWhatNumberLab_JoseRamos
{
    int answer;
    boolean UserWon = false;

    public void generateAnswer()
    {
        answer = (int)((Math.random()*10)+1);
        //return answer;
    }

    public void testAnswer(int input)
    {
        if(answer == input)
        {
            UserWon = true;
        }
        else
        {
            UserWon = false;
        }
    }

    public void printMenu()
    {
        System.out.println("Press 1 to get help \nPress 2 to play \nPress 3 to exit the game\n");
    }

    public static void main(String arg[])
    {
        Scanner userInput = new Scanner(System.in);

        GuessWhatNumberLab_JoseRamos game = new GuessWhatNumberLab_JoseRamos();
        //game.generateAnswer();
        game.printMenu();
        int menuUserInput = 0;
        int answerUserInput;

        while(menuUserInput != 3)
        {
            menuUserInput = userInput.nextInt(); // ****** ADD THE SCANNER HERE ******

            switch(menuUserInput)
            {
                case 1:
                    System.out.println("\nYou have to enter an number between 1 to 10. \nIf your number is the same as the computer number, you won the game :)\n");
                    game.printMenu();
                    break;
                case 2:
                    game.UserWon = false;
                    game.generateAnswer();
                    for(int i = 0; i<10 && !(game.UserWon); i++)
                    {
                        System.out.println("\nEnter an number from 1 to 10:");
                        answerUserInput = userInput.nextInt(); // ****** ADD THE SCANNER HERE ******
                        game.testAnswer(answerUserInput);

                        if(game.UserWon)
                        {
                            System.out.println("Your answer is correct! \n");
                        }
                        else
                        {
                            System.out.println("Wrong answer ");
                        }
                    }

                    if(game.UserWon)
                    {
                        System.out.println("You are a computer memory reader!! \\ (•◡•) / \n");

                    }
                    else
                    {
                        System.out.println("\nYou lost ¯\\_(ツ)_/¯ \n");
                    }
                    game.printMenu();
                    break;

                case 3:
                    System.out.println("Bye ༼ つ ಥ_ಥ ༽つ");
                    break;

                default:
                    System.out.println(menuUserInput + " is not an option (ಠ_ಠ)");
            } // Ending switch
        } // Ending While loop
    } // Ending main of the class
} // Ending class
