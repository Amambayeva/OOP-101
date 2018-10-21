package Task3;

public  class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double l){
        length = l;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)/2;
    }
    public String toString(){
        return "Rectangle's area: " + getArea() + "\n" + "Rectangle's perimeter: " + getPerimeter();
    }
    public boolean equals(Object o){
        if(o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            if (r.getLength() == length && r.width == width)
                return true;
            return false;
        }
        return false;
    }

}
