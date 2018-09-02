import java.util.Scanner;

public class Problem_E {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if(a > b)
            System.out.println("1");
        else if (b > a)
            System.out.println("2");
        else if (b == a)
            System.out.println("0");

        }
    }

