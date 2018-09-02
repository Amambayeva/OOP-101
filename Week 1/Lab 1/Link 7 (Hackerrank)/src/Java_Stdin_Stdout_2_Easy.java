import java.util.Locale;
import java.util.Scanner;

public class Java_Stdin_Stdout_2_Easy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int a = in.nextInt();
        double b = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
