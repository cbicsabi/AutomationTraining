package model;

/**
 * Created by cbicsabi on 3/26/2017.
 */
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String description, double balance, double interestRate) {
        super(description, balance);
        this.interestRate = interestRate;
    }



    public void setInterestRate(double interestRate) {this.interestRate = interestRate;}

    public double getInterestRate() {return interestRate;}

    public void print() {
        super.print();
        System.out.println("" + "Interest Rate: " + this.interestRate + "\n");
    }
}
