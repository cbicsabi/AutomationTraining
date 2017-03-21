import model.Employee;
import model.ProjectManager;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hey there!");
        Employee empl = new Employee("Jay");
        ProjectManager emp2 = new ProjectManager("Eva");
        System.out.println(ProjectManager.getDiscipline());

        System.out.println(10 & 8);
    }
}
