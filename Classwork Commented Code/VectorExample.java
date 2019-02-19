import java.util.*;

public class VectorExample
{
	Scanner userInp = new Scanner(System.in);
	Vector <String> names;

	public void setVectVal()
	{
		names = new Vector<String>(4);
		System.out.println("Enter the names of the people in your family");
		for(int i = 0; i <names.capacity(); i++)
		{
			names.addElement(userInp.nextLine());
		}
	}

	public void printVectVal()
	{
		System.out.println("You have: " +names.size()+ " Their names are: ");
		for(int i = 0; i<names.size(); i++)
		{
			String name = names.elementAt(i);
			System.out.println(name);
		}
	}
	public static void main(String args[])
	{
		VectorExample ve = new VectorExample();
		ve.setVectVal();
		ve.printVectVal();
	}


}