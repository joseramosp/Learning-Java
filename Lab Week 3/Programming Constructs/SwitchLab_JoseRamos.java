/* LAB Week 3
-- OBJECTIVE --
Students will be able to write effective code using switch statements.

  Name: Jose Ramos
  Date: February 5, 2019
*/

// Here I am declraring my class SwitchLab_JoseRamos
public class SwitchLab_JoseRamos
{
    // This method will print out a random number and one or more fruits
    public void printSwitch()
    {
        // The next line is declaring a variable with a random int value from 1 to 10
        int randomNum = (int)((Math.random()*10)+1);

        // The next line is priting the randomNum variable with a tab space after it.
        System.out.print(randomNum + "\t");

        // The next switch will print out one or more fruits depending on the
        // the value of randNum
        switch(randomNum)
        {
            case 1:
                System.out.println("bananas");
                break;
            case 2:
                System.out.println("apples");
                break;
            case 3:
                System.out.println("pears, peaches, grapes");
                break;
            case 4:
                System.out.println("peaches, grapes");
                break;
            case 5:
                System.out.println("grapes");
                break;
            case 6:
                System.out.println("plums");
                break;
            case 7:
                System.out.println("");
                break;
            case 8:
                System.out.println("oranges");
                break;
            default:
                System.out.println("NUTS!");
                break;
        } // Ending switch
    } // Ending method

    // This is the main of the program where I use testObject to test my method
    public static void main(String arg[])
    {
        // The next line is declaring an object type SwitchLab_JoseRamos
        SwitchLab_JoseRamos testObject = new SwitchLab_JoseRamos();

        // The next line will call the method printSwitch of the class SwitchLab_JoseRamos
        testObject.printSwitch();
    } // Ending main
}
