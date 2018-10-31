package SerializableImpl;

import ComparatorImpl.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class EmployeeDeserial implements Serializable {

    public static void main(String[] args) {

        Employee e1=null;

        try (FileInputStream fileIn = new FileInputStream("/Users/dipanjan/IdeaProjects/JavaPractise/employee.ser")) {
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            e1 = (Employee)objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Deserialization completed");
            System.out.println(e1.getEmpFirstName());

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }


    }


}
