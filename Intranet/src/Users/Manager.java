package Users;

import java.io.Serializable;

import Activities.Order;
import Interfaces.Orderable;

public class Manager extends Employee implements Serializable, Orderable {
    @Override
    public void createOrder(Order ord) {

    }
}
