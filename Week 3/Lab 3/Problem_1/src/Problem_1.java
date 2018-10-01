class Animal {
    public String name;
    public int size;
    public int age;

    public Animal() {
        name = "";
        size = 0;
        age = 0;
    }
    public Animal(String name, int size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }
    public String getInfo(){
        return "Name: " + this.name + "\n" + "Size: " + this.size + "\n"  + "Age: " + this.age;
    }
    public String getInfo(String addInfo) {
        return "Name: " + name + "\n" + "Size: " + size + "\n" + "Age: " + age + "\n" + "Additional Info: " + addInfo;
    }
}
    class Dog extends Animal {
        public String sound;

        public Dog() {
            super();
            sound = "";
        }

        public Dog(String name, int size, int age, String sound) {
            super(name, size, age);
            this.sound = sound;

        }
        public String getInfo() {
            return super.getInfo();
        }
        public String getInfo(String addInfo) {
            return super.getInfo(addInfo) +  "\n" + "Sound: " + this.sound;
        }
    }

    public class Problem_1 {
        public static void main(String[] args){
            Dog dog = new Dog("Chappa", 23, 2, "Huff!");
            System.out.println(dog.getInfo());
            System.out.println(dog.getInfo("My little dog Chappa is very funny:)"));
        }
    }


