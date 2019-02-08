//INTRODUCING METHODS

public class Loopy
{
	/*generates a snippit of code to print out the 1 to 10 using a while*/
	public void whilePrintFirstTen()
	{
		int count = 0;
		while (count <= 10)
		{
			count++;
			System.out.println(count);
		}
		System.out.println("________________");
	}
	
	/*generates a snippit of code to print out 10 to 1 using a for*/
	public void forCountDown()
	{
		for(int a = 10; a>=0; a--)
		{
			System.out.println(a);
		}
		System.out.println("________________");
	}
	
	/*generates a snippit of code that generates first 5 even numbers using a do while*/
	public void doEven()
	{
		int a = 0;
		do
		{
			a=a+2;
			System.out.println(a);
		}while(a<=10);
		System.out.println("________________");
	}
	
	//below is the main method where all of the methods/functions are called with an instance of the Loopy class
	public static void main(String args[])
	{
		Loopy myObject = new Loopy();
		myObject.whilePrintFirstTen();
		myObject.forCountDown();
		myObject.doEven();
	}
}
		