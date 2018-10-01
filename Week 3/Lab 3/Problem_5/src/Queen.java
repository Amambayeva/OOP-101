public class Queen extends Piece {

    public Queen() {
    }
    public boolean isLegalMove(Position a, Position b) {
        Bishop bishop = new Bishop();
        Rook rook = new Rook();
        return rook.isLegalMove(a, b)  || 	bishop.isLegalMove(a, b);
    }
}