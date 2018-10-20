package Task1.Abstract;

public class Cylinder extends Just3DShapes {
    public double radius;
    public double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return PI *this.radius*this.radius*height;
    }
    public double surfaceArea(){
        return 2.0* PI *this.radius*(this.radius + this.height);
    }
}
