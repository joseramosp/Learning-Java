import java.util.Scanner;
import java.util.ArrayList;

public class AnimalShelter
{

	public void openShelter(ArrayList <PetObject> pets, int shelterLimit)//pass array of pet objects, and max numbers in shelter to method
	{
		for(int i = 0; i<shelterLimit; i++)
		{
			pets.add(new PetObject());// add new PetObjects to the ArrayList
			pets.get(i).setPetInfo();//get the object stored at the element index and call the method to setPetInfo()
		}
		for(int i = 0; i<pets.size();i++)
		{
			pets.get(i).printPetInfo();//do the same thing but to print out the pets info at the element index
		}
	}

	public static void main(String args[])
	{
		Scanner uI = new Scanner(System.in); //Create a scanner object to take in inpu
		AnimalShelter mspca = new AnimalShelter();//create an instance of the Animal Shelter class named mspca
		System.out.println("How many pets can your shelter hold at once");
		int limit = uI.nextInt(); //value used to set shelter limit
		mspca.openShelter(new ArrayList <PetObject>(),limit); //call the method with the object and pass it the arraylist object and integer limit.
	}




}