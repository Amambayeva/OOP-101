import java.util.Scanner;
public class Problem_B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.println("The next number for the number " + x + " is " + (x + 1) + ".");
        System.out.println("The previous number for the number " + x + " is " + (x - 1) + ".");

    }
}

