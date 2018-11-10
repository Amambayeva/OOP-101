package Users;

import java.util.*;
import java.io.*;

public abstract class Employee extends User implements Serializable{

    private String email;
    private double salary;

    public Employee(){}

    protected Employee(String username, int password){this.username = username; this.password = password;}

    public void setSalary(double salary){this.salary = salary;}
    public double getSalary(){return salary;}

    public void setEmail(String email){this.email = email;}
    public String getEmail(){ return email;}

    public boolean equals(Object obj){
        Employee emp = (Employee)obj;
        return super.equals(obj) && emp.getSalary() == salary && emp.getEmail().equals(email);
    }
    public int compareTo(User user){
        if(super.compareTo(user) == 0){
            Employee emp = (Employee)user;
            if(emp.getSalary() > this.salary)
                return -1;
            if(emp.getSalary() < this.salary)
                return 1;
            return 0;
        }
        return super.compareTo(user);
    }

        public String toString() {
            return super.toString() + "Salary: " + getSalary() + "\n" + "E-mail: " + getEmail();
        }


}
