import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Teller_JoseRamos
{
    String name;
    String dateProcessed;

    public Teller_JoseRamos()
    {
        
    }

    public Teller_JoseRamos(String name, String dateProcessed)
    {
        this.name = name;
        this.dateProcessed = dateProcessed;
    }

    public void generateAccounts()
    {
        BankAccount_JoseRamos richGuy = new BankAccount_JoseRamos();
        BankAccount_JoseRamos poorGuy = new BankAccount_JoseRamos();
        Savings_JoseRamos cheapGuy = new Savings_JoseRamos();
        Checking_JoseRamos bigSpender = new Checking_JoseRamos();
        Savings_JoseRamos client1 = new Savings_JoseRamos();
        Checking_JoseRamos client2 = new Checking_JoseRamos();

        richGuy.setAccount("Rich", "Guy", 10001, 25000);
        richGuy.deposit(30000);
        richGuy.withdraw(7500);
        richGuy.printTransaction();

        poorGuy.setAccount("Poor", "Guy", 10002, 20);
        poorGuy.deposit(30);
        poorGuy.withdraw(39.85);
        poorGuy.printTransaction();

        cheapGuy.setAccount("Cheap", "Guy", 10003, 5000);
        cheapGuy.setInterestRate(3);
        cheapGuy.deposit(30000);
        cheapGuy.withdraw(500);
        cheapGuy.printTransaction();
        cheapGuy.getInterestRate();

        bigSpender.setAccount("Big", "Spender", 10004, 6780);
        bigSpender.deposit(500);
        bigSpender.withdraw(4000);
        bigSpender.setFee(40);
        bigSpender.printTransaction();
        bigSpender.getFee();

        client1.setAccount("Jose", "Ramos", 10005, 250000);
        client1.setInterestRate(5);
        client1.deposit(20000);
        client1.withdraw(2500);
        client1.printTransaction();
        client1.getInterestRate();

        client2.setAccount("Mike", "Tyson", 10006, 1000);
        client2.setFee(40);
        client2.deposit(2000);
        client2.printTransaction();
        client2.withdraw(3001);
        client2.printTransaction();
        client2.getFee();

        // cheapGuy.deposit(5000);
        // cheapGuy.printTransaction();

    }
}
