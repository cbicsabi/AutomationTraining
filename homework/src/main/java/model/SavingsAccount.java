package model;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class SavingsAccount extends CurrentAccount {

    private double interestRate;

    public SavingsAccount(String description, double balance, double interestRate) {
        this.description = description;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {this.interestRate = interestRate;}

    public double getInterestRate() {return interestRate;}

    @Override
    public void print() {
        System.out.println("Account No: " + this.IBAN + "\n" +
                "" + "Account Desc: " + this.description + "\n" +
                "" + "Account Balance: " + this.balance + "\n" +
                "" + "Interest Rate: " + this.interestRate + "\n");
    }
}
