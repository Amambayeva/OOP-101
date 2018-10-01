public class Rook extends Piece {
    public Position x;

    public Rook(Position x) {
        this.x = x;
    }
    public boolean isLegalMove(Position y) {
        if(y.letter==x.letter || y.number==x.number)
            return true;

        return false;
    }
    public boolean isLegalMove(Position x, Position y) {
        if(y.letter==x.letter || y.number==x.number)
            return true;

        return false;
    }
}