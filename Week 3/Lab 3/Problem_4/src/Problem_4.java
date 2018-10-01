
class Person{
    String name;
    Person(){
        this.name = "Name";
    }
    Person(String _name){
        this.name = _name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Person's name is " + this.name;
    }
}

class Student extends Person{
    Student(){
        super();
    }
    Student(String name){
        super(name);
    }
    public String getName(){
        System.out.println("Student's name is " + name);
        return name;
    }
    public String toString(){
        return super.toString();
    }
}

class Manager extends Person{
    Manager(){
        super();
    }
    Manager(String name){
        super(name);
    }
    public String getName(){
        System.out.println("Manager's name is " + name);
        return name;
    }
    public String toString(){
        return super.toString();
    }
}

public class Problem_4 {
    public static void main(String[] args){
        Student studentObject = new Student("Meruert");
        Manager managerObject = new Manager("Joss");
        Person ref = studentObject;

        String s = ref.getName();
        System.out.println(s);
        System.out.println(ref + "\n");

        ref = managerObject;
        s = managerObject.getName();
        System.out.println(ref);
        System.out.println(s);
    }
}