package Task3;

public abstract class Shape {
    String color;
    boolean filled;
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }

    public boolean isFilled() {
        if(color!=null)
        return true;
        else return false;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Area: " + getArea() + "\n" + "Perimeter: " + getPerimeter() + "\n" + "Color: " + getColor();
    }
}

