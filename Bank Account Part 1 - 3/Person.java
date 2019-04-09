import java.util.Scanner;


public class Person
{
	String fName, lName;
	int id;

	public void setInfo(String fN, String lN, int i)
	{
		fName = fN;
		lName = lN;
		id = i;
	}

	public String getInfo()
	{
		String info = "Name: " + fName + " " + lName +  " ID: " + id;
		return info;
	}

	public void printInfo()
	{
		System.out.println(getInfo());
	}
	public static void main(String args[])
	{

		Scanner userInput = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter name and id: ");
		p.setInfo(userInput.next(),userInput.next(),userInput.nextInt());
		p.printInfo();





	}
}
