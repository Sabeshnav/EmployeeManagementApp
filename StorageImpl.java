package pq6;

import java.util.HashSet;

import pq6.employeeExceptions.EmployeeAlreadyExistsException;
import pq6.employeeExceptions.EmployeeNotFoundException;

public class StorageImpl implements Storage {

    private int arraySize;
    private Employee[] employees;
    private static int lastIndex = 0;
    private HashSet<Integer> ids;

    public StorageImpl(int arraySize) {
        this.arraySize = arraySize;
        this.employees = new Employee[this.arraySize];
        this.ids = new HashSet<Integer>();
    }

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException{
        if(ids.contains(e.getEmpNo()))
        {
            throw new EmployeeAlreadyExistsException(e.getEmpNo());
        }
        this.employees[lastIndex] = e;
        this.lastIndex++;
        getEmployees();
            
    }
    public Employee[] getEmployees() {
        for (int i = 0; i < this.employees.length; i++) {
            System.out.println("here1 " + this.employees.length);
             System.out.println("here2 " + this.employees[i]);
            }
        return employees;
    }

    @Override
    public Employee getEmployee(int empNo) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getEmpNo() == empNo) {
                return this.employees[i];
            }
        }
        throw new EmployeeNotFoundException(empNo);
    }

}
