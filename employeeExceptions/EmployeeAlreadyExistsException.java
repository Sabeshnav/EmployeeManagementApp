package pq6.employeeExceptions;

public class EmployeeAlreadyExistsException extends RuntimeException
{
    private int empNo;
    public EmployeeAlreadyExistsException(int empNo)
    {
        this.empNo = empNo;
    }
    public String toString()
    {
        return "Employee with " + this.empNo + " already exists";
    }
}
