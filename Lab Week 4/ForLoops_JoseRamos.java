/* LAB Week 4
-- OBJECTIVE --
You will create 3 .java files that will meet the attached lab objectives.
You must have created 6 methods in total: WhileSquares, WhileTimes, ForSquares,
ForTimes, DoTwoRandom, and DoLottery. Read attachments for specific instructions.

  Name: Jose Ramos
  Date: February 7, 2019
*/

// Here I am declraring my class
public class ForLoops_JoseRamos
{
    // This method will print the square for numbers between 1 to 10
    public void printForSquareNumber()
    {
        // This for loop will print the square of the variable num 10 times
        for(int num = 1, squareNum; num <= 10; num++)
        {
            squareNum = num * num;
            System.out.print(squareNum + "\t");
        }
        System.out.print("\n");
    }

    // This method will print numbers from 1 to 10 adding themselves 10 times
    public void printForTimes()
    {
        // This for loop will run 10 times
        for(int rowNum = 1; rowNum <= 10; rowNum++)
        {
            // This for loop will calculate and print result 10 times
            for(int num=1, result; num <= 10; num++)
            {
                result = num * rowNum;
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }
    }

    // This is the main of the program where I use testObject to test my different methods
    public static void main(String args[])
    {
        // Here I am creating an object called testObject of type ForLoops_JoseRamos
        ForLoops_JoseRamos testObject = new ForLoops_JoseRamos();

        // Here I am using the testObject to call my method printForSquareNumber
        testObject.printForSquareNumber();
        // Here I am using the testObject to call my method printForTimes
        testObject.printForTimes();
    }
}
