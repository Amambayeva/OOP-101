public abstract class Piece{
    public String color;
    public Position p;

    public enum Color{
        WHITE,
        BLACK
    }

    public abstract boolean isLegalMove(Position x);

}