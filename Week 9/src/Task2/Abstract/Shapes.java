package Task2.Abstract;

abstract class Shapes {
        private String objname = " ";

        Shapes(String name) {
            this.objname = name;
        }

        // non-abstract methods
        public void moveTo(int x, int y) {
            System.out.println(this.objname + " has been successfully  moved to " + "x = " + x + " and " + "y = " + y);
        }

        // abstract  methods that should be implemented by subclasses
        abstract public double getArea();

        abstract public void print();
    }
