import java.util.Scanner;

public class Problem_B {
    public static double f(double a, int n ){
        return Math.pow(a, n);
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        double a;
        int n;

        a = in.nextDouble();
        n = in.nextInt();
        double x = f(a,n);
        System.out.println(x);
    }
}
