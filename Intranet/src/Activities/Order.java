package Activities;

import Users.Employee;
import Users.Executor;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    private String orderTitle;

    private Employee commander;
    private Executor executor;
    private Date executionDate;
    private boolean completed = false;
    private String orderTextBody;
    private String textBody;

    public Executor getExecutor() {return executor;}

    public void setOrderTextBody(String textBody){ this.textBody = textBody;}
    public String getOrderTextBody() { return this.orderTextBody;}
    public void setOrderTitle(String orderTitle){ this.orderTitle = orderTitle;}
    public String getOrderTitle(){return orderTitle;}
    public void setCommander(Employee commander){this.commander = commander;}
    public Employee getCommander(){return commander;}
    public Boolean isCompleted(){return completed;}
    public boolean equals(Object obj){
        Order o = (Order)obj;
        return o.getOrderTextBody().equals(this.orderTextBody)&&
                o.getCommander().equals(this.commander) &&
                o.getOrderTitle().equals(this.orderTitle) &&
                o.isCompleted().equals(completed);
    }
    public int hashcode(){
        return super.hashCode();
    }
    public String confirmation() {
        if(completed)
            return "Activities.Order is completed!";
        return "Waiting...";
    }
    public void completed(Executor executor){
        completed = true;
        this.executor = executor;
        //Date d = new Date();
        executionDate = new Date();
    }
    public String toString(){
      return "Activities.Order: " + orderTitle + "\nActivities.Order's body: " + orderTextBody + "\nCommander: " + commander.getUsername()+
                "\nConfirmation state: " + confirmation() + "\nExecution Date: " + executionDate;
    }
}
