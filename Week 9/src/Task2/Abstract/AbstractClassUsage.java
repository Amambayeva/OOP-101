package Task2.Abstract;


class Circle extends Shapes {
        double pi = 3.14;
        int radius;

        Circle(int radius, String name) {
            super(name);
            this.radius = radius;
        }

        // override
        public void print() {
            System.out.println("Circle has been successfully printed!");
        }

        public double getArea() {
            return (double) ((pi * radius * radius) / 2);
        }
    }

