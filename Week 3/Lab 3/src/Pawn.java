public class Pawn extends Piece {

    public Pawn() {
    }
    public boolean isLegalMove(Position a, Position b) {
        if (a.getY() == b.getY() && b.getX() - a.getX() == 1)
            return true;
        return false;
    }

}