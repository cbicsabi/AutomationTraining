package model;

public class Employee {

    public Employee(String name) {
        this.name = name;
    }

    private String name = "";
    protected double salary;
    private boolean married;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    private void increaseSalary(double increase) {
        //salary = salary + increase;
        salary += increase;
    }

    private void testLogicalOperators() {
        boolean trueValue = true;
        boolean falseValue = false;

        if (falseValue & (++salary > 2)) {

        }

        if (falseValue && (++salary > 2)) {

        }

    }

    protected String print() {
        return "Name: " + this.name + " and salary: " + this.getSalary();
    }
}
