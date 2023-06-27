package lab7.Examples;

import java.util.Date;
import java.util.Random;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        ownerName = ownerName.replace(" ", "");
        setAccountNumber(ownerName);
    }

    private void setAccountNumber(String name) {
        Date date = new Date();
        Random random = new Random();
        this.accountNumber = name + date.getTime() + random.nextInt();
        System.out.println(accountNumber);
    }

    public void makeTransaction(double transaction) {
        if(this.accountBalance + transaction >= 0) {
            this.accountBalance = this.accountBalance + transaction;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnerName() {
        return "Your account name is: " + ownerName;
    }
}
