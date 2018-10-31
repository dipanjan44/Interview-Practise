package SerializableImpl;

import ComparatorImpl.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeSerialization implements Serializable {

    private transient int empId;
    private String empLastName;
    private String empFirstName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    @Override
    public String toString()
    {
        return "Employee details " +getEmpId() + ":" +getEmpFirstName()+":" +getEmpLastName();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setEmpFirstName("Dipanjan");
        e1.setEmpLastName("Haldar");
        e1.setEmpId(100);

        try {
            FileOutputStream fileout = new FileOutputStream("employee.ser");

            try (ObjectOutputStream objOut = new ObjectOutputStream(fileout)) {

                objOut.writeObject(e1);
                objOut.close();
                fileout.close();

            }
        } catch (Exception e) {

        }
    }

}

