import java.util.Scanner;

class Pet
{
	String petName;
	int age;
	Person owner;

	void setPetInfo(String n, int a, Person o)
	{	owner = o;
		age = a;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter owners first and last name and iD and press enter");
		owner.setInfo(userInput.next(),userInput.next(),userInput.nextInt());
		petName = n;

	}
	String getPetInfo()
	{
		return petName+" "+"\n"+" Age: " + age + "\n"+"Owner info: " + owner.getInfo();
	}
	void printPetInfo()
	{
		System.out.println("My pets name is: " + getPetInfo());
	}

	public static void main(String args[])
	{
		Pet myPet = new Pet();
		myPet.setPetInfo("Bear",4, new Person());
		myPet.printPetInfo();
	}
}