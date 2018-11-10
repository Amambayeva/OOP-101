package Users;

import Activities.Order;
import Base.Storage;


import java.io.Serializable;

public class Executor extends Employee implements Serializable {
    private int salary_bonus;

    public Executor() {
    }

    public Executor(String username, int password) {
        super(username, password);
    }

    public double getSalary() {
        return salary_bonus + getSalary();
    }

    public int getSalary_bonus() {
        return salary_bonus;
    }

    public boolean equals(Object obj) {
        Executor user = (Executor) obj;
        return user.getUsername().equals(this.username) && user.getPassword() == this.password;
    }

    public String toString() {
        return super.toString() + "Executor got Bonus: " + salary_bonus;
    }

    public void showOrders() {
        if (!Storage.orders.isEmpty()) {
            int i = 1;
            for (Order order : Storage.orders) {
                if (order.getExecutor() != null && order.getExecutor().equals(this))
                    System.out.println(++i + ") " + order);
            }
            if (i == 1) System.out.println("There is no done order, please go to work!!!");
        } else System.out.println("The order storage is empty");
    }

    public void orderIsDone() {
        for (Order order : Storage.orders)
            if (!order.isCompleted()) {
                int i;
                i = 1;
                System.out.println(++i + ") " + order);
                //System.err.println("");
                //if(in.readLine().equalsIgnoreCase("Y")) {
                salary_bonus+=400;
                order.completed(this);
                System.out.println("Order is completed");
            }
        System.out.println("The order storage is empty");
    }
}


