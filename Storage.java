package pq6;

import pq6.employeeExceptions.EmployeeAlreadyExistsException;
import pq6.employeeExceptions.EmployeeNotFoundException;

public interface Storage
{
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    Employee getEmployee(int empNo) throws EmployeeNotFoundException;
}
