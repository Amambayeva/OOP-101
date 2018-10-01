import java.util.Vector;

    class Person {
        private String name;

        public Person() {
            name = "";
        }

        public Person(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public boolean equals(Person person) {
            return this.name.equals(person.name);
        }

        public String toString() {
            return this.name + " ";
        }
    }

        class Employee extends Person {
            private double salary;
            private String insuranceNumber;
            private String specialSkills;

            public Employee() {
                super();
                salary = 0;
                specialSkills = "";
                insuranceNumber = "";
            }

            public Employee(String name, double salary, String insuranceNumber, String specialSkills) {
                super(name);
                this.salary = salary;
                this.insuranceNumber = insuranceNumber;
                this.specialSkills = specialSkills;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public double getSalary() {
                return this.salary;
            }

            public void setSpecialSkills(String specialSkills) {
                this.specialSkills = specialSkills;
            }

            public String getSpecialSkills() {
                return this.specialSkills;
            }

            public void setInsuranceNumber(String insuranceNumber) {
                this.insuranceNumber = insuranceNumber;
            }

            public String getInsuranceNumber() {
                return this.insuranceNumber;
            }

            public boolean equals(Employee employee) {
                return super.equals(employee) && (this.salary == employee.salary &&
                        this.specialSkills.equals(employee.specialSkills)) && (this.insuranceNumber == employee.insuranceNumber);
            }

            public String toString() {
                return "\n" + super.toString() + " | " + this.salary + " | " + this.insuranceNumber + " | " + this.specialSkills;
            }

            public int compareTo(Object obj) {
                Employee employee = (Employee) obj;
                if (this.salary > employee.salary)
                    return 1;
                else if (this.salary == employee.salary)
                    return 0;
                else return -1;
            }
        }

            class Manager extends Employee {
                private Vector<Employee> emp = new Vector<Employee>();
                private int bonus;

                public Manager() {
                    super();
                    bonus = 0;
                    emp = null;
                }

                public Manager(String name, double salary, String specialskills, String insuranceNumber, int bonus) {
                    super(name, salary, specialskills, insuranceNumber);
                    this.bonus = bonus;
                }

                public void setBonus(int bonus) {
                    this.bonus = bonus;
                }

                public int getBonus() {
                    return  this.bonus ;
                }

                public void addEmployee(Employee employee) {

                   emp.add(employee);
                }
                public String addEmployee(){
                    return emp.toString();
                }

                public boolean equals(Manager m) {
                    return super.equals(m) && this.emp.equals(m.emp) && this.bonus == m.bonus;
                }

                public String toString() {
                    String s = "";
                    for (int i = 0; i < emp.size(); i++) {
                        s += emp.get(i);
                    }
                    return super.toString() + s + " " ;
                }

                public int compareTo(Object obj) {
                    Manager mg = (Manager) obj;
                    if (this.getSalary() > mg.getSalary())
                        return 1;
                    else if (this.getSalary() == mg.getSalary()) {
                        if (this.bonus > mg.bonus)
                            return -1;
                        else return 0;
                    } else return -1;
                }
            }
        public class Problem_3{
            public static void main(String[] args){
                Person p = new Person("Meruert");
                System.out.println(p);
                Person q = (Person)p;
                System.out.println(p.equals(q));
                Employee employee = new Employee("Meruert", 3000, "12vcb", "analytical");
                System.out.println(employee);
                Manager m = new Manager("Malika", 3400, "564gdf", "organizational", 4000);
                System.out.println(m);
                m.addEmployee(employee);
                System.out.println(m);
                System.out.println("\r");
                System.out.println(m.getBonus());
                Employee employee1 = new Employee("Katya", 4000, "56sdfds", "musical");
                System.out.println(employee.toString());
                System.out.println(employee1.toString());
                System.out.println("\r");
                System.out.println(employee.equals(employee1));
            }
        }












