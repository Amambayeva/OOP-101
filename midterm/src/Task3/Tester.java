package Task3;

public class Tester {
    public static void main(String []args){
        Circle c = new Circle(2);
        System.out.println(c.toString());
        System.out.println(c.isFilled());
        Square sq = new Square(3);
        System.out.println(sq.toString());
        System.out.println(sq.equals(c));


    }
}
