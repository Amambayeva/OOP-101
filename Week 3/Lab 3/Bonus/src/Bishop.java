public class Bishop {
    public Position x;

    public Bishop(Position x) {
        this.x = x;
    }

    public void setPosition(Position x) {
        this.x = x;
    }

    public boolean isLegalMove(Position y) {
        if(((Math.abs((int)x.letter) + y.number) == (Math.abs((int)y.letter) + x.number))
                || ((Math.abs((int)x.letter) - y.number) == (Math.abs((int)y.letter) - x.number))) {
            return true;
        }
        return false;
    }

    public static boolean isLegalMove(Position x, Position y) {
        if(((Math.abs((int)x.letter) + y.number) == (Math.abs((int)y.letter) + x.number))
                || ((Math.abs((int)x.letter) - y.number) == (Math.abs((int)y.letter) - x.number))) {
            return true;
        }
        return false;
    }
}