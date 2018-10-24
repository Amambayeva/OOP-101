package Task3;

import java.lang.Cloneable;
import java.lang.Comparable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tester {

    public static void main(String []args) throws CloneNotSupportedException, ParseException {

        Person per = new Person("Meruert");
        Person per3 = (Person)per.clone();
        System.out.println(per.hashCode());



        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1 = df.parse("10-23-1999"); // for example, today's date
        Date d2 = df.parse("02-09-1972");
        Manager m = new Manager("Mikash", 45, d1, "17BD11034", 700);
        Manager m2 = new Manager("Mika", 4, d2, "17BD110334", 700);
        System.out.println(m.hashCode());
        m2 = (Manager)m.clone();
        System.out.println(m2.hashCode());
        Employee em1 = new Employee("Mika", 4, d2, "17BD110334");
        Employee emp2 = new Employee("Mikashdsjdhg", 754387, d1, "kfdjhdfkgh");

//
//        Person per2 = new Person("Meruyert");
//        Employee employee = new Employee("Mika", 4, d1, "17BD110334");
//        Employee employee2 = new Employee("Mika", 5, d2, "17BD110334");
//        System.out.println(per.equals(per2));
//        System.out.println(per.toString());
//        System.out.println(per2.toString());
//        System.out.println(employee.equals(employee2));
//        System.out.println(employee.compareTo(employee2));
//        System.out.println(employee);
//        System.out.println(employee2);
//        Manager m = new Manager("Mika", 4, d1, "17BD110334", 700);
//        Manager m2 = new Manager("Mika", 4, d2, "17BD110334", 700);
//        m.addEmployee(employee);
//        m2 = (Manager)m.clone();
//        System.out.println(m.equals(employee));
//        System.out.println(m.compareTo(m2));
//        System.out.println(per3);
}
}
