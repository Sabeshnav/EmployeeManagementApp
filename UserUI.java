package pq6;

import java.util.Scanner;

import pq6.employeeExceptions.EmployeeAlreadyExistsException;
import pq6.employeeExceptions.EmployeeNotFoundException;

public class UserUI
{
    public static void main(String[] args)
    {
        System.out.println("How many employees do you want to add?");
        StorageFactory storageFactory = new StorageFactory(new Scanner(System.in).nextInt()); 
        for(int i = 0; i < storageFactory.getArraySize(); i++)
        {
            System.out.println("Employee no?");
            int empNo = new Scanner(System.in).nextInt();

            System.out.println("Employee salary?");
            double salary = new Scanner(System.in).nextDouble();

            System.out.println("Employee First name?");
            String firstName = new Scanner(System.in).next();

            System.out.println("Employee Last name?");
            String lastName = new Scanner(System.in).next();

            System.out.println("Employee city?");
            String city = new Scanner(System.in).next();

            Employee employee = new Employee(empNo, salary, firstName, lastName, city);

            acceptEmpDetailsAndStore(storageFactory.getStorage(), employee);
        }
        System.out.println("Enter empNo to search and retrieve?");
        displayEmpByEmpNo(storageFactory.getStorage(), new Scanner(System.in).nextInt());
        
    }

    public static void acceptEmpDetailsAndStore(Storage storage, Employee employee)
    {
        storage = (StorageImpl) storage;
        try {
            storage.addEmployee(employee);
        } catch (EmployeeAlreadyExistsException e) {
            System.out.println(e);
        }
        System.out.println("Employee added successfully!!");
    }

    public static void displayEmpByEmpNo(Storage storage, int empNo)
    {
        try {
            System.out.println(storage.getEmployee(empNo));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e);
        }
        storage = (StorageImpl) storage;
        
    }
}
