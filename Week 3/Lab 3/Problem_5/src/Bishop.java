public class Bishop extends Piece {

    public Bishop() {
    }
    public boolean isLegalMove(Position a, Position b) {
        int x = Math.abs(a.getX() - b.getX()), y = Math.abs(a.getY() - b.getY());
        return x == y;
    }
}