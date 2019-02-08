/* LAB Week 4
-- OBJECTIVE --
You will create 3 .java files that will meet the attached lab objectives.
You must have created 6 methods in total: WhileSquares, WhileTimes, ForSquares,
ForTimes, DoTwoRandom, and DoLottery. Read attachments for specific instructions.

  Name: Jose Ramos
  Date: February 7, 2019
*/

// Here I am declraring my class
public class WhileLoops_JoseRamos
{
    // This method will print the square for numbers between 1 to 10
    public void printWhileSquareNumber()
    {
        int num = 1, squareNum;

        // This while loop will print the square of the variable num 10 times
        while(num<=10)
        {
            squareNum = num * num;
            System.out.print(squareNum + "\t");
            num++;
        }
        System.out.print("\n");
    }

    // This method will print numbers from 1 to 10 adding themselves 10 times
    public void printWhileTimes()
    {
        int rowNum = 1, num, result;

        // This while loop will run until rowNum becomes greater than 10
        while(rowNum <= 10)
        {
            num = 1;

            // This while loop will calculate and print the variable result 10 times
            while(num <= 10)
            {
                result = rowNum * num;
                System.out.print(result + " ");
                num++;
            }
            rowNum++;
            System.out.print("\n");
        }
    }

    // This is the main of the program where I use testObject to test my different methods
    public static void main(String args[])
    {
        // Here I am creating an object called testObject of type WhileLoops_JoseRamos
        WhileLoops_JoseRamos testObject = new WhileLoops_JoseRamos();

        // Here I am using the testObject to call my method printWhileSquareNumber
        testObject.printWhileSquareNumber();
        // Here I am using the testObject to call my method printWhileTimes
        testObject.printWhileTimes();

    }
}
