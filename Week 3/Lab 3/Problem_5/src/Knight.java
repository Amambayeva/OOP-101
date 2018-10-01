public class Knight extends Piece {

    public Knight() {
    }
    public boolean isLegalMove(Position a, Position b) {
        int x = Math.abs(a.getX() - b.getX()), y = Math.abs(a.getY() - b.getY());
        int z = x + y;
        return x > 0 && y > 0 && z == 3;
    }
}