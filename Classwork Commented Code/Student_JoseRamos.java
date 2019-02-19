import java.util.Scanner;

public class Student_ks
{//open class
	//declaring member variables to store info about student obj
	String name;
	int id;
	double gpa;
	Scanner userInput = new Scanner(System.in);
	
	public void setInfo()
	{
		System.out.println("Enter name:");
		this.name = userInput.nextLine();
		System.out.println("Enter id: ");
		id = userInput.nextInt();
		System.out.println("Enter G.P.A");
		gpa = userInput.nextDouble();
	}
	
	public String getInfo()
	{
		String info = "Student Name " + name + " ID: " + id + " GPA: " +gpa; 
		return info;
	}
	public void printInfo()
	{
		System.out.println(this.getInfo());
	}
	

}//close class