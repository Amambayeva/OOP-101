public class Knight {
    public Position x;

    public Knight (Position x){
        this.x = x;
    }
    public boolean isLegelMove(Position y) {
        if(((Math.abs((int)x.letter)-Math.abs((int)y.letter))==1 && Math.abs(x.number)-Math.abs(y.number)==2)
                || ((Math.abs((int)x.letter)-Math.abs((int)y.letter))==2 && Math.abs(x.number)-Math.abs(y.number)==1)) {
            return true;
        }
        else return false;
    }

    public boolean isLegelMove(Position x, Position y) {
        if(((Math.abs((int)x.letter)-Math.abs((int)y.letter))==1 && Math.abs(x.number)-Math.abs(y.number)==2)
                || ((Math.abs((int)x.letter)-Math.abs((int)y.letter))==2 && Math.abs(x.number)-Math.abs(y.number)==1)) {
            return true;
        }
        else return false;
    }
}