package ComparatorImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee emp1= new Employee();
        Employee emp2= new Employee();

        List<Employee> employeeList= new ArrayList<Employee>();

        emp1.setEmpId(100);
        emp1.setEmpFirstName("Dipanjan");
        emp1.setEmpLastName("Haldar");

        emp2.setEmpId(200);
        emp2.setEmpFirstName("Lopa");
        emp2.setEmpLastName("Sen");

        employeeList.add(emp1);
        employeeList.add(emp2);

        Collections.sort(employeeList,new EmployeeLastNameComparator());

        for(Employee e: employeeList)
        {
            System.out.println(e);
        }



    }
}
