/* LAB Week 4
-- OBJECTIVE --
You will create 3 .java files that will meet the attached lab objectives.
You must have created 6 methods in total: WhileSquares, WhileTimes, ForSquares,
ForTimes, DoTwoRandom, and DoLottery. Read attachments for specific instructions.

  Name: Jose Ramos
  Date: February 7, 2019
*/

// Here I am declraring my class
public class DoWhileLoops_JoseRamos
{
    // This method will print 2 random numbers
    public void print2UniqueNums()
    {
        int randNum, count = 0;

        //The next do-while loop will run wille count is less than 2
        do
        {
            // Here I am giving a random value from 0 to 99 to randNum
            randNum = (int)(Math.random() * 100);
            // In the next two lines I am printing printing randNum and then adding 1 to count
            System.out.print(randNum + "\t");
            count++;
        }while(count<2);

        System.out.println("");
    }

    // This method will print 6 random numbers from 1 to 100
    public void printLotteryNumbers()
    {
        int randNum, count = 0;

        // The next do-while while the variable count is less than 6
        do
        {
            // Here I am giving a random value from 1 to 100 to randNum
            randNum = (int)((Math.random() * 100) + 1);
            System.out.print(randNum + "\t");
            count++;
        }while(count < 6);

        System.out.println("");
    }

    // This is the main of the program where I use testObject to test my different methods
    public static void main(String args[])
    {
        // Here I am creating an object called testObject of type DoWhileLoops_JoseRamos
        DoWhileLoops_JoseRamos testObject = new DoWhileLoops_JoseRamos();

        // This I am using the testObject to call my method print2UniqueNums
        testObject.print2UniqueNums();
        // This I am using the testObject to call my method printLotteryNumbers
        testObject.printLotteryNumbers();
    }
}
