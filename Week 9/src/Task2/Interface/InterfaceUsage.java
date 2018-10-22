package Task2.Interface;


interface Shapes {
        
        void print();

        double getArea();
    }

    class Rectangle implements Shapes {
        int length;
        int width;

        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

       
        public void print() {
            System.out.println("Rectangle has been successfully printed!");
        }

       
        public double getArea() {
            return (double) (length * width);
        }
    }

    class Circle implements Shapes {
        double pi = 3.14;
        int radius;

        Circle(int radius) {
            this.radius = radius;
        }

        public void print() {
            System.out.println("Circle has been successfully printed!");
        }

        public double getArea() {
            return (double) ((pi * radius * radius) / 2);
        }
    }

    class Tester{
        public static void main(String []args){
            Shapes rec = new Rectangle(2,3);
            System.out.println("Area of rectangle: " + rec.getArea());

            Shapes circle = new Circle(3);
            System.out.println("Area of circle: " + circle.getArea());

        }
    }








