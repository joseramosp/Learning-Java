//HOW TO TAKE INPUT FROM THE COMMAND LINE IN JAVA USING SCANNER!
import java.util.Scanner; //PACKAGE TO USE BRING IN USER INPUT

public class Tip //CLASS DECLARATION
{	double tip, b,tp; //DECLARE 3 MEMBER VARIABLES FOR TIP CALCULATION

	public double tipCalc(double bill, double tipPercent)//METHOD DECLARATION TO FOR TIPcALC TAKES IN 2 DOUBLES
	{	 	Scanner userInput = new Scanner(System.in);//SCANNER OBJECT ALLOWS FOR USER INPU
			System.out.println("Enter bill amt");//OUT PUT WHAT YOU WANT THE INPUT TO BE
			b = userInput.nextDouble(); //CALL THE SCANNER METHOD TO TAKE IN A VALUE
			System.out.println("Enter tip percent"); //ENTER TIP % AS A DECIMAL
			tp = userInput.nextDouble();//TAKES IN DOUBLE TIP AMOUNT
		 	tip = b * tp; //FORMULAT TO CALCUALTE TIP
			return tip; //RETURN RESULT OF THE FORMUAL
	}
	public void printTip() //METHOD DEF TO PRINT TIP
	{
		tip = tipCalc(b,tp); //CALL TIP METHOD TO RETURN TIP VALUE TO MEMBER VAR TIP
		System.out.println("The tip will cost you: " + tip); //PRINT VALUE OF TIP

	}
	public static void main(String args[])
	{	Tip obj1 = new Tip();//CREATE TIP OBJECT
		boolean keepGoing = true;
		Scanner menuInput = new Scanner(System.in);
		int choice;
		System.out.println("Press 1 to calculate tip"+ "\n"+ "Press 2 to Quit the program");
		while(keepGoing)//makes sure the program runs again
		{
			choice = menuInput.nextInt();
			switch( choice)
			{
				case 1:
					obj1.printTip(); //CALL METHODS TO CREATE AND PRINT TIP
					//System.out.println(choice+" "+keepGoing); line used for menu testing
					keepGoing = true;
					System.out.println("Enter 1 to calculate another tip or 2 to quit");
					break;
				case 2:
					keepGoing = false;
					//System.out.println(choice + " quitting " + keepGoing); line used for testing
					menuInput.close();
					System.exit(0);
					break;
				default:
					System.out.println("Not a correct choice");
					keepGoing = true;
			}//end case
		}//end while
	}//end main
}//end class
