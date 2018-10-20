package Task2.Abstract;

class Tester{
   public static void main(String []args){
       Shapes rec = new Rectangle(2,3, "Rectangle");
       System.out.println("Area of rectangle: " + rec.getArea());
       rec.moveTo(1,5);
       Shapes circle = new Circle(2, "Circle");
       System.out.println("Area of circle " + circle.getArea());
       circle.moveTo(2,3);
   }
}
