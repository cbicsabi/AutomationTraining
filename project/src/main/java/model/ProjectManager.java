package model;


public class ProjectManager extends Employee implements Printable{
    public static String discipline = "Project Management Discipline";

    public ProjectManager(String name) {
        super(name);
    }

    protected void something() {

    }
    @Override
    protected String print(){
        return super.print();
    }
    private void doSomething() {
        System.out.println(this.print());
    }

    public static String getDiscipline() {
        return discipline;
    }


    public String printInstance() {
        return "Implementation for print instance for ProjectManager";
    }
    @Override
    protected String signDocument(){
        return "ProjManager" + this.getName();
    }

    public int compareTo(Employee o) {
        return 0;
    }
}
