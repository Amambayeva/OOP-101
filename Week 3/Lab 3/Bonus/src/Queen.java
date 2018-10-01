import java.awt.Color;

public class Queen {
    public Position x;

    public Queen (Position x){
        this.x = x;
    }
    public boolean isLegalMove(Position y) {
        if(Rook.isLegalMove(x, y) || Bishop.isLegalMove(x, y)) {
            return true;
        }
        else return false;
    }
    public boolean isLegalMove(Position x, Position y) {
        if(Rook.isLegalMove(x, y) || Bishop.isLegalMove(x, y)) {
            return true;
        }
        else return false;
    }
}