
import java.util.Scanner;

public class Student_JoseRamos
{// Open class
    //declaring member variables to store info about student obj

    String name;
    int id;
    double gpa;
    Scanner userInput = new Scanner(System.in);

    public void setInfo(String name, int iD, double gPA)
    {
        System.out.println("Enter name:");
        name = userInput.nextLine();
        System.out.println("Enter ID:");
        id = userInput.nextInt();
        System.out.println("Enter GPA:");
        gpa = userInput.nextDouble();

    }

    public String getInfo()
    {
        String info = "Student Name " + name + " ID: " + id + " GPA: " + gpa;
        return info;
    }

    public void printInfo()
    {
        System.out.println(this.getInfo());
    }

    // public static void main(String args[])
    // {
    //
    // }

}
