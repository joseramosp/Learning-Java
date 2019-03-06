/* Array Lab
-- OBJECTIVE --
To understand how objects are created and stored in memory

  Name: Jose Ramos
  Date: March 3, 2019
*/

// Creating a class called MyPoint_JoseRamos
public class MyPoint_JoseRamos
{
    // Declaring 2 int variables.
    int xVal, yVal;

    // Creating a method  that takes 2 arguments.
    public void setPointVal(int x, int y)
    {
        // Assigning the arguments x and y to xVal and yVal.
        xVal = x;
        yVal = y;
    }

    // Creating a method that will return an Strign with the values of xVal and yVal.
    public String getPointVal()
    {
        // Creting an variable of type String and giving a value to it.
        String myPoint = "(" + xVal + "," + yVal +  ")";
        return myPoint;
    }

    // Creating the main of the program
    public static void main(String args [])
    {
        // Creating two objects of type MyPoint_JoseRamos
        MyPoint_JoseRamos startObj = new MyPoint_JoseRamos();
        MyPoint_JoseRamos endObj = new MyPoint_JoseRamos();

        // Calling the method setPointVal for the startObj.
        startObj.setPointVal(10, 20);
        // Printing an message calling the method getPointVal for startObj.
        System.out.println("MyPoint startObj: " + startObj.getPointVal());

        // Calling the method setPointVal for the endObj.
        endObj.setPointVal(35, 55);
        // Printing an message calling the method getPointVal for endObj.
        System.out.println("MyPoint endObj: " + endObj.getPointVal());

        // Printing a line to divide the 1st and the 2nd part of the lab.
        System.out.println("-----------------PART 2---------------------------");

        // MyPoint_JoseRamos strayObj = new MyPoint_JoseRamos();
        //
        // strayObj = endObj;
        //
        // strayObj.setPointVal(12345);
        //
        // System.out.println("MyPoint strayObj: " + strayObj.getPointVal());
        // System.out.println("MyPoint strayObj: " + endObj.getPointVal());
        // System.out.println("MyPoint strayObj: " + startObj.getPointVal());

    }
}
