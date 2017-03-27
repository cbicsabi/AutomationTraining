package model;

import org.iban4j.CountryCode;
import org.iban4j.Iban;

public class Account {

    private double balance;
    private String description;
    private Iban IBAN;

    Account(String description, double balance) {
        this.description = description;
        this.IBAN = Iban.random(CountryCode.RO);
        this.balance = balance;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Iban getIBAN() {return IBAN;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public void print() {
        System.out.println("Account No: " + this.IBAN + "\n" +
                "" + "Account Desc: " + this.description + "\n" +
                "" + "Account Balance: " + this.balance);
    }
}
