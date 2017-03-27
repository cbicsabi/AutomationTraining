package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by alanghel on 3/27/2017.
 */
public class Company {
    public static void main(String[] args) {
        Employee emp1 = new ProjectManager("PM");
        Employee emp2 = new Tester("Tester");

        Employee [] empList = new Employee[2];
        empList[0] = emp1;
        empList[1] = emp2;

        /*for(Employee e: empList) System.out.println(e.signDocument());
        Set empSet = new TreeSet<Employee>();
        empSet.add(emp1);
        empSet.add(emp2);

        System.out.println(empSet);*/

        Set stringSet = new TreeSet<String>();
        stringSet.add("a");
        stringSet.add("a");

        System.out.println(stringSet.size());
        System.out.println(stringSet);

        List empList2 = new ArrayList<Employee>();

        empList2.add(emp1);
        empList2.add(emp2);

        System.out.println(empList2);

        List stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("a");

        System.out.println(stringList);
        System.out.println(stringList.size());

        System.out.println(emp1);

        //empList2.sort();


    }
}