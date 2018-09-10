public class Student {

    public String id;
    public String name;
    public int year_of_study = 2017;
    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    public void increaseYearOfStudy()
    {
        this.year_of_study++;
    }

    public String StudentInf()
    {
        return this.name + " " + this.id + " " + this.year_of_study + "\n";
    }

    public static void main(String[] args) {

        Student Meruert = new Student("Meruert","17BD110334");
        System.out.println(Meruert.StudentInf());
        Meruert.increaseYearOfStudy();
        System.out.println(Meruert.StudentInf());
    }

}