package ComparatorImpl;

public class Employee {

    private int empId;
    private String empFirstName;
    private String empLastName;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString()
    {
        return "Employee details " +getEmpId() + ":" +getEmpFirstName()+":" +getEmpLastName();
    }
}
