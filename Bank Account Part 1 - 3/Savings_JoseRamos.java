// Calling all the packages that are going to be needed.
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Creating a class called Savings_JoseRamos that extends from BankAccount_JoseRamos.
public class Savings_JoseRamos extends BankAccount_JoseRamos
{
    // Creating two variables to add more properties to this class.
    String accountType = "Saving";
    double interestRate;

    // The next method will take an input from the user as a double and assign that value to interestRate.
    public void setInterestRate()
    {
        System.out.println("Enter the interest rate of the account: ");
        interestRate = userInput.nextDouble();
    }

    // Creating a method that will assign a value to interestRate.
    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }

    // This method will print the interestRate varible in a message.
    public void getInterestRate()
    {
        System.out.println("The account interest rate is " + interestRate + "%");
    }

    // The next method is overwriting the method printTransaction.
    // This version shows the properties added in this class.
    public void printTransaction()
    {
        System.out.println("\n" + date.format(LocalDateTime.now()));
        System.out.println("Account owner/s: " + account_Owner.fName + " " + account_Owner.lName);
        System.out.println("Account number: " + accountNumber );
        System.out.println("Account type: " + accountType );
        System.out.println("Account Balance: " + accountBalance + "\n");
    }

    // The next method is overwriting the method deposit.
    // This version of the method is adding the double argument and also the interest rate porcent to the account balance.
    public void deposit(double add)
    {
        //System.out.println("Enter the amount you want to deposit: ");
        accountBalance = (accountBalance * ( interestRate / 100)) + accountBalance + add;
    }
}
