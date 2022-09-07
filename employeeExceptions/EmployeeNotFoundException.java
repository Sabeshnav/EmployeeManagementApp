package pq6.employeeExceptions;

public class EmployeeNotFoundException extends RuntimeException
{
    private int empNo;
    public EmployeeNotFoundException(int empNo)
    {
        this.empNo = empNo;
    }
    public String toString()
    {
        return "Employee with " + this.empNo + " does not exist.";
    }
}
