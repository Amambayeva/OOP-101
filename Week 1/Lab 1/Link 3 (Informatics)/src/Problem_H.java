import java.util.Scanner;

public class Problem_H {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }

        }
    }
}
