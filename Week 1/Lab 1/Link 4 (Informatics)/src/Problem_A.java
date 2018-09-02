import java.util.Scanner;
import java.math.MathContext;
public class Problem_A {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int  b;



        b = in.nextInt();

        int  sqrt_b;

        sqrt_b = (int)Math.sqrt(b);
        for(int i = 1; i <= sqrt_b; i++) {

            System.out.print(i * i + " ");
        }
    }

}