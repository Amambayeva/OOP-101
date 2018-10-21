package Task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {
    public static void main(String[] args) throws ParseException {
        Customer c = new Customer("Mika");
        c.setMember(true);
        c.setMemberType("Premium");
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1 = df.parse("10-21-2018");
        Visit visit1 = new Visit( c, d1);
        visit1.setProductExpense(100);
        visit1.setServiceExpense(200);
        System.out.println(visit1.toString());









    }
}
