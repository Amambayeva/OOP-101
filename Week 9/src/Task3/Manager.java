package Task3;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable, Cloneable {
    private int bonus;
    private Vector<Employee> employees = new Vector<>();

    public Manager() {
        super();
        bonus = 0;
        employees = null;
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, int bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String addEmployee() {
        return employees.toString();
    }

    public boolean equals(Manager m) {
        return (super.equals(m) && this.employees.equals(m.employees) && this.bonus == m.bonus);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < employees.size(); i++) {
            s += employees.get(i);
        }
        return super.toString() + s + "\n";
    }

    public int compareTo(Object obj) {
        Manager m = (Manager) obj;
        if (this.getSalary() > m.getSalary())
            return 1;
        if (this.getSalary() == m.getSalary())
            if (this.bonus > m.bonus)
                return 1;
        if (this.bonus == m.bonus)
            return 0;
        else return -1;

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





