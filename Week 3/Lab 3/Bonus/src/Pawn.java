public class Pawn {
    public Position x;

    public Pawn (Position x){
        this.x = x;
    }
    public boolean isLegalMove(Position y) {
        if((Math.abs((int)x.letter - (int)y.letter) == 1 && Math.abs(x.number - y.number) == 1)
                || ((int)x.letter + (int)y.letter) == (x.number + y.number)) {
            return true;
        }
        return false;
    }
}