package model;

public class CurrentAccount extends Account {

    private boolean isOverdraft;

    public CurrentAccount(String description, double balance, boolean isOverdraft){
        super(description, balance);
        this.isOverdraft = isOverdraft;

    }

    public boolean isOverdraft(){return isOverdraft;}

    public void setOverdraft(boolean overdraft) {isOverdraft = overdraft;}


    public void print() {
        super.print();
        System.out.println("" + "Overdraft Enabled: " + this.isOverdraft + "\n");
    }
}
