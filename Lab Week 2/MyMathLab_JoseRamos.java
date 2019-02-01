/* LAB1 -- OBJECTIVE -- TO GAIN EXPERIENCE DECLARING VARIABLES, ASSIGNING VARIABLES,
WRITING MATH STATEMENTS, USING BASIC METHODS AND OBJECTS AND PRINTING OUT VALUES.
1.) COMPLETE THE STEPS IN THE SPACES BELOW THE NUMBERED COMMENTS
2.)COMPILE AND FIX ANY ERRORS
3.)RUN  THE PROGRAM
----->make sure you add yourName to any of the class references<------------*/

//Name: Jose Ramos 
//Date: January 31, 2019

public class MyMathLab_JoseRamos
{//open class
	public static void main(String args [])
	{//open main method

		//1.) declare two user defined variables of type int named myNumA, and myNumB
        
        int myNumA;
        int myNumB;
        
		//2.) declare and assign the literal value of 10 to a user defined variable of type byte named myLittleNum

        byte myLittleNum = 10;

		//3.) declare a user defined variable of type int  to store the results of the math equation and name it myResult

        int myResult;

		//4.) declare a String named printOut

        String printOut;

		//5.) assign literal values to the myNumA and myNumB variables
        
        myNumA = 20;
        myNumB = 25;

		//6.) assign a value to the myResut value using an addition statement --> add myNumA and myNumB
        
        myResult = myNumA + myNumB;
        
		//7.)assign the text to the String named printOut --> "The value of myResult = "

        printOut = "The value of myResult = ";

		//8.) call the print method found in the System class in the java.lang.* to print out the values of the printOut and myResult

        System.out.println(printOut + myResult);
        
		//9.) print out a line between the print statement above
		System.out.println("____________________________________");

		//--------------------------------------------------------------------------------------------------------
		//10.) assign new values to the variables myNumA, myNumB, myLittleNum

        myNumA = 30;
        myNumB = 60;
        myLittleNum = 5;

		//11.) assign a value to myResult by multiplying myNumA and myNumB and then subtract myLittleNum  --->DON'T FORGET PARENTHESES

        myResult = (myNumA*myNumB) - myLittleNum;

		//12.) assign a new String value to the variable printOut -- state what you are printing out i.e. the result of multiplying and subtracting

        printOut = "The result of multiplying myNumA and myNumB and then subtracting myLittleNum is: ";

		//13.) call the print method found in the System class in the java.lang.* to print out the values printOut and myResult

        System.out.println(printOut + myResult);

		//print out a line between the print statement above
		System.out.println("____________________________________");
        
		//------------------------------------------------------------------------------------------------------

		//14.)UNCOMMENT OUT THE System.out.println(   ); 	WHEN YOU GET ALL THE STEPS ABOVE WORKING
		//use the System.out.println statement to do the math (not very clear and not a good idea)
		System.out.println("7F in celsius is " + (((7 - 32) * (5.0/9))));

	}

}



