import java.util.Scanner;

public class Problem_K {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        long i, n, count, b;
        n = in.nextLong();
        count = 0;
        for(i = 1; i <= n; i++){
            b = in.nextLong();
            count+=b;
        }
        System.out.println(count);
    }
}
