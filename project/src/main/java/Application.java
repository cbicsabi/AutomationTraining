import model.Employee;
import model.ProjectManager;
import model.Tester;

public class Application {
    public static void main(String[] args) {

        Employee emp1 = new ProjectManager("PM");
        Employee emp2 = new Tester("Tester");

        Employee [] empList = new Employee[2];
        empList[0] = emp1;
        empList[1] = emp2;

        //for(Employee e: empList) System.out.println(e.signDocument());
    }
}
