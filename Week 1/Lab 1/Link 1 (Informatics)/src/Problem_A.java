import java.util.Scanner;
public class Problem_A {

    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int a;
        int b;
        double c;

        a = in.nextInt();
        b = in.nextInt();
        c = Math.sqrt((a*a + b*b));
        System.out.println(c);

    }
}