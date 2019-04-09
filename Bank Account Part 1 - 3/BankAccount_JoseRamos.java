// Calling all the packages that are going to be need it.
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//Creating a class called BankAccount_JoseRamos. (This class will be the parent of other two classes).
public class BankAccount_JoseRamos
{
    // The next three lines are creating the properties for the class
    Person account_Owner = new Person(); // Declaring a object of instance Person.
    int accountNumber;                   // this variable will store the account number.
    double accountBalance;               // This variable will store the balance in the store.

    // The next two lines are Creating two variables that are going to be used to pritnt out the present time.
    DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    // Creating an object of instance Scanner. Used to take inputs from the user.
    Scanner userInput = new Scanner(System.in);

    // Creating a method to setup the properties of the account as Owner full name, balance and acount number.
    // This method will without argument will use user input.
    public void setAccount()
    {
        System.out.println("Enter account owner first name: ");
        account_Owner.fName = userInput.next(); // Storing user input in fName of the account_Owner object.

        System.out.println("Enter account owner last name: ");
        account_Owner.lName = userInput.next(); // Storing user input in lName of the account_Owner object.

        System.out.println("Enter the account number: ");
        accountNumber = userInput.nextInt(); // Storing user input in accountNumber.

        System.out.println("Enter the account's initial balance: ");
        accountBalance = userInput.nextDouble(); // Storing user input in the variable accountBalance

    }

    // The next method is overloading the method setAccount.
    // It will take all four arguments and use them to set the value of all the properties in the class.
    public void setAccount(String fName, String lName, int accountNumber, double initialBalance)
    {
        account_Owner.fName = fName;
        account_Owner.lName = lName;
        this.accountNumber = accountNumber;
        accountBalance = initialBalance;
    }

    // The next method will take a double argument and add it to accountBalance.
    public void deposit(double add)
    {
        //System.out.println("Enter the amount you want to deposit: ");
        accountBalance = accountBalance + add;
    }

    // The next method will take a double argument and subtract it to accountBalance.
    public void withdraw(double deduct)
    {
        //System.out.println("Enter the amount you want to withdraw: ");

        // This boolean works as a flag to know if the the value of deduct is grater than the account balance.
        boolean isGrater = true; // It start assumming that there deduct is grater than the account balance.

        // This loop will prevent the that the user enter a value grater than the account balance.
        while(isGrater)
        {
            if(deduct <= accountBalance)
            {
                // Subtracts deduct from accountBalance.
                accountBalance = accountBalance - deduct;
                isGrater = false;
            }
            else    // Printing a message and taking an input from the user.
            {
                System.out.println("The amount that you want to withdraw is not available");
                System.out.println("Enter a different amount:");
                deduct = userInput.nextDouble();
            }// Ends else.
        }// Ends while.
    }// Ends method.

    // The next method will print a message showing all the information of the account.
    public void printTransaction()
    {
        System.out.println("\n" + date.format(LocalDateTime.now()));
        System.out.println("Account owner/s: " + account_Owner.fName + " " + account_Owner.lName);
        System.out.println("Account number: " + accountNumber );
        System.out.println("Account Balance: " + accountBalance);
    }

    // Creating the main of the class.
    public static void main(String args[])
    {
        // Creating an object of the instance Scanner.
        Scanner userInput = new Scanner(System.in);

        // Creating objects of instance Teller_JoseRamos
        Teller_JoseRamos teller = new Teller_JoseRamos(); // Using empty constructor.
        Teller_JoseRamos teller2 = new Teller_JoseRamos("Bank Of The Earth", "today"); // Using the constructor that takes two arguments.

        // calling the method generateAccounts for the teller object.
        teller.generateAccounts();

        // Creating a line to seperate
        System.out.println("\n<----------------------------------------------->\n");

        // Printing a message using the method the properties of the object teller2.
        System.out.println("The next transactions from " + teller2.name + " will be processed " + teller2.dateProcessed + ".");

        // Calling method generateAccounts for the object teller2.
        teller2.generateAccounts();

    }// Ending main.
}// Ending class.
