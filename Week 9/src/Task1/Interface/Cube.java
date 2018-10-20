package Task1.Interface;

public class Cube implements Just3DShapes {
    public double edge;
    public Cube(double edge){
        this.edge = edge;
    }
    public double volume(){
        return this.edge*this.edge*this.edge;
    }
    public double surfaceArea(){
        return 6*this.edge*this.edge;
    }
}
