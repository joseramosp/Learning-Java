// Calling all the packages that are going to be needed.
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Creating a class called Checking_JoseRamos that extends from BankAccount_JoseRamos.
public class Checking_JoseRamos extends BankAccount_JoseRamos
{
    // Creating two variables to add more properties to this class.
    String accountType = "Checking"; // What type of account it is.
    double bouncedCheckFee = 35;     // How much is the fee for a bounced check.

    // Creating a method to set a new value for bouncedCheckFee.
    public void setFee()
    {
        System.out.println("Enter new fee amout for bounced checks: ");
        bouncedCheckFee = userInput.nextDouble();
    }

    // Creating a method that takes an double argument and will assign it to bouncedCheckFee.
    public void setFee(double fee)
    {
        bouncedCheckFee = fee;
    }

    // Creating a method that will print the value of bouncedCheckFee on a message.
    public void getFee()
    {
        System.out.println("The account fee for bounced checks is: " + bouncedCheckFee);
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

    // The next method is overwriting the method withdraw.
    // This method will deduct bounced check fee from accountBalance if the value of deduct is grater than accountBalance.
    public void withdraw(double deduct)
    {
        if(deduct <= accountBalance)
        {
            // Subtracting deduct from accountBalance.
            accountBalance = accountBalance - deduct;
        }
        else
        {
            // Subtracting bouncedCheckFee from accountBalance.
            accountBalance = accountBalance - bouncedCheckFee;
            System.out.println("Bounced check fee applied");
        }
    }
}
