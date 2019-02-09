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
        int randNum1, randNum2;

        //The next do-while loop will until the values for randNum1 and randNum2 are different
        do
        {
            // Here I am giving random values from 0 to 99 to randNum1 and randNum2
            randNum1 = (int)(Math.random() * 100);
            randNum2 = (int)(Math.random() * 100);
        }while(randNum1 == randNum2);

        // In the next line I am printing randNum1 and randNum2
        System.out.print(randNum1 + "\t" + randNum2);
        System.out.println("");
    }

    // This method will print 6 random numbers from 1 to 100
    public void printLotteryNumbers()
    {
        // The next line declare 6 variables for the Lottery Numbers
        int randNum1, randNum2, randNum3, randNum4, randNum5, randNum6;
        // The next line declare a boolean that will be use in case any Lottery Number is the same
        boolean repeat = false;

        // The next do-while will run untill all randNum are unique
        do
        {
            // Here false will be false at the begining of the loop in case it repeat
            repeat = false;

            // Here I am giving a random value from 1 to 100 to all randNum
            randNum1 = (int)((Math.random() * 100) + 1);
            randNum2 = (int)((Math.random() * 100) + 1);
            randNum3 = (int)((Math.random() * 100) + 1);
            randNum4 = (int)((Math.random() * 100) + 1);
            randNum5 = (int)((Math.random() * 100) + 1);
            randNum6 = (int)((Math.random() * 100) + 1);

            // The next if statement is testing if any of the randNum values are the same
            if((randNum1 == randNum2) || (randNum1 == randNum3) || (randNum1 == randNum4) || (randNum1 == randNum5) || (randNum1 == randNum6) ||
            (randNum2 == randNum3) || (randNum2 == randNum4) || (randNum2 == randNum5) || (randNum2 == randNum6) ||
            (randNum3 == randNum4) || (randNum3 == randNum5) || (randNum3 == randNum6) ||
            (randNum4 == randNum5) || (randNum4 == randNum6) || (randNum5 == randNum6))
            {
                //System.out.println("Repeating:");         // Testing line
                // The next boolen variable will be true
                repeat = true;
            }
        }while(repeat);

        // The next line is printing the value of each randNum
        System.out.print(randNum1 + "\t" + randNum2 + "\t" + randNum3 + "\t" + randNum4 + "\t" + randNum5 + "\t" + randNum6 + "\t");
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
