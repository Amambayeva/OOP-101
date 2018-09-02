import java.util.Scanner;

public class Problem_A {
    public static int f(int a, int b, int c, int d){
        return Math.min(Math.min(a,b), Math.min(c,d));
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        int x = f(a,b,c,d);
        System.out.println(x);
    }
}
