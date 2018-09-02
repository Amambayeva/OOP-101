import java.util.Scanner;

public class Problem_D {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        while(x % 2 == 0)
            x = x / 2;
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            }

        }




