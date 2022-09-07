package pq6;

public class Employee
{
    private int empNo;
    private double salary;
    private String firstName, lastName, city;

    public Employee(int empNo, double salary, String firstName, String lastName, String city)
    {
        this.empNo = empNo;
        this.city = city;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [empNo=" + this.empNo + ", first name=" + this.firstName + ", last name=" + this.lastName + ", salary="
        + this.salary + ", city=" + this.city + "]";
    }

    
}
