import java.util.Scanner;

public class Groomer
{
	Pet thePet;
	Person owner;
	double totalCost;
	double bathPrice;
	double nailsPrice=7.55;
	String size;
	Scanner userInput = new Scanner(System.in);

	public void setPetAppt(Pet p, Person o)
	{
		thePet = p;
		owner = o;
		System.out.println("Please enter pets name, and age and press enter");
		thePet.setPetInfo(userInput.next(),userInput.nextInt(),owner);
	}

	public double bath(Pet p, String s)
	{	thePet = p;
		size = s;
		switch(size)
		{
			case "s":
			bathPrice = 1.50;
			System.out.println("Cost: " + bathPrice);
			break;
			case "m":
			bathPrice = 15.50;
			System.out.println("Cost: " + bathPrice);
			break;
			case "l":
			bathPrice = 100.50;
			System.out.println("Cost: " + bathPrice);
			break;
			default:
			bathPrice = 0.0;
			System.out.println("Cost: " + bathPrice);
		}

		//pet gets bath at set price
		return bathPrice;
	}

	public double nails(Pet p)
	{	thePet = p;
		//pet gets brushed
		return nailsPrice;
	}

	public void generateBill(Person o, Pet p)
	{
		owner = o;
		thePet = p;
		//generates totalBill based on services called
		totalCost = nails(thePet)+ bathPrice;
		System.out.println(owner.fName + " bill is for " + thePet.petName + " totals: " + totalCost);
	}

	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		Person owner = new Person();
		Pet p = new Pet();
		Groomer g = new Groomer();
		g.setPetAppt(p, owner);
		System.out.println("Enter size of animal: s for small, m for medium, l for large");
		g.bath(p, userInput.next());
		g.nails(p);
		g.generateBill(owner, p);
	}


}//end class