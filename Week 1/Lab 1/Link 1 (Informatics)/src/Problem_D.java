import java.util.Scanner;
public class Problem_D {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n, k;
        int c;
        n = in.nextInt();
        k = in.nextInt();
        c = k % n;
        System.out.println(c);
    }

}
