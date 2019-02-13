/*THIS CODE PROVIDES SEVERAL EXAMPLES ON HOW TO WRITE ARRAYS.  INSTEAD OF USING SEVERAL CLASS FILES THERE IS ONE CLASS WITH DIFFERENT METHODS TO SHOW THE DIFFERENT WAYS ARRAYS CAN BE USED.*/

public class KristensArrayExamples
{
	//DELCARE MEMBER VARAIBLES THAT ARE ARRAYS
	int myNumbers [];
	char myLetters [] = new char [26];


	public void addLongHand()
	{
		//ASSIGNING THE SIZE OF THE ARRAY TO THE IDENTIFIER/VARIABLE 	myNumbers
		myNumbers = new int [5];
		//THE ARRAY INDEX STARTS WITH 0
		myNumbers [0] = 20;
		myNumbers [1] = 15;
		myNumbers [2] = 1;
		myNumbers [3] = 11;
		myNumbers [4] = 25;

		//THE FOR LOOP PRINTS OUT ALL OF THE VALUES STORED IN THE ARRAY
		//THE *.length IS A PROPERTY OF THE ARRAY OBJECT WHICH IS A SPECIAL OBJECT
		for(int index = 0; index < myNumbers.length; index++)
		{

			System.out.println("The birthdays are: " + myNumbers[index]);
		}//END FOR LOOP
	}//END METHOD

	public void addShortHand()
	{
		//DECLARING THE ARRAY AND ASSINGING THE VALUES ALL IN ONE LINE
		String theSimpsons[] = {"Homer","Marge","Bart","Lisa","Maggie"};

				//THE FOR LOOP PRINTS OUT ALL OF THE VALUES STORED IN THE ARRAY
				//THE *.length IS A PROPERTY OF THE ARRAY OBJECT WHICH IS A SPECIAL OBJECT
				for(int index = 0; index < theSimpsons.length; index++)
				{
					//PRINTS OUT THE VALUES STORED IN THE ARRAY
					System.out.println("The Simpsons are: " + theSimpsons[index]+ "\n");
				}
	}

	//THIS METHOD WILL INTITIALIZE AND PRINT THE VALUES IN ONE SINGLE FOR LOOP
	public void inititalizeAndPrint()
	{
		//DECLARE LOCAL VARIABLE AND ASSIGN LITERAL VALUE 65 WHICH IS THE STARTING ASCII VALUE FOR A
		char letterCounter = 65;
		//LOOP IS USED ASSIGNING VALUES TO THE ARRAY AND PRINTING OUT THOSE VALUES
		for(int index = 0; index < myLetters.length ; index++)
		{
			//IN THE LOOP THE INDEX INCREASES TO STORE A VALUE IN EACH ELEMENT OF THE ARRAY
			myLetters[index] = letterCounter;
			//LETTER COUNTER IS INCREMENTED TO CHANGED THE CHAR VALUE TO BE STORED IN THE ARRAY
			letterCounter++;
			//LOOPS THROUGH EACH ELEMENT INDEX TO PRINT OUT EACH VALUE
			System.out.print(myLetters[index]+ " ");

		}
		//USED FOR FORMATING

	}


	//DECLARE THE MAIN METHOD WHICH WILL CREATE A KRISTENSARRAYEXAMPLE OBJECT TO CALL OF THE METHODS WITH
	public static void main(String args [])
	{
		//INSTATIATES A NEW OBJECT
		KristensArrayExamples theExample = new KristensArrayExamples();
		//INVOKE EACH METHOD WITH INSTANTIATED OBJECT
		theExample.addLongHand();
		System.out.println("-------------------------------------------------------------------------------");
		theExample.addShortHand();
		System.out.println("------------------------------------------------------------------------------");
		theExample.inititalizeAndPrint();

	}//end main

}//end clas
