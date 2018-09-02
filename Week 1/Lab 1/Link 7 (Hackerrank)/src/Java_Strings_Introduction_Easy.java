
import java.util.*;

public class Java_Strings_Introduction_Easy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();

        System.out.println(A.length() + B.length());
        String firstletterA = A.substring(0,1);
        String firstletterB = B.substring(0,1);
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
            System.out.println(firstletterA.toUpperCase() + A.substring(1,A.length()) + " " + firstletterB.toUpperCase() + B.substring(1,B.length()));

        }
    }
