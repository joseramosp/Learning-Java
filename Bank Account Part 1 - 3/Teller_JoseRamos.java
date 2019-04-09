// Calling all the packages that are going to be needed.
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Creating a class that will be used to create objects that will test all my other classes.
public class Teller_JoseRamos
{
    // Creating two variables of type String.
    String name;
    String dateProcessed;

    // Creating an empty constructor for for the class.
    // This empty argument constructor will do nothing.
    public Teller_JoseRamos()
    {

    }

    // Creating a constructor that will take two arguments and set up the value of the of the properties name and dateProcessed.
    public Teller_JoseRamos(String name, String dateProcessed)
    {
        this.name = name;
        this.dateProcessed = dateProcessed;
    }

    // This method will create a object for every class.
    public void generateAccounts()
    {
        // Seting up all the objects that inherit from different classes.
        BankAccount_JoseRamos richGuy = new BankAccount_JoseRamos();
        BankAccount_JoseRamos poorGuy = new BankAccount_JoseRamos();
        Savings_JoseRamos cheapGuy = new Savings_JoseRamos();
        Checking_JoseRamos bigSpender = new Checking_JoseRamos();
        Savings_JoseRamos client1 = new Savings_JoseRamos();
        Checking_JoseRamos client2 = new Checking_JoseRamos();

        // Calling all the method for the object richGuy.
        richGuy.setAccount("Rich", "Guy", 10001, 25000);
        richGuy.deposit(30000);
        richGuy.withdraw(7500);
        richGuy.printTransaction();

        // Calling all the method for the object poorGuy.
        poorGuy.setAccount("Poor", "Guy", 10002, 20);
        poorGuy.deposit(30);
        poorGuy.withdraw(39.85);
        poorGuy.printTransaction();

        // Calling all the method for the object cheapGuy.
        cheapGuy.setAccount("Cheap", "Guy", 10003, 5000);
        cheapGuy.setInterestRate(3);
        cheapGuy.deposit(30000);
        cheapGuy.withdraw(500);
        cheapGuy.printTransaction();
        cheapGuy.getInterestRate();

        // Calling all the method for the object bigSpender.
        bigSpender.setAccount("Big", "Spender", 10004, 6780);
        bigSpender.deposit(500);
        bigSpender.withdraw(4000);
        bigSpender.setFee(40);
        bigSpender.printTransaction();
        bigSpender.getFee();

        // Calling all the method for the object client1.
        client1.setAccount("Jose", "Ramos", 10005, 250000);
        client1.setInterestRate(5);
        client1.deposit(20000);
        client1.withdraw(2500);
        client1.printTransaction();
        client1.getInterestRate();

        // Calling all the method for the object client2.
        client2.setAccount("Mike", "Tyson", 10006, 1000);
        client2.setFee(40);
        client2.deposit(2000);
        client2.printTransaction();
        client2.withdraw(3001);
        client2.printTransaction();
        client2.getFee();

    }
}
