package Task2.Abstract;

class Rectangle extends Shapes {
        private int length;
        private int width;

        Rectangle(int length, int width, String name) {
            super(name);
            this.length = length;
            this.width = width;
        }

        public void print() {
            System.out.println("The Rectangle has been successfully printed!");
        }

        public double getArea() {
            return (double) (length * width);
        }
    }
