import java.util.Scanner;

public class Problem_B {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        for(int i = a; i <= b; i++){
            if(i % d == c){
                System.out.print(i + " ");
            }
        }
    }
}
