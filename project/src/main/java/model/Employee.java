package model;

public abstract class Employee implements Comparable<Employee>{

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }


    private String name = "";

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected double salary = 100000;
    private boolean married;

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    private void increaseSalary(double increase) {
//        salary = salary + increase;
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

    protected abstract void something();

    protected abstract String signDocument();

}
