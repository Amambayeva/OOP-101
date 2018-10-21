package Task2;

import java.util.Date;

public class Visit{
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    public Visit(Customer c, Date date){
        customer = c;
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }
    public void setServiceExpense(double ser){
        serviceExpense = ser;
    }
    public double getServiceExpense(){
        return serviceExpense;
    }
    public void setProductExpense(double pro){
        productExpense = pro;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public double getTotalExpense(){
        serviceExpense-=serviceExpense*DiscountRate.getServiceDiscountRate(customer.getMemberType());
        productExpense-=productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());
        return serviceExpense + productExpense;
    }
    public String toString(){
        return customer.toString() + "\n" + "Date: " + date + "\n" + "Service Expense: " + serviceExpense + "\n" + "Product Expense: " +
                productExpense + "\n" + "Total Expense: " + getTotalExpense();
    }
}