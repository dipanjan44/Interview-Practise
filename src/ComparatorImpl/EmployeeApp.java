package ComparatorImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee emp1= new Employee();
        Employee emp2= new Employee();

        List<Employee> employeeList= new ArrayList<Employee>();

        Map<Integer,String> hm= new HashMap<>();
        hm.put(100,"Guava");
        hm.put(200,"Apple");
        hm.put(10,"Orange");
        hm.put(1,"Pineapple");


        HashMap<Integer,String> sortedMap=sortbyVal(hm);

        for(Map.Entry<Integer,String> m: sortedMap.entrySet())
        {
            System.out.println("Key==" +m.getKey() +" and value==" + m.getValue());
        }



        emp1.setEmpId(200);
        emp1.setEmpFirstName("Dipanjan");
        emp1.setEmpLastName("Haldar");

        emp2.setEmpId(100);
        emp2.setEmpFirstName("Lopa");
        emp2.setEmpLastName("Sen");

        employeeList.add(emp1);
        employeeList.add(emp2);

        Collections.sort(employeeList,new EmployeeLastNameComparator());

        for(Employee e: employeeList)
        {
            System.out.println(e);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpId()-o2.getEmpId();
            }
        });

        for(Employee e: employeeList)
        {
            System.out.println(e);
        }



    }

    public static HashMap<Integer, String> sortbyVal(Map<Integer,String> hm)
    {
        List<Map.Entry<Integer,String>> list= new LinkedList<Map.Entry<Integer,String>>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });

        HashMap<Integer,String> finalMap= new LinkedHashMap<>();

        for(Map.Entry<Integer,String> m: list)
        {
            finalMap.put(m.getKey(),m.getValue());
        }

        return finalMap;
    }

}
