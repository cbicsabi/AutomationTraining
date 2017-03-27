package model;

/**
 * Created by alanghel on 3/27/2017.
 */
public class Tester extends Employee {
    public Tester(String name) {
        super(name);
    }

    protected void something() {

    }

    @Override
    protected String signDocument() {
        return "Tester" + this.getName();
    }

    public int compareTo(Employee o) {
        return 0;
    }
}
