public class Problem_5 {

    public static void main(String[] args) {

        Piece bishop = new Bishop();
        System.out.println(bishop.isLegalMove(new Position(6, 4), new Position(5, 3)));

        Piece king = new King();
        System.out.println(king.isLegalMove(new Position(7, 4), new Position(8, 5)));

        Piece knight = new Knight();
        System.out.println(knight.isLegalMove(new Position(8, 5), new Position(7, 3)));

        Piece pawn = new Pawn();
        System.out.println(pawn.isLegalMove(new Position(5, 3), new Position(6, 4)));

        Piece queen = new Queen();
        System.out.println(queen.isLegalMove(new Position(7, 6), new Position(4, 1)));

        Piece rook = new Rook();
        System.out.println(rook.isLegalMove(new Position(5, 2), new Position(8, 3)));
    }
}