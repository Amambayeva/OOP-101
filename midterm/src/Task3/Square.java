package Task3;

public class Square extends Rectangle {

    public Square(){
    }
    public Square(double side){
        super(side,side);

    }
    public Square(double side, String color, boolean filled){
        super(side,side,color, filled);

    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public double getSide(){
        return width;
    }
    public void setWidth(double side){
        width = side;
    }
    public void setLength(double side){
        length = side;
    }
    public String toString(){
        return "Square's length: " + length;
    }
    public boolean equals(Object o){
        if(o instanceof Square){
            Square s=(Square)o;
            if(s.getLength()==getLength())
                return true;
            return false;
        }
        return false;
        }
    }



