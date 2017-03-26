package model;

import org.iban4j.CountryCode;
import org.iban4j.Iban;

public class CurrentAccount {

    private boolean isOverdraft;
    protected double balance;
    protected String description;

    Iban IBAN = new Iban.Builder()
                .countryCode(CountryCode.RO)
                .nationalCheckDigit("49")
                .bankCode("RZBR")
                //.accountNumber("00234573201")
                .buildRandom();

    public CurrentAccount(String description, double balance, boolean isOverdraft) {
        this.description = description;
        this.balance = balance;
        this.isOverdraft = isOverdraft;
    }

    public CurrentAccount() {
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Iban getIBAN() {return IBAN;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public boolean isOverdraft(){return isOverdraft;}

    public void setOverdraft(boolean overdraft) {isOverdraft = overdraft;}

    public void print() {
        System.out.println("Account No: " + this.IBAN + "\n" +
                "" + "Account Desc: " + this.description + "\n" +
                "" + "Account Balance: " + this.balance + "\n" +
                "" + "Overdraft Enabled: " + this.isOverdraft + "\n");
    }
}
