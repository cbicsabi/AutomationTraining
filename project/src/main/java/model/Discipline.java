package model;


public class Discipline {
    Employee[] employeeList = new Employee[10];

    private void iterateEmp() {
        for (Employee e : employeeList) {
            e.setSalary(120.5);
        }
    }
}
