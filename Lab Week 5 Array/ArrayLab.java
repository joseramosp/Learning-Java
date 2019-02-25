/* Array Lab
-- OBJECTIVE --
To gain experience using Java’s special array object.

  Name: Jose Ramos
  Date: February 17, 2019
*/

// Here I am declraring my class ArrayLab.
public class ArrayLab
{
    // The next method is going to print out the numbers from 1 to 10.
    public void printNumbers()
    {
        // The next line is declaring an array of type int.
        int myNumbers [];

        // The next line is assigning a size to the array myNumbers
        myNumbers = new int [10];

        // The next loop is going to store the numbers from 1 to 10 in an array and print them out.
        for(int i = 0; i < 10; i++)
        {
            myNumbers[i] = i + 1;
            System.out.print(myNumbers[i] + " ");
        }

        // Printing an empty line and another line with stars to divide this method with the next when printing.
        System.out.println("\n");
        System.out.println("******************************************************************************\n");
    }// Ending printNumbers method.

    // The method is will print the names in my family.
    public void printFamilyNames()
    {

        // The next line is declaring an array of type string and assigning values to the array short hand.
        String myFamily [] = {"Nidia","Victor","Emely","Jose","Liz"};

        System.out.println("The names in my family are:");

        // The for loop is going to prinout the all the values in the array.
        for(int i = 0; i< myFamily.length; i++)
        {
            System.out.println(myFamily[i]);
        }
        // Printing an empty line and another line with stars to divide this method with the next when printing.
        System.out.println("");
        System.out.println("******************************************************************************\n");
    }// Ending printFamilyNames method.

    // The next method is going to print 4 lucky numbers.
    public void printLuckyNumbers()
    {
        // The next line is declaring an array of type int and giving a size of 4 to it.
        int luckyNumbers [] = new int[4];

        // Adding values to luckyNumbers long hand.
        luckyNumbers[0] = 43;
        luckyNumbers[1] = 23;
        luckyNumbers[2] = 78;
        luckyNumbers[3] = 34;

        System.out.print("My lucky numbers are: ");

        // The for loop is printing the values of the array luckyNumbers
        for(int i = 0; i<luckyNumbers.length; i++)
        {
            System.out.print( luckyNumbers[i] + " ");
        }

        // Printing an empty line and another line with stars to divide this method with the next when printing.
        System.out.println("\n");
        System.out.println("******************************************************************************\n");
    }// Ending printLuckyNumbers method.

    // The method is going to print the times table up through 10.
    public void printTimesTable()
    {
        int firstNum, secondNum;

        // Declaring the an 2D array of type int and giving a size of 10 by 12.
        int timesTable [][] = new int [10][12];

        // The next for loop will run another for loop inside of it.
        for(firstNum = 1; firstNum <= timesTable.length; firstNum++)
        {
            // Printing the value of firstNum.
            System.out.println(firstNum);
            System.out.print("\t");

            // The next for loop will assign a value to the row of "the value of firstNum" to the array timesTable.
            for(secondNum = 1; secondNum <= timesTable[firstNum - 1].length; secondNum++)
            {
                // The next line is assigning a value to a position of the array timesTable.
                timesTable[firstNum - 1][secondNum - 1] = firstNum * secondNum;

                // The next line is printing the value in a position of the array.
                System.out.print(timesTable[firstNum-1][secondNum-1] + "\t");
            }
            // Printing an enmpty line.
            System.out.print("\n");
        }// Ending for loop.
    }// Ending printTimesTable method.

    // This is the main of the program where all methods will be called.
    public static void main(String args [])
    {
        // Creating an object of type ArrayLab.
        ArrayLab testObject = new ArrayLab();

        // Calling all the methods created in the class ArrayLab.
        testObject.printNumbers();
        testObject.printFamilyNames();
        testObject.printLuckyNumbers();
        testObject.printTimesTable();

    }// Ending the main of the class.
}// Ending class ArrayLab.
