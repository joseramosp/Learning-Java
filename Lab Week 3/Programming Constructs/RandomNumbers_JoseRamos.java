/* LAB Week 3
-- OBJECTIVE --
Students will be able to write code using “if” statements and “if else” statements

  Name: Jose Ramos
  Date: February 5, 2019
*/

// Here I am declraring my class
public class RandomNumbers_JoseRamos
{
    // This method will print Bananas if the variable randomNum is grater than 5
    public void printRandomOne()
    {
        // The next line is declaring a the variable randomNum and assigning a
        // random int value to between 1 and 10.
        int randomNum = (int)((Math.random()*10)+1);

        // The next if statement will print Bananas or a number from 1 to 5
        if(randomNum > 5)
        {
            System.out.println("Bananas");
        }
        else{
            System.out.println(randomNum);
        }
    }

    // The next method will print 2 or 1 random number
    public void printRandomTwo()
    {
        // The next two lines are declaring two variables with a random value
        int randomOne = (int)((Math.random()*10)+1);
        int randomTwo = (int)((Math.random()*10)+1);

        // The next if statement will print the largest random number or both if
        // they have the same value
        if(randomOne > randomTwo)
        {
            System.out.println(randomOne);
        }
        else if(randomOne < randomTwo)
        {
            System.out.println(randomTwo);
        }
        else{
            System.out.println(randomOne);
            System.out.println(randomTwo);
        }
    }

    // The next method will print out a random grade between F(50) to A(100)
    public void printRandomGradeGenerator()
    {
        // The next line is declaring a variable with a random int value
        // between 50 to 100
        int randomGrade = 50+(int)(Math.random()*(100-49));

        // Testing block
        /*
        while(randomGrade != 100)
        {
            System.out.println(randomGrade);
            randomGrade = 50+(int)((Math.random()*(100-49)));
        }
        */

        // The if and else if statements are going to print out the grade
        // as a letter depending on of randomGrade value.
        if(randomGrade < 60)
        {
            System.out.println("F");
        }
        else if(randomGrade < 70)
        {
            System.out.println("D");
        }
        else if(randomGrade < 80)
        {
            System.out.println("C");
        }
        else if(randomGrade < 90)
        {
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
        //System.out.println(randomGrade);  //Testing line
    }

    // This is the main of the program where I use testObject to test my different methods
    public static void main(String arg[])
    {
        // Declaring my object testObject of type RandomNumbers_JoseRamos
        RandomNumbers_JoseRamos testObject = new RandomNumbers_JoseRamos();

        // The next three lines are calling my methods of the class RandomNumbers_JoseRamos
        testObject.printRandomOne();
        testObject.printRandomTwo();
        testObject.printRandomGradeGenerator();
    }
}
