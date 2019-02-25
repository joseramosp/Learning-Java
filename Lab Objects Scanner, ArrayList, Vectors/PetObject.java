import java.util.*;//importing the library to use the Scanner object

public class PetObject //declaring a generic Pet Object
{
	String name;
	int age;
	Scanner userInput = new Scanner(System.in);

	public void setPetInfo()
	{	System.out.println("Please enter the pets name and age");
		name = userInput.nextLine();//calling nextLine() for Scanner object to store input in String var
		age = userInput.nextInt();//call nextInt() for Scanner object to store int val in age
	}
	public String getPetInfo()
	{
		String info = "Pet Name: " + name + " age: " + age; //gets member var values and returns as 1 string
		return info;
	}
	public void printPetInfo()
	{
		System.out.println(getPetInfo());
	}
}//end class