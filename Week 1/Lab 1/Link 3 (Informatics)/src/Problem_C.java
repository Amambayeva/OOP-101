import java.util.Scanner;
import java.math.MathContext;
public class Problem_C {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b;


        a = in.nextInt();
        b = in.nextInt();

        int sqrt_a, sqrt_b;
        sqrt_a = (int)Math.ceil(Math.sqrt(a + 0.0));
        sqrt_b = (int)Math.sqrt(b);
        for(int i = sqrt_a; i <= sqrt_b; i++){

            System.out.print(i * i + " ");
        }
    }
}
