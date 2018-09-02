import java.util.*;

public class Problem_C {
    public static int Xor(int x, int y){

        if(x == 0 && y == 1)
            return 1;
        if(x == 1 && y == 0)
            return 1;
        else
            return 0;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        int res = Xor(x, y);
        System.out.println(res);


    }
}
