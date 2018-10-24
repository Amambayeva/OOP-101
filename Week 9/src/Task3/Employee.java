package Task3;

import java.util.Date;
import java.lang.Comparable;
import java.lang.Cloneable;
import java.util.Objects;


public class Employee extends Person implements Comparable, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
        super();
        salary = 0;
        insuranceNumber = "";
        hireDate = null;
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date gethireDate() {
        return this.hireDate;
    }

    public String toString() {
        return "Name: " + super.toString() + "\n" + "Salary: " + this.salary +
                "\n" + "Hire Date: " + this.hireDate + "\n" + "Insurance number: " + this.insuranceNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || (obj.getClass() != this.getClass()))
            return false;
        Employee emp = (Employee) obj;
        return (super.equals(emp) == super.equals(obj)) && ((emp.insuranceNumber == this.insuranceNumber)) &&
                (emp.hireDate == this.hireDate) && (emp.salary == this.salary);

    }
    public int hashCode(){
        return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
    }

    public int compareTo(Object obj) {
        Employee emp = (Employee) obj;
        if (this.salary > emp.salary)
            return 1;
        else if (this.salary == emp.salary)
            return 0;
        else return -1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





