import java.util.Scanner;

public class Problem_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int sum = 0;
        int i = 2;
        x = in.nextInt();
        while(i <= Math.sqrt(x)){
            if(x % i == 0)
                sum++;
            i++;
        }
        if(Math.sqrt(x) == (int)Math.sqrt(x))
            System.out.println(sum + 2 + (sum - 1));
        else System.out.println(sum + 2 + (sum));

    }
}




