public class King extends Piece{

    public King() {
    }
    public boolean isLegalMove(Position a, Position b) {
        int z = Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
        return z == 1 || z == 2;
    }
}