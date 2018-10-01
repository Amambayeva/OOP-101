public class Rook extends Piece {

    public Rook() {
    }
    public boolean isLegalMove(Position a, Position b) {
        return (a.getX() == b.getX() || a.getY() == b.getY());
    }
}