import java.util.Scanner;

public class Problem_C {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();

        if((a!=b && b == 1) || (a==1 && b!=a)){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}