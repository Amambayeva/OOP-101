import java.util.Scanner;

public class Java_If_Else_Easy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        if(n % 2 != 0)
            System.out.println("Weird");

        else if((n % 2 == 0) && (n >= 2 && n <= 5))
            System.out.println("Not Weird");

        else if((n >=6 && n <= 20) && (n % 2 == 0))
            System.out.println("Weird");

        else if((n % 2 == 0) && (n > 20))
            System.out.println("Not Weird");


    }
}
