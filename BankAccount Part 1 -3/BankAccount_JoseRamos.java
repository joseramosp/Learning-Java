/* Bank Account Lab
-- OBJECTIVE --
Create a regular bank account

  Name: Jose Ramos
  Date: March 26, 2019
*/

import java.util.*;

// Creating a class called bankAcount_JoseRamos
public class BankAccount_JoseRamos extends Person
{

    Scanner userInput = new Scanner(System.in);
    float openBalance;
    String accountOwner;
    int idOfAccount;

    public void setUpAcct()
    {
        System.out.println("Enter name and id: ");
        super.setInfo(userInput.next(),userInput.next(),userInput.nextInt());
        System.out.println("Enter client's open balance: ");
        openBalance = userInput.nextFloat();
        accountOwner = fName + " " + lName;
        idOfAccount = id;
    }

    public void deposit()
    {

    }

    public void withdraw()
    {

    }

    public void balance()
    {

    }

    public static void main(String args[])
    {
        BankAccount_JoseRamos client = new BankAccount_JoseRamos();
        client.setUpAcct();
        System.out.println(client.accountOwner);
        System.out.println(client.openBalance);
        //System.out.println(client.idOfAccount);

    }

}
