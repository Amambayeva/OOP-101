public class King extends Piece {
    public static Position x;
    public static Color color;
   
    public boolean isLegalMove(Position x, Position y) {
        if(y.letter == (char)((int)x.letter + 1) || y.letter == (char)((int)x.letter - 1)) {
            if(y.number == x.number || y.number == x.number + 1 || y.number == x.number - 1)
                return true;
        }
        return false;
    }
    public boolean isLegalMove(Position y) {
        if(y.letter == (char)((int)x.letter + 1) || y.letter == (char)((int)x.letter - 1)) {
            if(y.number == x.number || y.number == x.number + 1 || y.number == x.number - 1)
                return true;
        }
        return false;
    }
}
