import java.util.Scanner;

public class Problem_J {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x;
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            x = in.nextInt();
            sum+=x;
        }
        System.out.println(sum);
    }
}
