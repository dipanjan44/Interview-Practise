package ComparatorImpl;

import java.util.Comparator;

public class EmployeeLastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getEmpLastName()==e2.getEmpLastName())
        {
            return 0;
        }

        if(e1.getEmpLastName()==null||e2.getEmpLastName()==null)
        {
            return -1;
        }

        else
            return e1.getEmpLastName().compareTo(e2.getEmpLastName());
    }
}
