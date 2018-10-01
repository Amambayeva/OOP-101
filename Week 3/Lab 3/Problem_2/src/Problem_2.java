import javafx.scene.shape.Shape;

abstract class Shapes {

    final static double PI = 3.14;

    public abstract double volume();

    public abstract double surfaceArea();
}

    class Cylinder extends Shapes {
        public double radius;
        public double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        public double volume() {
            System.out.print("The volume of cylinder: ");
            return Shapes.PI * this.radius * this.radius * this.height;
        }

        public double surfaceArea() {
            System.out.print("The area of surface of cylinder: ");
            return 2 * Shapes.PI * this.radius * this.radius + 2 * Shapes.PI * this.radius * this.height;
        }
    }

     class Sphere extends Shapes {
         public double radius;

         public Sphere(double radius) {
             this.radius = radius;
         }

         public double volume() {
             System.out.print("The volume of sphere: ");
             return (4 * Shapes.PI * this.radius * this.radius * this.radius) / 3.0;
         }

         public double surfaceArea() {
             System.out.print("The area of surface of sphere: ");
             return 4 * Shapes.PI * this.radius * this.radius;
         }
     }

     class Cube extends Shapes {
         public double side;

         public Cube(double side) {
             this.side = side;
         }

         public double volume() {
             System.out.print("The volume of cube: ");
             return this.side * this.side * this.side;
         }

         public double surfaceArea() {
             System.out.print("The area of surface of cube: ");
             return 6 * this.side * this.side;
         }
     }

     public class Problem_2 {
         public static void main(String[] args) {
             Cylinder cyl = new Cylinder(2, 3);
             System.out.println(cyl.volume());
             System.out.println(cyl.surfaceArea());
             Sphere sphere = new Sphere(4);
             System.out.println(sphere.volume());
             System.out.println(sphere.surfaceArea());
             Cube cube = new Cube(3);
             System.out.println(cube.volume());
             System.out.println(cube.surfaceArea());
         }
     }















