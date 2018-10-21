package Task3;

public class Circle extends Shape {
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(Double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle's Area: " + getArea() + "\n" + "Circle's Perimeter: " + getPerimeter();
    }
    public boolean equals(Object o){
        if(o instanceof Circle){
            Circle c = new Circle();
            if(c.getRadius() == radius)
                return true;
            return false;
        }
        return false;
    }

}
