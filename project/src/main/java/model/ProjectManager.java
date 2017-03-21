package model;


public class ProjectManager extends Employee {
    public static String discipline = "Project Management Discipline";

    public ProjectManager(String name) {
        super(name);
    }

    private void doSomething() {
        System.out.println(this.print());
    }

    public static String getDiscipline() {
        return discipline;
    }
}
