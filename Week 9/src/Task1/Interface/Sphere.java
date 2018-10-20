package Task1.Interface;

import Task1.Interface.Just3DShapes;

public class Sphere implements Just3DShapes {
    public double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    public double volume(){
        return (4* PI *this.radius*this.radius*this.radius)/3.0;
    }
    public double surfaceArea(){
        return 4.0* PI *this.radius*this.radius;
    }
}
