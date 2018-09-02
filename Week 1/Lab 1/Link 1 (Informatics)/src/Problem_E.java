import java.util.Scanner;


public class Problem_E {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int v, t, s;
        v  = in.nextInt();
        t = in.nextInt();
        s = (v*t) % 109;
        System.out.println((s + 109) % 109);
    }
}
