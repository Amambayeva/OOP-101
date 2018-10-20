package Task4;

public class Person implements Movable, Runnable, Swimmable {
    public int speed;

    private int x, y;

    private int xSpeed, ySpeed;

    public Person(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void hurryUp() {
        ySpeed++;
    }

    public void slowDown() {
        ySpeed--;
    }

    public void changeDirection() {
        xSpeed--;
        xSpeed++;
    }

    public String chooseTypeofRun(String k){

        if(ySpeed < SPEED){
            k = "active";
        }else if(ySpeed > SPEED){
            k = "passive";
        }
        return k;
    }
    public String chooseSwimmingType(String s){
        if(ySpeed > 0){
            s = "butterfly";
        }else if(xSpeed >  50){
            s = "freestyle";
        }
        return s;
    }
}
